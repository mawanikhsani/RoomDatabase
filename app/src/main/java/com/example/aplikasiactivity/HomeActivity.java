package com.example.aplikasiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aplikasiactivity.util.PreferenceHelper;

public class HomeActivity extends AppCompatActivity {

    private Button btnActivity, btnFragment;
    private EditText etNama;
    PreferenceHelper preferenceHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        preferenceHelper = PreferenceHelper.getInstance(getApplicationContext());

        btnActivity = findViewById(R.id.btnActivity);
        btnFragment = findViewById(R.id.btnFragment);
        etNama = findViewById(R.id.etNama);

        btnActivity.setOnClickListener(view -> {
            preferenceHelper.setLogin(true);
            preferenceHelper.setNama(etNama.getText().toString());
            Intent homeIntent = new Intent(HomeActivity.this, FirstActivity.class);
            // homeIntent.putExtra("nama", etNama.getText().toString());
            startActivity(homeIntent);
        });

            btnFragment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent secondIntent = new Intent(HomeActivity.this, MainActivity2.class);
                    startActivity(secondIntent);
                }
            });
        }
    }
