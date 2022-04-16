package com.emericoapp.upload.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiConstants {

    //==== Base Url
    public static String BASE_URL = "http://52.78.58.127:8000";

    //==== End point
    public static final String ENDPOINT = "/fileUpload";

    //===== Retrofit Client
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
