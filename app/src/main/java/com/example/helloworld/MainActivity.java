package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //
    TextView tv_input;
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_point;
    Button btn_ac,btn_ce,btn_left,btn_right,btn_plus,btn_sub,btn_div,btn_multi,btn_sin,btn_cos,btn_square,btn_equal;
    Button btn_hex,btn_unit;
    boolean clear_flag;
    //unitconvert
    EditText unitet1,unitet2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycalculator_main);
        //mycalculator_main实例化按钮
        tv_input = (TextView) findViewById(R.id.tv_input);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0=(Button) findViewById(R.id.btn_0);
        btn_1=(Button) findViewById(R.id.btn_1);
        btn_2=(Button) findViewById(R.id.btn_2);
        btn_3=(Button) findViewById(R.id.btn_3);
        btn_4=(Button) findViewById(R.id.btn_4);
        btn_5=(Button) findViewById(R.id.btn_5);
        btn_6=(Button) findViewById(R.id.btn_6);
        btn_7=(Button) findViewById(R.id.btn_7);
        btn_8=(Button) findViewById(R.id.btn_8);
        btn_9=(Button) findViewById(R.id.btn_9);

        btn_point = (Button)findViewById(R.id.btn_point);
        btn_ac = (Button) findViewById(R.id.btn_ac);
        btn_ce = (Button) findViewById(R.id.btn_ce);
        btn_left = (Button) findViewById(R.id.btn_left);
        btn_right = (Button) findViewById(R.id.btn_right);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_multi = (Button) findViewById(R.id.btn_multi);
        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_square = (Button) findViewById(R.id.btn_square);
        btn_equal = (Button) findViewById(R.id.btn_equal);

        btn_hex = (Button) findViewById(R.id.btn_hexconvert);
        btn_unit = (Button) findViewById(R.id.btn_unitconvert);
        //mycalculator_hexconvert实例化按钮

        //mycalculator_unitconvert实例化按钮

        //main点击事件
        btn_0.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_ac.setOnClickListener(this);
        btn_ce.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_sub.setOnClickListener(this);
        btn_sin.setOnClickListener(this);
        btn_cos.setOnClickListener(this);
        btn_square.setOnClickListener(this);
        btn_hex.setOnClickListener(this);
        btn_unit.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String str = tv_input.getText().toString();
        switch (v.getId()){
            case R.id.btn_0:
            case R.id.btn_1:
            case R.id.btn_2:
            case R.id.btn_3:
            case R.id.btn_4:
            case R.id.btn_5:
            case R.id.btn_6:
            case R.id.btn_7:
            case R.id.btn_8:
            case R.id.btn_9:
            case R.id.btn_point:
                if(clear_flag)
                {
                    clear_flag=false;
                    str="";
                    tv_input.setText("");
                }
                tv_input.setText(str + ((Button) v).getText());
                break;
            case R.id.btn_plus:
            case R.id.btn_sub:
            case R.id.btn_multi:
            case R.id.btn_div:
                if(clear_flag){
                    clear_flag = false;
                    str="";
                    tv_input.setText(str);
                }
                tv_input.setText(str + " "+ ((Button) v).getText().toString() + " ");
                break;
            case R.id.btn_ac:
                if(clear_flag){
                    clear_flag = false;
                    str="";
                    tv_input.setText("");
                }
                tv_input.setText("");
                break;
            case R.id.btn_ce:
                if(clear_flag){
                    clear_flag = false;
                    str="";
                    tv_input.setText("");
                }
                if(str!=null && !str.equals("")){
                    tv_input.setText(str.substring(0,str.length()-1));
                }
                break;
            case R.id.btn_sin:
                if(clear_flag){
                    clear_flag = false;
                    str="";
                    tv_input.setText("");
                }
                double tempSin = Double.parseDouble(str.substring(str.length()-1));
                tempSin = Math.sin(tempSin);
                tv_input.setText(str.substring(0,str.length()-1) + String.valueOf(tempSin));
                break;
            case R.id.btn_cos:
                if(clear_flag){
                    clear_flag = false;
                    str="";
                    tv_input.setText("");
                }
                double tempCos = Double.parseDouble(str.substring(str.length()-1));
                tempCos = Math.sin(tempCos);
                tv_input.setText(str.substring(0,str.length()-1) + String.valueOf(tempCos));
                break;
            case R.id.btn_square:
                if(clear_flag){
                    clear_flag = false;
                    str="";
                    tv_input.setText("");
                }
                double tempSquare = Double.parseDouble(str.substring(str.length()-1));
                tempCos = Math.pow(tempSquare,2);
                tv_input.setText(str.substring(0,str.length()-1) + String.valueOf(tempCos));

            case R.id.btn_equal:
                break;
            case R.id.btn_hexconvert:
                Intent intentHex = new Intent(MainActivity.this,Calcul_Hexconvert.class);
                startActivity(intentHex);
                break;
            case R.id.btn_unitconvert:
                Intent intentUnit = new Intent(MainActivity.this,Calcul_unitconvert.class);
                startActivity(intentUnit);
                break;
        }
    }
}