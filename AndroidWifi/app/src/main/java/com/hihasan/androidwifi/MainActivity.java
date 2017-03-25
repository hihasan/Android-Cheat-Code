package com.hihasan.androidwifi;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button enableWIfi, diableWifi;
    private WifiManager wifi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enableWIfi=(Button) findViewById (R.id.button1);
        diableWifi=(Button) findViewById (R.id.button2);

        button();
    }

    private void button()
    {
        enableWIfi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wifi=(WifiManager) getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);

            }
        });

        diableWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wifi=(WifiManager) getSystemService (Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);
            }
        });
    }
}
