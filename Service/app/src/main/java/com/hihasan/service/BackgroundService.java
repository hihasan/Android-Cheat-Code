package com.hihasan.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created by Mamun on 4/14/2017.
 */

public class BackgroundService extends Service
{
    @Override
    public void onCreate()

    {
        //super.onCreate();
        Toast.makeText(this,"onCreate Method",Toast.LENGTH_SHORT).show();
    }

    @Override
    public IBinder onBind(Intent intent)
    {
        Toast.makeText(this,"onBind Method",Toast.LENGTH_SHORT).show();
        return null;
    }
}
