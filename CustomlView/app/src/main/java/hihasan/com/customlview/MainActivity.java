package hihasan.com.customlview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    ListView list;
    String[] web = {
            "Cookies & Cream Oreo",
            "Crunchy Korean fried chicken",
            "Fillet of Beef Wellington",
            "Teriyaki Burgers",
            "Turkish Chicken Kebabs",
    } ;
    Integer[] imageId = {
            R.drawable.bb,
            R.drawable.ee,
            R.drawable.qq,
            R.drawable.rr,
            R.drawable.tt,



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);


        CustomList adapter = new CustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(position == 0) {
                    Intent intent = new Intent(MainActivity.this, Recipes1.class);
                    startActivity(intent);
                }

                if(position == 1) {
                    Intent intent = new Intent(MainActivity.this, Recipes2.class);
                    startActivity(intent);
                }

                if(position == 2) {
                    Intent intent = new Intent(MainActivity.this, Recipes3.class);
                    startActivity(intent);
                }

                if(position == 3) {
                    Intent intent = new Intent(MainActivity.this, Recipes4.class);
                    startActivity(intent);
                }

                if(position == 4) {
                    Intent intent = new Intent(MainActivity.this, Recipes5.class);
                    startActivity(intent);
                }
                //Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });




    }
}
