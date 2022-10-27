package com.example.aplikasiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.aplikasiactivity.util.PreferenceHelper;



public class FirstActivity extends AppCompatActivity {
    PreferenceHelper preferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button btnLogout = findViewById(R.id.btnKeluar);
        preferenceHelper = PreferenceHelper.getInstance(getApplicationContext());

        TextView txtFirst = findViewById(R.id.textFirstActivity);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preferenceHelper.userLogout();
                startActivity(new Intent(FirstActivity.this, HomeActivity.class));
            }
        });



  //      Intent intent = getIntent();
   //     String nama = intent.getStringExtra("nama");

        txtFirst.setText(preferenceHelper.getNama());
    }
}