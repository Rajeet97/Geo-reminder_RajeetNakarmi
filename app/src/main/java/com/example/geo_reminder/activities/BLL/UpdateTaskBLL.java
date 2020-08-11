package com.example.geo_reminder.activities.BLL;


import com.example.georeminder.interfaces.Url;
import com.example.georeminder.models.LongLat;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class UpdateTaskBLL {
    private LongLat longLat;
    private String longlatId;
    private String cookie;
    private boolean isSuccess;

    public UpdateTaskBLL(LongLat longLat, String longlatId, String cookie) {
        this.longLat = longLat;
        this.longlatId = longlatId;
        this.cookie = cookie;
    }


    public boolean updateTask() {
        Call<Void> voidCall = Url.getEndPoints().updatelonglat(cookie, longlatId, longLat);
        try {
            Response<Void> response = voidCall.execute();

            if (response.isSuccessful()) {
                isSuccess = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }

}
