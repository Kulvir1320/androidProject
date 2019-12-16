package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class descriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        TextView textView = findViewById(R.id.textview);
        ArrayList<String> list = new ArrayList<>();
//        Intent intent = getIntent();
//        int id = intent.getExtras().getInt("selected id");
//
//        textView.setText(Employee.employeeDetails.get(id).DetailDescription());

        Intent intent = getIntent();
        int i = intent.getExtras().getInt("id");
        textView.setText(Employee.allEmployees.get(i).allDescription());


    }
}
