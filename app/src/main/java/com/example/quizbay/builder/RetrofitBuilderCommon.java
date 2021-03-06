package com.example.quizbay.builder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilderCommon {
    private RetrofitBuilderCommon() {}
    private volatile static Retrofit instance;
    public static Retrofit getInstance() {
        if(instance == null) {
            synchronized (RetrofitBuilderCommon.class) {
                if(instance == null) {
                    instance = new Retrofit.Builder()
                            .baseUrl("http://10.177.1.104:8085/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(new OkHttpClient())
                            .build();
                }
            }
        }
        return instance;
    }
}
