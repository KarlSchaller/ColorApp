package edu.temple.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    ArrayList<String> colors = new ArrayList<>();
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        ColorAdapter adapter = new ColorAdapter(this, colors);

        spinner.setAdapter(adapter);

    }
}