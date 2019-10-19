package com.example.zypher.Retrofit;

import com.example.zypher.Model.Main;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterfce {

    @GET("getHomePage")
    Call<Main> getBooksResponse();
}
