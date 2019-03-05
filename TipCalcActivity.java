package com.example.matts.lab04a;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class TipCalcActivity extends AppCompatActivity {
    TextView bill;
    TextView tipPercent;
    TextView numOfPeople;
    TextView result;

    public void calcClicked(View v){
        Double billAmount = Double.valueOf(bill.getText().toString());
        Double tip = Double.valueOf(tipPercent.getText().toString());
        int people = Integer.valueOf(numOfPeople.getText().toString());

        Double costPerPerson = billAmount + (billAmount*(tip/100));
        costPerPerson = costPerPerson/people;
        result.setText(costPerPerson.toString());

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calc);
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

        bill = findViewById(R.id.billAmount);
        tipPercent = findViewById(R.id.tipPercent);
        numOfPeople = findViewById(R.id.numOfPeople);
        result = findViewById(R.id.result);
    }

}
