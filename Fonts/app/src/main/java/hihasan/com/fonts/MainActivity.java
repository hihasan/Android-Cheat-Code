package hihasan.com.fonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    private TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1=(TextView) findViewById (R.id.txt1);
        txt2=(TextView) findViewById (R.id.txt2);

        Typeface face= Typeface.createFromAsset(getAssets(),"Lato.ttf");
        txt1.setTypeface(face);

        Typeface face1=Typeface.createFromAsset(getAssets(),"OpenSans.ttf");
        txt2.setTypeface(face1);


    }
}
