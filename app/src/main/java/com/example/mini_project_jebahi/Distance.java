package com.example.mini_project_jebahi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Distance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.distance_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.distance_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);

        final Button button = findViewById(R.id.convertir);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //RECUPERATION CHAMP TEXTE
                EditText tonEdit = (EditText)findViewById(R.id.nb);
                String texte = tonEdit.getText().toString();
                int duration = Toast.LENGTH_SHORT;

                if(texte.isEmpty()){
                    Toast toast = Toast.makeText(getApplicationContext(), "Champ vide", duration);
                    toast.show();
                    return;
                }
                try {
                    double val = Double.parseDouble(texte);
                } catch(Exception e) {
                    Toast toast = Toast.makeText(getApplicationContext(), "erreur champ", duration);
                    toast.show();
                    return;
                }

                //RECUPERATION SPINNER 1
                Spinner spinner = (Spinner) findViewById(R.id.spinner1);
                String spinner1 = spinner.getSelectedItem().toString();

                //RECUPERATION SPINNER 2
                Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
                String spinner2 = spin2.getSelectedItem().toString();

                if(spinner1.equals(spinner2)){
                    Toast toast = Toast.makeText(getApplicationContext(), "Erreur conversion", duration);
                    toast.show();
                    return;
                }
                Toast toast;
                double result;
                double val = Double.parseDouble(texte);
                String s;
                switch(spinner1)
                {
                    case "km":
                        switch(spinner2)
                        {
                            case "m":
                                result = val*1000;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "dm":
                                result = val*10000;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "cm":
                                result = val*100000;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "mm":
                                result = val*1000000;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                        }
                        break;
                    case "m":
                        switch(spinner2)
                        {
                            case "km":
                                result = val/1000;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "dm":
                                result = val*10;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "cm":
                                result = val*100;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "mm":
                                result = val*1000;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                        }
                        break;
                    case "dm":
                        switch(spinner2)
                        {
                            case "km":
                                result = val/10000;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "m":
                                result = val/10;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "cm":
                                result = val*10;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "mm":
                                result = val*100;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                        }
                        break;
                    case "cm":
                        switch(spinner2)
                        {
                            case "km":
                                result = val/100000;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "m":
                                result = val/100;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "dm":
                                result = val/10;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "mm":
                                result = val*10;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                        }
                        break;
                    case "mm":
                        switch(spinner2)
                        {
                            case "km":
                                result = val/1000000;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "m":
                                result = val/1000;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "dm":
                                result = val/100;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                            case "cm":
                                result = val/10;
                                s = String.valueOf (result);
                                toast = Toast.makeText(getApplicationContext(), s, duration);
                                toast.show();
                                break;
                        }
                        break;
                }
            }
        });
    }
}