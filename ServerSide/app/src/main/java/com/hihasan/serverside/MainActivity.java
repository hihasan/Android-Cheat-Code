package com.hihasan.serverside;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{

    private ProgressDialog dialog=null ;
    private String TAG="Tutorial Connect";
    private String tag_json_arry = "json_array_req";
    private String url = "http://test2.hihasan.com";
    private String url_file="/fetch.php";
    private CustomAdapter adapter;
    private ListView list;ArrayList<RowData> rowdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=(ListView) findViewById(R.id.listView1);
        rowdata=new ArrayList<RowData>();

        dialog= new ProgressDialog(this);

        dialog.setMessage("Loading...");
        dialog.show();

        JsonArrayRequest request = new JsonArrayRequest(url+url_file,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d(TAG, response.toString()); try {
                            for(int i=0;i<response.length();i++){
                                String title=response.getJSONObject(i).getString("title");
                                String description=response.getJSONObject(i).getString("description");
                                String img_url;

                                img_url = response.getJSONObject(i).getString("img_url");

                                //rowdata.add(new RowData(title, description, img_url));
                                rowdata.add(new RowData(title,img_url));
                            }
                        } catch (JSONException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        adapter=new CustomAdapter(MainActivity.this, rowdata);
                        list.setAdapter(adapter);
                        dialog.dismiss();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "Error: " + error.getMessage());
                dialog.dismiss();
            }
        });

        // Adding request to request queue
        VolleyController.getInstance().addToRequestQueue(request, tag_json_arry);

    }

}