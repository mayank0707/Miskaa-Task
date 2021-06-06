package com.example.room_database;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApi {

    @GET("region/asia")
    Call<ArrayList<Data>> getData();
}
