package com.example.custom_spinner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;


public class CustomAdapter extends BaseAdapter
{
    private Context context;
    private Countries[] arr_data;
    //private Layoutlnflater inflater;

    public CustomAdapter (Context context, Countries[] arr_data)
    {
        this.context = context;
        this.arr_data = arr_data;
        //inflater = (Layoutlnflater.from(context));
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
        return null;
    }
}
