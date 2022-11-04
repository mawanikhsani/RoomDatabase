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

    //untuk menyimpan data yg sudah diinputkan
    public void setLogin(boolean islogin){
        sharedPreferences.edit().putBoolean("isLogin", islogin).apply();
    }

    public boolean isLogin(){
        return sharedPreferences.getBoolean("isLogin", false);
    }

    public void userLogout(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

    //untuk menyimpan data username yg sudah diinputkan
    public void setUsername(String isNama){
        sharedPreferences.edit().putString("Username", isNama).apply();}


    //untuk memanggil atau mendapatkan data username yang sudah diinputkan
    public String getUsername(){return sharedPreferences.getString("Username","");}


    //untuk menyimpan data nama yg sudah diinputkan
    public void setNama (String nama){
        sharedPreferences.edit().putString("nama", nama).apply();
    }


    //untuk memanggil atau mendapatkan data nama yang sudah diinputkan
    public String getNama(){
        return sharedPreferences.getString("nama", "Pak Doe");
    }


    //untuk menyimpan data password yg sudah diinputkan
    public void setPassword(String isPassword){
        sharedPreferences.edit().putString("Password", isPassword).apply();}


    //untuk memanggil atau mendapatkan data password yang sudah diinputkan
    public String getPassword(){return sharedPreferences.getString("Password", "");}

}
