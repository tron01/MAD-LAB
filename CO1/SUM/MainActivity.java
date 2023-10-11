package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView num3;
    Button sumclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.sumnum1);
        num2=findViewById(R.id.sumnum2);
        num3=findViewById(R.id.resultview);

        sumclick=findViewById(R.id.sumbutton);
    }

    public void click(View view) {
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int res=n1+n2;

        num3.setText("RESULT: "+res);
    }
}