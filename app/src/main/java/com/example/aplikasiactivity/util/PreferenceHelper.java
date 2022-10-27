package com.example.aplikasiactivity.util;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {
    private static PreferenceHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private PreferenceHelper(Context context) {
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("name.example.myapplication", Context.MODE_PRIVATE);
    }

    public static PreferenceHelper getInstance(Context context) {
        if (INSTANCE == null){
            INSTANCE = new PreferenceHelper(context);
        }
        return INSTANCE;
    }

    public SharedPreferences preferences(){
        return sharedPreferences;
    }

    public void setLogin(boolean islogin){
        sharedPreferences.edit().putBoolean("isLogin", islogin).apply();
    }

    public void userLogout(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

    public boolean isLogin(){
        return sharedPreferences.getBoolean("isLogin", false);
    }

    public void setNama (String nama){
        sharedPreferences.edit().putString("nama", nama).apply();
    }

    public String getNama(){
        return sharedPreferences.getString("nama", "Pak Doe");
    }
}
