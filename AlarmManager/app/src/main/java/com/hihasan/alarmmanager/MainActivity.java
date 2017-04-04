package com.hihasan.alarmmanager;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.hihasan.alarmmanager.service.MyBroadcastReceiver;

public class MainActivity extends AppCompatActivity
{
    private AppCompatButton b1;
    private EditText e1;
//    private PendingIntent pedingintent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        b1=(AppCompatButton) findViewById (R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startAleart();
            }
        });
    }

    private void startAleart()
    {
        e1=(EditText) findViewById(R.id.time);
        int i= Integer.parseInt(e1.getText().toString());

        Intent n=new Intent(MainActivity.this, MyBroadcastReceiver.class);
//        startActivity(i);

        PendingIntent pendingIntent= PendingIntent.getBroadcast(this.getApplicationContext(),234324243,n,0);

        AlarmManager alarmmanager=(AlarmManager) getSystemService(ALARM_SERVICE);

        alarmmanager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(i*1000),pendingIntent);

        Toast.makeText(getApplicationContext(),"Aarm set in "+i+" Second", Toast.LENGTH_SHORT).show();
    }

}
