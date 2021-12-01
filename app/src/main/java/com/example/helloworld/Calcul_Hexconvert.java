package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Calcul_Hexconvert extends AppCompatActivity {
    EditText editText;
    RadioGroup radioGroup;
    RadioButton selectedbtn;
    Button btn_back;
    TextView tv_result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycalculator_hexconvert);
        editText = (EditText) findViewById(R.id.hex_et1);
        radioGroup = findViewById(R.id.rg_hex);
        btn_back = (Button) findViewById(R.id.hex_back);
        tv_result = (TextView) findViewById(R.id.hex_result);

//        btn_getresult.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String et_str = editText.getText().toString();
//                if(radioGroup.)
//            }
//        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String str = editText.getText().toString();
                int num = Integer.parseInt(str);
                switch (checkedId){
                    case R.id.bf_two:
                        String binary = Integer.toBinaryString(num);
                        tv_result.setText(binary);
                        break;
                    case R.id.bf_eight:
                        String octalString = Integer.toOctalString(num);
                        tv_result.setText(octalString);
                        break;
                    case R.id.bf_sixteen:
                        String hexString = Integer.toHexString(num);
                        tv_result.setText(hexString);
                        break;

                }
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calcul_Hexconvert.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
