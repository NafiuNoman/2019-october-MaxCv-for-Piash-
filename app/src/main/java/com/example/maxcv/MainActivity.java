package com.example.maxcv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   private Button submit;

    private EditText editFirstName;
    private EditText editCurrentAddress;
    private EditText editParmanentAddress;
    private EditText editSchool;
    private EditText editCollege;
    private EditText editUniversity;
    private EditText workExperience;
    private EditText skills;
    private EditText hobbies;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.submit);

        editFirstName = (EditText) findViewById(R.id.editFirstName);
        editCurrentAddress = (EditText) findViewById(R.id.editCurrentAddress);
        editParmanentAddress = (EditText) findViewById(R.id.editParmanentAddress);
        editSchool =(EditText) findViewById(R.id.editSchool);
        editCollege =(EditText) findViewById(R.id.editCollege);
        editUniversity =(EditText) findViewById(R.id.editUniversity);
        workExperience =(EditText) findViewById(R.id.workExperience);
        skills =(EditText) findViewById(R.id.skills);
        hobbies = (EditText) findViewById(R.id.hobbies);


        submit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent  intent = new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("nameF",editFirstName.getText().toString());
        intent.putExtra("curr",editCurrentAddress.getText().toString());
        intent.putExtra("par",editParmanentAddress.getText().toString());
        intent.putExtra("sco",editSchool.getText().toString());
        intent.putExtra("coll",editCollege.getText().toString());
        intent.putExtra("uni",editUniversity.getText().toString());
        intent.putExtra("exp",workExperience.getText().toString());
        intent.putExtra("skill",skills.getText().toString());
        intent.putExtra("hobb",hobbies.getText().toString());

        startActivity(intent);

    }
}
