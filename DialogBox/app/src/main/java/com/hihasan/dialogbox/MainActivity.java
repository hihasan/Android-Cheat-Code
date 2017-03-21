package com.hihasan.dialogbox;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button b1;
    private Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                new AlertDialog.Builder(context)
                        .setTitle("Exit Example")
                        .setMessage("This is Test")
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()
                        {

                            public void onClick(DialogInterface dialog, int whichButton)
                            {
                                //Toast.makeText(Dashboard.this, "Yaay", Toast.LENGTH_SHORT).show();
                                MainActivity.this.finish();
                            }})
                        .setNegativeButton(android.R.string.no, null).show();

            }
        });
    }
}
