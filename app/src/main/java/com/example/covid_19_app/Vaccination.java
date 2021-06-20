package com.example.covid_19_app;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Vaccination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccination);

        TextView textView = findViewById(R.id.vaccine101);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_1 = findViewById(R.id.Indiav);
        textView_1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_2 = findViewById(R.id.USv);
        textView_2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_3 = findViewById(R.id.UKv);
        textView_3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_4 = findViewById(R.id.Japanv);
        textView_4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_6 = findViewById(R.id.Australiav);
        textView_6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_8 = findViewById(R.id.Germanyv);
        textView_8.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_9 = findViewById(R.id.FranceV);
        textView_9.setMovementMethod(LinkMovementMethod.getInstance());

    }
}