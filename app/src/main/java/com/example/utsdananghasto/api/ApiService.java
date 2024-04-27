package com.example.utsdananghasto.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    String TOKEN = "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";
    @GET("search/users")
    @Headers("Authorization: Bearer " + TOKEN)
    Call<Response> callUser(@Query("q") String username);
    @GET("users/{username}")
    Call<Items> callDetailUser(@Path("username") String username);

}
