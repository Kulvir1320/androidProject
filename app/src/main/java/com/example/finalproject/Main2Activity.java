package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    EditText fname;
    EditText lname;
    EditText birthyear;
    EditText monthlySalary;
    EditText occuptionRate;
    EditText id;
    Spinner employeeType;
    RadioGroup vehicle;
    EditText carTypeE;
    TextView carTypeT;
    TextView sidecarT;
    RadioGroup sideCar;
    EditText vehicleModel;
    EditText plateN;
    Spinner color;
    TextView bugs;
    TextView projects;
    TextView clients;
    EditText numbers;
    Button register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       fname = findViewById(R.id.fnameE);
       lname = findViewById(R.id.lastE);
       birthyear = findViewById(R.id.birthE);
       monthlySalary = findViewById(R.id.salaryE);
       occuptionRate = findViewById(R.id.occuptionE);
       id = findViewById(R.id.idE);
       employeeType = findViewById(R.id.spinner);
       vehicle = findViewById(R.id.radiogroupVehicle);
       carTypeE = findViewById(R.id.carTypeE);
       carTypeT = findViewById(R.id.carTypeT);
       sidecarT = findViewById(R.id.sideCarT);
       sideCar = findViewById(R.id.radiogroupSideCar);
       vehicleModel = findViewById(R.id.modelE);
       plateN = findViewById(R.id.plateE);
       color = findViewById(R.id.spinnercolor);
       bugs = findViewById(R.id.bugsT);
       projects = findViewById(R.id.projectT);
       clients = findViewById(R.id.clientsT);
       numbers = findViewById(R.id.numbersE);
       register =findViewById(R.id.register);



       employeeType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        numbers.setVisibility(View.VISIBLE);


        switch(i){
            case 1: bugs.setVisibility(View.VISIBLE);
                    projects.setVisibility(View.GONE);
                    clients.setVisibility(View.GONE);
            break;
            case 2: projects.setVisibility(View.VISIBLE);
                    bugs.setVisibility(View.GONE);
                    clients.setVisibility(View.GONE);
                    break;
            case 3: clients.setVisibility(View.VISIBLE);
                    bugs.setVisibility(View.GONE);
                    projects.setVisibility(View.GONE);
            break;
            default: numbers.setVisibility(View.GONE);
                     bugs.setVisibility(View.GONE);
                     projects.setVisibility(View.GONE);
                     clients.setVisibility(View.GONE);
        }

        vehicle.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.radioButtonCar){
                    carTypeT.setVisibility(View.VISIBLE);
                    carTypeE.setVisibility(View.VISIBLE);
                    sidecarT.setVisibility(View.INVISIBLE);
                    sideCar.setVisibility(View.INVISIBLE);

                }else{
                    sidecarT.setVisibility(View.VISIBLE);
                    sideCar.setVisibility(View.VISIBLE);
                    carTypeT.setVisibility(View.INVISIBLE);
                    carTypeE.setVisibility(View.INVISIBLE);
                }
            }
        });

           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       });

    }
}
