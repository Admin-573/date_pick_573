package com.example.date_pick_573;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
DatePicker datePicker;
Button change,button1;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.textview1);
        change=(Button) findViewById(R.id.Change);
        datePicker=(DatePicker) findViewById(R.id.datepicker);

        textView.setText("Current Date : "+getCurrentDate());

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Changed Date : "+getCurrentDate());
            }
        });
    }
    public String getCurrentDate()
    {
        StringBuilder builder = new StringBuilder();
        builder.append((datePicker.getDayOfMonth()+"/"));
        builder.append((datePicker.getMonth()+1)+"/");
        builder.append(datePicker.getYear());
        return builder.toString();
    }
}