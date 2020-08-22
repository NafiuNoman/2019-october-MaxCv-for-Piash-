package com.example.maxcv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button pdfDownload;

     private TextView showName;
     private TextView showWork;
     private TextView showEduction;
     private TextView showSkills;
     private TextView showAdress;
     private TextView showHobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pdfDownload = (Button) findViewById(R.id.pdfDownload);

        showName = (TextView)findViewById(R.id.showName);
        showWork = (TextView)findViewById(R.id.showWork);
        showEduction = (TextView)findViewById(R.id.showEducation);
        showSkills = (TextView)findViewById(R.id.showSkills);
        showAdress = (TextView)findViewById(R.id.showAddress);
        showHobbies = (TextView)findViewById(R.id.showHobbies);



        Bundle bundle = getIntent().getExtras();
            String valueName = bundle.getString("nameF");
            String valueNameL = bundle.getString("nameL");
            String valueCurr = bundle.getString("curr");
            String valuePar = bundle.getString("par");
            String valueSco = bundle.getString("sco");
            String valueColl = bundle.getString("coll");
            String valueUni = bundle.getString("uni");
            String valueExp = bundle.getString("exp");
            String valueSkill = bundle.getString("skill");
            String valueHobb = bundle.getString("hobb");



            showName.setText(valueName);
           /* showName.setText(valueNameL);*/
            showAdress.setText(valueCurr);
           /* showName.setText(valuePar);*/
            showEduction.setText(valueSco);
            /*showName.setText(valueColl);
            showName.setText(valueUni);*/
            showWork.setText(valueExp);
            showSkills.setText(valueSkill);
            showHobbies.setText(valueHobb);

    pdfDownload.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {



    }
}
