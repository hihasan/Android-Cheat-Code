package com.hihasan.alarmmanager.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;

/**
 * Created by hasan on 4/4/17.
 */

public class MyBroadcastReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
//        Uri alert = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        Toast.makeText(context,"This is a example happy coding",Toast.LENGTH_SHORT).show();
//        if(alert == null){
//            // alert is null, using backup
//            alert = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//
//            // I can't see this ever being null (as always have a default notification)
//            // but just incase
//            if(alert == null) {
//                // alert backup is null, using 2nd backup
//                alert = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
//            }
//        }

    }
}
