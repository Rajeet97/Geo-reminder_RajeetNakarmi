package com.example.geo_reminder.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.geo_reminder.R;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

    }
//for open new activity
    public void btnClick(View view) {
        startActivity(new Intent(MapActivity.this,DashboardActivity.class));
    }
}
