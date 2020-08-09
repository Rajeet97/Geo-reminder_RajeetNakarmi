package com.example.geo_reminder.StrictMod;

import android.os.StrictMode;

public class StrictMod {
    public static void StrictMode()
    {
        StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }
}


