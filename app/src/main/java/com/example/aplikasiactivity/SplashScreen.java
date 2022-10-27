package com.example.aplikasiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.aplikasiactivity.util.PreferenceHelper;

public class SplashScreen extends AppCompatActivity {
    public static final String TAG = "SplashScreen";
    PreferenceHelper preferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        int splashinterval = 10000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, HomeActivity.class));
            }
        }, splashinterval);

        preferenceHelper = PreferenceHelper.getInstance(getApplicationContext());

        Boolean isLoggedIn = preferenceHelper.isLogin();
        if(isLoggedIn){
            startActivity(new Intent(getApplicationContext(),FirstActivity.class));
        finish();}
        else{
            startActivity(new Intent(getApplicationContext(),HomeActivity.class));
            finish();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }
}