package com.example.covid_19_app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class abt_us extends AppCompatActivity {
    Button abt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abt_us);

        abt = findViewById(R.id.abt_us);

        abt.setOnClickListener(v -> {
            Intent intent = new Intent(abt_us.this, dev_info.class);
            startActivity(intent);
        });
    }
}