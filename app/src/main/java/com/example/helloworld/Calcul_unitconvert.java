package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calcul_unitconvert extends AppCompatActivity {
    EditText unit_et1,unit_et2;
    RadioGroup unit_bfrg1,unit_afrg1;
    RadioGroup unit_bfrg2,unit_afrg2;
    Button btn_getResult1,btn_getResult2;
    TextView unit_result1,unit_result2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycalculator_unitconvert);
        //实例化
        unit_et1 = (EditText) findViewById(R.id.unit_et1);
        unit_et2 = (EditText) findViewById(R.id.unit_et2);
        btn_getResult1 = (Button) findViewById(R.id.btn_getresult1);
        btn_getResult2 = (Button) findViewById(R.id.btn_getresult2);
        unit_result1 = (TextView) findViewById(R.id.unit_result1);
        unit_result2 = (TextView) findViewById(R.id.unit_result2);

        unit_bfrg1 = (RadioGroup) findViewById(R.id.unit_bfrg1);
        unit_bfrg2 = (RadioGroup) findViewById(R.id.unit_bfrg2);
        unit_afrg1 = (RadioGroup) findViewById(R.id.unit_afrg1);
        unit_afrg2= (RadioGroup) findViewById(R.id.unit_afrg2);
        //点击事件
        btn_getResult1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb1 = findViewById(unit_bfrg1.getCheckedRadioButtonId());
                RadioButton rb2 = findViewById(unit_afrg1.getCheckedRadioButtonId());
                Double temp = 0.0;
                temp = Double.parseDouble(unit_et1.getText().toString());
                switch (rb1.getId()){
                    case R.id.bf_cm:
                        if(rb2.getId() == R.id.af_cm){
                            unit_result1.setText(String.valueOf(temp));
                        }
                        else if(rb2.getId() == R.id.af_dm){
                            unit_result1.setText(String.valueOf(temp*0.1));
                        }
                        else if(rb2.getId() == R.id.af_m){
                            unit_result1.setText(String.valueOf(temp*0.01));
                        }
                        else if(rb2.getId() == R.id.af_km){
                            unit_result1.setText(String.valueOf(temp*0.00001));
                        }
                        else{
                            unit_result1.setText("请选择单位");
                        }
                        break;
                    case R.id.bf_dm:
                        if(rb2.getId() == R.id.af_cm){
                            unit_result1.setText(String.valueOf(temp*10));
                        }
                        else if(rb2.getId() == R.id.af_dm){
                            unit_result1.setText(String.valueOf(temp));
                        }
                        else if(rb2.getId() == R.id.af_m){
                            unit_result1.setText(String.valueOf(temp*0.1));
                        }
                        else if(rb2.getId() == R.id.af_km){
                            unit_result1.setText(String.valueOf(temp*0.0001));
                        }
                        else{
                            unit_result1.setText("请选择单位");
                        }
                        break;
                    case R.id.af_m:
                    if(rb2.getId() == R.id.af_cm){
                        unit_result1.setText(String.valueOf(temp*100));
                    }
                    else if(rb2.getId() == R.id.af_dm){
                        unit_result1.setText(String.valueOf(temp*10));
                    }
                    else if(rb2.getId() == R.id.af_m){
                        unit_result1.setText(String.valueOf(temp));
                    }
                    else if(rb2.getId() == R.id.af_km){
                        unit_result1.setText(String.valueOf(temp*0.001));

                    }
                    else{
                        unit_result1.setText("请选择单位");
                    }
                    break;
                    case R.id.af_km:
                        if(rb2.getId() == R.id.af_cm){
                            unit_result1.setText(String.valueOf(temp*100000));
                        }
                        else if(rb2.getId() == R.id.af_dm){
                            unit_result1.setText(String.valueOf(temp*10000));
                        }
                        else if(rb2.getId() == R.id.af_m){
                            unit_result1.setText(String.valueOf(temp*1000));
                        }
                        else if(rb2.getId() == R.id.af_km){
                            unit_result1.setText(String.valueOf(temp));
                        }
                        else{
                            unit_result1.setText("请选择单位");
                        }
                        break;
                }
            }
        });
        RadioButton rb3 = findViewById(unit_afrg1.getCheckedRadioButtonId());
        RadioButton rb4 = findViewById(unit_afrg2.getCheckedRadioButtonId());
    }
}
