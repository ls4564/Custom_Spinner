package com.example.custom_spinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Countries[] countries_arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weddings();
        countries_arr = new Countries[7];
        full_arr();




    }

    public void weddings()
    {
        //customAdapter adp = new customAdapter(this,arr_data);
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
    }
}