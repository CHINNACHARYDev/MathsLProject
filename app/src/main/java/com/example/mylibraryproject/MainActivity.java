package com.example.mylibraryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mylibrary.Addition;
import com.example.mylibrary.Value;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button totalValue = findViewById(R.id.totalValue);
        final EditText valueTwo = findViewById(R.id.valueTwo);
        final EditText valueOne = findViewById(R.id.valueOne);


        totalValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                long val1 = Long.parseLong(valueOne.getText().toString());
                long val2 = Long.parseLong(valueTwo.getText().toString());

                long total = Addition.totalAddValue(val1, val2);
                totalValue.setText(String.valueOf(total));
            }
        });

    }
}
