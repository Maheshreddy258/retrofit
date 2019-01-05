package com.example.mahesh.retrrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView responseText;
    ApiInterface apiInterface;
    RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        responseText = (TextView) findViewById(R.id.responsetest);
        recyclerView =(RecyclerView)findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<UserList> call=apiInterface.getServiceResponse();
        call.enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, final Response<UserList> response) {
                if(response.isSuccessful()){
                    responseText.setText(response.body().userData.get(0).address);
                    adapter = new RecyclerAdapter(response.body().userData);
                    recyclerView.setAdapter(adapter);

                    adapter.setOnItemClickListener(new RecyclerAdapter.ClickListener() {
                        @Override
                        public void onItemClick(int position, View v) {
                            Toast.makeText(MainActivity.this, ""+response.body().userData.get(position).customerName, Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onItemLongClick(int position, View v) {
                            Toast.makeText(MainActivity.this, ""+response.body().userData.get(position).customerName, Toast.LENGTH_SHORT).show();

                        }
                    });


                }else{
                    Toast.makeText(MainActivity.this, "response error", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<UserList> call, Throwable t) {
                Toast.makeText(MainActivity.this, "service response in failed....", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


