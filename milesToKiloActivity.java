package com.example.matts.lab04a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class milesToKiloActivity extends AppCompatActivity {

    private TextView result;
    private TextView input;


    public void btnMtoKClicked(View v){
        Double miles = Double.valueOf(input.getText().toString());
        Double kilo = miles * 1.60934;

        result.setText(kilo.toString());
    }

    public void btnKtoMClicked(View v){
        Double kilo = Double.valueOf(input.getText().toString());
        Double miles = kilo/1.60934;

        result.setText(miles.toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles_to_kilo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        result = findViewById(R.id.resultView);
        input = findViewById(R.id.distance);
    }

}
