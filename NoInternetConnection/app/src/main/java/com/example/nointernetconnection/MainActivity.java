package com.example.nointernetconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.ConnectionService;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button tButton;
    RelativeLayout nLayout;
    RelativeLayout iLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        iLayout = findViewById(R.id.internetLayout);
        nLayout = findViewById(R.id.noInternetLayout);
        tButton = findViewById(R.id.try_again_button);

    }

    private boolean isNetworkAvailable(){

        return false;
    }
}