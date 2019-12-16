package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText fname;
    EditText lname;
    EditText birthyear;
    EditText monthlySalary;
    EditText occuptionRate;
    EditText eid;
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
    String vCat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       fname = findViewById(R.id.fnameE);
       lname = findViewById(R.id.lastE);
       birthyear = findViewById(R.id.birthE);
       monthlySalary = findViewById(R.id.salaryE);
       occuptionRate = findViewById(R.id.occuptionE);
       eid = findViewById(R.id.idE);
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


               switch (i) {
                   case 2:
                       bugs.setVisibility(View.VISIBLE);
                       projects.setVisibility(View.INVISIBLE);
                       clients.setVisibility(View.INVISIBLE);
                       break;
                   case 3:
                       projects.setVisibility(View.VISIBLE);
                       bugs.setVisibility(View.INVISIBLE);
                       clients.setVisibility(View.INVISIBLE);
                       break;
                   case 1:
                       clients.setVisibility(View.VISIBLE);
                       bugs.setVisibility(View.INVISIBLE);
                       projects.setVisibility(View.INVISIBLE);
                       break;
                   default:
                       numbers.setVisibility(View.GONE);
                       bugs.setVisibility(View.GONE);
                       projects.setVisibility(View.GONE);
                       clients.setVisibility(View.GONE);
               }

               vehicle.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                   @Override
                   public void onCheckedChanged(RadioGroup radioGroup, int i) {

                       RadioButton radioButton = (RadioButton) findViewById(i);
                       vCat = radioButton.getText().toString();

                       if (i == R.id.radioButtonCar) {
                           carTypeT.setVisibility(View.VISIBLE);
                           carTypeE.setVisibility(View.VISIBLE);
                           sidecarT.setVisibility(View.INVISIBLE);
                           sideCar.setVisibility(View.INVISIBLE);


                       } else {
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

       register.setOnClickListener(new View.OnClickListener() {

           Vehicle v = new Vehicle(vehicleModel.getText().toString(), plateN.getText().toString(),color.getSelectedItem().toString());
           Employee e;

           @Override
           public void onClick(View view) {
               if (!fname.getText().toString().isEmpty() & !lname.getText().toString().isEmpty() & !birthyear.getText().toString().isEmpty()
                       & !monthlySalary.getText().toString().isEmpty() & !occuptionRate.getText().toString().isEmpty() & !eid.getText().toString().isEmpty()
                       & !employeeType.getSelectedItem().toString().isEmpty() & !numbers.getText().toString().isEmpty() & !vehicleModel.getText().toString().isEmpty() & !plateN.getText().toString().isEmpty() & !color.getSelectedItem().toString().isEmpty())
               {
                   int id = vehicle.getCheckedRadioButtonId();

                   switch (id) {

                       case R.id.radioButtonCar:
                           v = new Car(vehicleModel.getText().toString(), plateN.getText().toString(), color.getSelectedItem().toString(), carTypeE.getText().toString());

                           break;
                       case R.id.radioButtonMotorbike:
                           Boolean isSidecar = false;
                           switch (sideCar.getCheckedRadioButtonId()) {
                               case R.id.sideCarYes:
                                   isSidecar = true;
                                   System.out.println("Sidecar yes");
                                   Log.i("sidecaryes", "onClick: sidecaryes");
                                   break;
                               case R.id.sideCarNo:
                                   isSidecar = true;
                                   System.out.println("sidecar no");
                                   Log.i("sidecar", "onClick: sidecarno");
                               default:
                                   break;
                           }
                           v = new MotorBike(vehicleModel.getText().toString(), plateN.getText().toString(), color.getSelectedItem().toString(), isSidecar);

                           break;
                       default:
                           break;
                   }


                   switch (employeeType.getSelectedItem().toString()) {
                       case "Manager":
                           if (!occuptionRate.getText().toString().equals("")) {
                               e = new Manager(fname.getText().toString() + " " + lname.getText().toString(), Integer.parseInt(eid.getText().toString()),
                                       Integer.parseInt(birthyear.getText().toString()),
                                       Integer.parseInt(monthlySalary.getText().toString()), Double.parseDouble(occuptionRate.getText().toString()),
                                       v, Integer.parseInt(numbers.getText().toString()));
                           } else {
                               e = new Manager(fname.getText().toString() + " " + lname.getText().toString(), Integer.parseInt(eid.getText().toString()),
                                       Integer.parseInt(birthyear.getText().toString()),
                                       Integer.parseInt(monthlySalary.getText().toString()), v, Integer.parseInt(numbers.getText().toString()));

                           }

                           break;
                       case "Programmer":
                           if (!occuptionRate.getText().toString().equals("")) {
                               e = new Programmer(fname.getText().toString() + " " + lname.getText().toString(), Integer.parseInt(eid.getText().toString()),
                                       Integer.parseInt(birthyear.getText().toString()),
                                       Integer.parseInt(monthlySalary.getText().toString()), Double.parseDouble(occuptionRate.getText().toString()),
                                       v, Integer.parseInt(numbers.getText().toString()));
                           } else {
                               e = new Programmer(fname.getText().toString() + " " + lname.getText().toString(), Integer.parseInt(eid.getText().toString()),
                                       Integer.parseInt(birthyear.getText().toString()),
                                       Integer.parseInt(monthlySalary.getText().toString()), v, Integer.parseInt(numbers.getText().toString()));

                           }

                           break;
                       case "Tester":
                           if (!occuptionRate.getText().toString().equals("")) {
                               e = new Tester(fname.getText().toString() + " " + lname.getText().toString(), Integer.parseInt(eid.getText().toString()), Integer.parseInt(birthyear.getText().toString()),
                                       Integer.parseInt(monthlySalary.getText().toString()), Double.parseDouble(occuptionRate.getText().toString()), v,
                                       Integer.parseInt(numbers.getText().toString()));
                           } else {
                               e = new Tester(fname.getText().toString() + " " + lname.getText().toString(), Integer.parseInt(eid.getText().toString()), Integer.parseInt(birthyear.getText().toString()),
                                       Integer.parseInt(monthlySalary.getText().toString()), v, Integer.parseInt(numbers.getText().toString()));
                           }


                           break;

                   }

                   Employee.allEmployees.add(e);
                   Toast.makeText(Main2Activity.this, "Registration is successfull.", Toast.LENGTH_SHORT).show();
                   Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                   startActivity(intent);

               }
               else{
                   Toast.makeText(Main2Activity.this, "fill your fields.", Toast.LENGTH_SHORT).show();
               }
           }
           });

    }}
