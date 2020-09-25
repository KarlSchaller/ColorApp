package edu.temple.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class ColorActivity extends AppCompatActivity {

    ArrayList<String> colors = new ArrayList<>();
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateArrayList();

        spinner = findViewById(R.id.spinner);
        ColorAdapter adapter = new ColorAdapter(this, colors);
        spinner.setAdapter(adapter);

        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                populateArrayList();
            }
        });
    }

    private void populateArrayList() {
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
    }
}