package com.example.geo_reminder.BLL;

import com.example.geo_reminder.interfaces.Url;
import com.example.geo_reminder.models.LongLat;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Response;

import static com.example.geo_reminder.interfaces.Url.cookie;

public class AddTaskBLL {
    private LongLat longLat;
    private boolean isSuccess = false;

    public AddTaskBLL(LongLat longLat)
    {
        this.longLat = longLat;
    }

    public boolean addTask() {
        try {
            Response<ResponseBody> body = Url.getEndPoints().postlonglat(cookie, longLat).execute();
            if(body.isSuccessful()){
                isSuccess = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }
}
