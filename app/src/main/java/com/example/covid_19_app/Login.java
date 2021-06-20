package com.example.covid_19_app;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import java.util.Random;

public class Login extends AppCompatActivity {
    public Button button;

    ImageView bell;
    ImageView info;


    public Button button_new,button_case;

    ImageView flags;
    Spinner spinner;

    String [] mlist = {"Hang in there, as better times are ahead",
                        "Stay Home, Stay Safe",
                        "Live life to the fullest, focus on the positive",
                        "The secret of change is to focus all of your energy, not on fighting the old, but on building the new",
                        "Ultimately, the greatest lesson that COVID-19 can teach humanity is that we are all in this together",
                        "Life doesn't get easier or more forgiving, we get stronger and more resilient",
                        "In the face of adversity, we have a choice. We can be bitter, or we can be better",
                        "The secret of crisis management is not good vs bad, it’s preventing the bad from getting worse",
                        "Life is short, but it is wide. This too shall pass",
                        "Hard times don’t create heroes. It is during the hard times when the hero within us is revealed."};
    Random random = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        bell = findViewById(R.id.bell);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("My Notification", "My Notification", NotificationManager.IMPORTANCE_HIGH);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        bell.setOnClickListener(v -> {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(Login.this, "My Notification");
            builder.setContentText(mlist[random.nextInt(mlist.length-1)]);
            builder.setSmallIcon(R.drawable.icon);
            builder.setAutoCancel(true);
            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(Login.this);
            managerCompat.notify(1, builder.build());
        });

        button = findViewById(R.id.prev);

        button_new = findViewById(R.id.vaccine);

        button_case = findViewById(R.id.text_case);

        spinner = findViewById(R.id.spinner);

        flags = findViewById(R.id.flag);

        info = findViewById(R.id.info);


        spinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,
                CountryData.countryNames));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                flags.setImageResource(CountryData.countryFlag[spinner.getSelectedItemPosition()]);

                if (adapterView.getItemAtPosition(i).equals("Chose Category")) {
                    //nothing
                } else {
                    String item = adapterView.getItemAtPosition(i).toString();

                    Toast.makeText(adapterView.getContext(), "SELECTED " + item, Toast.LENGTH_SHORT).show();

                    if (adapterView.getItemAtPosition(i).equals("IND")) {
                        Intent intent = new Intent(Login.this, item_select.class);
                        startActivity(intent);
                    } else if (adapterView.getItemAtPosition(i).equals("USA")) {
                        Intent intent = new Intent(Login.this, item_select_usa.class);
                        startActivity(intent);
                    } else if (adapterView.getItemAtPosition(i).equals("UK")) {
                        Intent intent = new Intent(Login.this, item_select_uk.class);
                        startActivity(intent);
                    } else if (adapterView.getItemAtPosition(i).equals("JAP")) {
                        Intent intent = new Intent(Login.this, item_select_japan.class);
                        startActivity(intent);
                    } else if (adapterView.getItemAtPosition(i).equals("CHN")) {
                        Intent intent = new Intent(Login.this, item_select_china.class);
                        startActivity(intent);
                    } else if (adapterView.getItemAtPosition(i).equals("AUS")) {
                        Intent intent = new Intent(Login.this, item_select_aus.class);
                        startActivity(intent);
                    } else if (adapterView.getItemAtPosition(i).equals("BRA")) {
                        Intent intent = new Intent(Login.this, item_select_brazil.class);
                        startActivity(intent);
                    } else if (adapterView.getItemAtPosition(i).equals("DEU")) {
                        Intent intent = new Intent(Login.this, item_select_deu.class);
                        startActivity(intent);
                    } else if (adapterView.getItemAtPosition(i).equals("FRA")) {
                        Intent intent = new Intent(Login.this, item_select_fra.class);
                        startActivity(intent);
                    } else if (adapterView.getItemAtPosition(i).equals("RUS")) {
                        Intent intent = new Intent(Login.this, item_select_rus.class);
                        startActivity(intent);
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        button.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Prevention.class);
            startActivity(intent);
        });

        button_new.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Vaccination.class);
            startActivity(intent);
        });
        button_case.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, Case101.class);
            startActivity(intent);
        });

        info.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, abt_us.class);
            startActivity(intent);
        });

    }
}