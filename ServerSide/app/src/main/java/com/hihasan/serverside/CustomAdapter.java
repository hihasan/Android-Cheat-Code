package com.hihasan.serverside;

import java.util.ArrayList;

/**
 * Created by hasan on 9/27/16.
 */
import java.util.ArrayList;

import com.android.volley.toolbox.NetworkImageView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{
    private ArrayList<RowData> result;
    private Context context;
    private static LayoutInflater inflater=null;
    public CustomAdapter(MainActivity mainActivity, ArrayList<RowData> data) {
        // TODO Auto-generated constructor stub
        result=data;
        context=mainActivity;

        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView title;
        //TextView description;
        NetworkImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.list_item, null);
        holder.title=(TextView) rowView.findViewById(R.id.textView1);
        //holder.description=(TextView) rowView.findViewById(R.id.textView2);
        holder.img=(NetworkImageView) rowView.findViewById(R.id.networkImageView);
        holder.title.setText(result.get(position).getTitle());
        //holder.description.setText(result.get(position).getDescription());

        // If you are using NetworkImageView
        holder.img.setImageUrl(result.get(position).getImageURL(), VolleyController.getInstance().getImageLoader());

        return rowView;
    }
}