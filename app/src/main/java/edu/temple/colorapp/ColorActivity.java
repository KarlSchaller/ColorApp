package edu.temple.colorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.ColorDrawable;
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
    ConstraintLayout layout;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        spinner = findViewById(R.id.spinner);
        ColorAdapter adapter = new ColorAdapter(this);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                layout.setBackgroundColor(((ColorDrawable)view.getBackground()).getColor());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}