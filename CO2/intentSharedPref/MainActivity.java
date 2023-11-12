package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button bt1;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.ET1);
        et2=findViewById(R.id.ET2);
        bt1=findViewById(R.id.B1);

        sp=getSharedPreferences("login",MODE_PRIVATE);

    }


    public void log(View view) {
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("Username",et1.getText().toString());
        ed.putString("Password",et2.getText().toString());
        ed.commit();
        Intent i=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(i);

    }
}

