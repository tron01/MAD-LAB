package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText number;
    double num1=0;
    double num2=0;
    String op="";
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9,b0, sum, sub, mul, div, equal, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.displayfield);

        b1 = findViewById(R.id.nine);
        b2 = findViewById(R.id.eight);
        b3 = findViewById(R.id.seven);
        b4 = findViewById(R.id.six);
        b5 = findViewById(R.id.five);
        b6 = findViewById(R.id.four);
        b7 = findViewById(R.id.three);
        b8 = findViewById(R.id.two);
        b9 = findViewById(R.id.one);
        b0 = findViewById(R.id.zero);

        sum = findViewById(R.id.plus);
        sub = findViewById(R.id.minus);
        mul = findViewById(R.id.multi);
        div = findViewById(R.id.division);

        equal = findViewById(R.id.equalbutton);
        clear = findViewById(R.id.acbutton);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);

        sub.setOnClickListener(this);
        sum.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

        clear.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button b= (Button) view;
        if(view==clear)
        {
            number.setText("");
        }

        else if(view==sub||view==sum ||view==mul ||view==div )
        {
            num1=Integer.parseInt(number.getText().toString());
            op=b.getText().toString();
            number.setText("");
        }

        else if(view==equal)
        {
            num2=Integer.parseInt(number.getText().toString());
            if(op.equals("+"))
            {
                number.setText(num1+num2+"");
            }
            else if(op.equals("-"))
            {
                number.setText(num1-num2+"");
            }
            else if(op.equals("x"))
            {
                number.setText(num1*num2+"");
            }
            else if(op.equals("/"))
            {
                number.setText(num1/num2+"");
            }
        }
        else
        {
            String s=number.getText().toString();
            number.setText(s+b.getText().toString());
        }
    }
}