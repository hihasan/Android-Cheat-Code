package com.hihasan.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity
{
    private AppCompatButton b1,b2;
    private PendingIntent pedingIntent;
    private AlarmManager alarmManager;
    public static int i=10;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(AppCompatButton) findViewById(R.id.start);
        b2=(AppCompatButton) findViewById(R.id.cancel);

        //on Button Press Method
        toButton();
    }

    private void toButton()
    {
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent myIntent=new Intent(MainActivity.this,BackgroundService.class);
                pedingIntent=PendingIntent.getService(MainActivity.this,0,myIntent,0);
                alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);
                Calendar calender= Calendar.getInstance();
                calender.setTimeInMillis(System.currentTimeMillis());
                calender.add(Calendar.SECOND,10);
                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+(i*1000),(i*1000),pedingIntent);
                Toast.makeText(getApplicationContext(),"Alarm Start",Toast.LENGTH_SHORT).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.cancel(pedingIntent);

                //Tell User what happened
                Toast.makeText(getApplicationContext(),"Cancel Service",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
