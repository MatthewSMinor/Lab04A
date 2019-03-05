package com.example.matts.lab04a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class tempCalcActivity extends AppCompatActivity {

    private TextView tempinput;
    private TextView tempresult;


    public void btnFtoCClicked(View v){
        //(32°F − 32) × 5/9 = 0°C
        Double f = Double.valueOf(tempinput.toString());
        Double c = ((f-32) * (5/9));

        tempresult.setText(c.toString());
    }

    public void btnCtoFClicked(View v){
        //(0°C × 9/5) + 32 = 32°F
        Double c = Double.valueOf(tempinput.toString());
        Double f = (c*(9/5))+32;

        tempresult.setText(f.toString());
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_calc);
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

        tempinput = findViewById(R.id.tempInput);
        tempresult = findViewById(R.id.tempResult);

    }

}
