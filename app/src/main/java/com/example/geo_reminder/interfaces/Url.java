package com.example.geo_reminder.interfaces;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Url {
    private static Retrofit retrofit;
    public static String cookie = "";

    public static APIEndPoints getEndPoints(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    //.baseUrl("http://10.0.2.2:4000/")
                    .baseUrl("http://192.168.0.107:4000/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(APIEndPoints.class);
    }
}


