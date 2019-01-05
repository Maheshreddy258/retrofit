package com.example.mahesh.retrrofit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<UserList.UserDatum> android;
    private static ClickListener clickListener;

    public RecyclerAdapter( List<UserList.UserDatum>
                                android) {
        this.android = android;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder viewHolder, int i) {

        viewHolder.tv_typeofcall.setText(android.get(i).typeofcall);
        viewHolder.tv_comment.setText(android.get(i).comment);
        viewHolder.tv_customername.setText(android.get(i).customerName);
        viewHolder.tv_name.setText(android.get(i).name);
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{
        private TextView tv_comment,tv_customername,tv_typeofcall,tv_name;
        public ViewHolder(View view) {
            super(view);

            tv_comment = (TextView)view.findViewById(R.id.tv_comment);
            tv_customername = (TextView)view.findViewById(R.id.tv_customername);
            tv_typeofcall = (TextView)view.findViewById(R.id.tv_typeofcall);
            tv_name = (TextView)view.findViewById(R.id.tv_name);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);

        }
        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(), v);
        }

        @Override
        public boolean onLongClick(View v) {
            clickListener.onItemLongClick(getAdapterPosition(), v);
            return false;
        }
    }
    public void setOnItemClickListener(ClickListener clickListener) {
        RecyclerAdapter.clickListener = clickListener;
    }

    public interface ClickListener {
        void onItemClick(int position, View v);
        void onItemLongClick(int position, View v);
    }

}
