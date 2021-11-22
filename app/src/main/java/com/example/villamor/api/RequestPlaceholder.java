package com.example.villamor.api;

import com.example.villamor.pojos.Login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestPlaceholder {

    @POST("Login")
    Call<Login> login(@Body Login login);
}
