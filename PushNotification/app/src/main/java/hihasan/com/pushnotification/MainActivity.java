package hihasan.com.pushnotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private Button b1;
    private EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById (R.id.editText);
        e2=(EditText) findViewById (R.id.editText2);
        e3=(EditText) findViewById (R.id.editText3);

        b1=(Button) findViewById (R.id.button);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view)
            {
                String tittle=e1.getText().toString().trim();
                String subject=e2.getText().toString().trim();
                String body=e3.getText().toString().trim();

                NotificationManager notif=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                Notification notify=new Notification.Builder (getApplicationContext())
                        .setContentTitle(tittle)
                        .setContentText(body)
                        .setContentTitle(subject)
                        .setSmallIcon(R.mipmap.ic_launcher).build();

                notify.flags |= Notification.FLAG_AUTO_CANCEL;
                notif.notify(0, notify);


            }
        });
    }
}
