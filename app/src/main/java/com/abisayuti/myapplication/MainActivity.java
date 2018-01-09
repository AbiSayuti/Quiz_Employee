package com.abisayuti.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etname, etjobemployee, etemployer, etsalary;
    Button btnsubmit;
    TextView TVRESULT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVRESULT = (TextView) findViewById(R.id.TVRESULT);
        etname = (EditText)findViewById(R.id.etname);
        etsalary = (EditText)findViewById(R.id.etsalary);
        etjobemployee = (EditText)findViewById(R.id.etjobemployee);
        etemployer = (EditText)findViewById(R.id.etemployer);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);





        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String NAMA = etname.getText().toString();
                String EMPLOYER = etemployer.getText().toString();
                String JOB = etjobemployee.getText().toString();
                String SALARY = etsalary.getText().toString();

                TVRESULT.setText("Hallo , " + NAMA + " anda bekerja di " + EMPLOYER + " sebagai "  + JOB +  " gaji anda per bulan sebesar " + SALARY);

            }
        });
    }
}