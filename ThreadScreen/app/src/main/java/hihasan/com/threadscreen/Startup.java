package hihasan.com.threadscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Startup extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContectView()
        setContentView(R.layout.activity_startup);

        //Thread Handler for 5 sec.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(Startup.this, DashBoard.class);
                Startup.this.startActivity(mainIntent);
                Startup.this.finish();
            }
        }, 5000);


    }


}
