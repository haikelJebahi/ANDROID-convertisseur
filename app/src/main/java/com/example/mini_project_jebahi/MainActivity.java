package com.example.mini_project_jebahi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.service.controls.templates.TemperatureControlTemplate;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = findViewById(R.id.distance);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(getApplicationContext(),Distance.class);
                startActivity(intent);
            }
        });

        final Button button2 = findViewById(R.id.masse);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(getApplicationContext(),Masse.class);
                startActivity(intent);
            }
        });

        final Button button3 = findViewById(R.id.temperature);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(getApplicationContext(), Temperature.class);
                startActivity(intent);
            }
        });

        final Button button4 = findViewById(R.id.implicit);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent intent = new Intent(getApplicationContext(), ImplicitIntent.class);
                startActivity(intent);
            }
        });

    }
}
