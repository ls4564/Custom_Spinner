package com.example.custom_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter
{
    private Context context;
    private Countries[] arr_data;
    private LayoutInflater inflater;

    public CustomAdapter (Context context, Countries[] arr_data)
    {
        this.context = context;
        this.arr_data = arr_data;
        this.inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount()
    {
        return arr_data.length;
    }

    @Override
    public Object getItem(int position)
    {
        return arr_data[position];
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = inflater.inflate(R.id.sp,parent,false);
        ImageView custom_iV_country = (ImageView) convertView.findViewById(R.id.custom_iV_country);
        TextView custom_tV_countryName = (TextView) convertView.findViewById(R.id.custom_tV_countryName);
        TextView custom_tV_countryCity = (TextView) convertView.findViewById(R.id.custom_tV_countryCity);
        custom_iV_country.setImageResource(arr_data[position].getImage());
        custom_tV_countryName.setText(arr_data[position].getCountryName());
        custom_tV_countryCity.setText(arr_data[position].getCountryCity());
        return convertView;
    }
}
