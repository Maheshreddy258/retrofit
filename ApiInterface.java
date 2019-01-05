package com.example.mahesh.retrrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("view_leads_employees/4")
    Call<UserList> getServiceResponse();
}
