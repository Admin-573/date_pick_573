package com.example.date_pick_573;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;

public class MainActivity2 extends AppCompatActivity {
TextView textView;
Button button;
TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=(TextView) findViewById(R.id.txt1);
        button=(Button) findViewById(R.id.btn1);
        timePicker=(TimePicker) findViewById(R.id.timepicker);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getCurrentTime());
            }
        });
    }
    public String getCurrentTime()
    {
        String currentTime = "Current Time : "+timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        return currentTime;
    }
}