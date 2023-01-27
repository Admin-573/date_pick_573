package com.example.date_pick_573;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

TextView textView;
ProgressBar progressBar,progressBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = (TextView) findViewById(R.id.txt1);
        progressBar = (ProgressBar) findViewById(R.id.pgb1);
        progressBar1 = (ProgressBar) findViewById(R.id.pgb2);

    }
}