package com.example.covid_19_app;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Prevention extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);

        TextView textView = findViewById(R.id.handwash);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_1 = findViewById(R.id.mask);
        textView_1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_2 = findViewById(R.id.prevention);
        textView_2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView_3 = findViewById(R.id.distance);
        textView_3.setMovementMethod(LinkMovementMethod.getInstance());
    }
}