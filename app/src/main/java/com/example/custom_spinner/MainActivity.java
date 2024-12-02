package com.example.custom_spinner;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp;
    TextView tV1;
    Countries[] countries_arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weddings();
        //customAdapter adp = new customAdapter(this,arr_data);
        countries_arr = new Countries[7];
        full_arr();


        sp.setOnItemSelectedListener(this);
        CustomAdapter customAdapter = new CustomAdapter (this,countries_arr);
        sp.setAdapter(customAdapter);




    }

    public void weddings()
    {
        sp = (Spinner) findViewById(R.id.sp);
        tV1 = (TextView) findViewById(R.id.tV1);
    }

    public void full_arr()
    {
        for(int i = 0 ; i < countries_arr.length ; i++)
        {
            countries_arr[i] = new Countries();
            countries_arr[i].setCountryName(getResources().getStringArray(R.array.countryName)[i]);
            countries_arr[i].setCountryCity(getResources().getStringArray(R.array.countryCity)[i]);
            countries_arr[i].setPopulation_size(getResources().getStringArray(R.array.countryCityPopulation)[i]);
        }


        countries_arr[0].setImage(R.drawable.unitedstates);
        countries_arr[1].setImage(R.drawable.japan);
        countries_arr[2].setImage(R.drawable.brazil);
        countries_arr[3].setImage(R.drawable.france);
        countries_arr[4].setImage(R.drawable.italy);
        countries_arr[5].setImage(R.drawable.israel);
        countries_arr[6].setImage(R.drawable.canada);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        tV1.setText("Country Name: " + countries_arr[position].getCountryName() + "\nCapital City: " + countries_arr[position].getCountryCity() + "\n" + countries_arr[position].getPopulation_size());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}