package com.example.mahesh.retrrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    public static Retrofit retrofit = null;


  public static Retrofit getClient() {


      if (retrofit==null) {
          retrofit = new Retrofit.Builder()
                  .baseUrl("http://soccel.com/crm/Webservice/")
                  .addConverterFactory(GsonConverterFactory.create())

                  .build();
      }

         return retrofit;
        }

    }

