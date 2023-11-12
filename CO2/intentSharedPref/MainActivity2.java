package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tname,tpass;
    SharedPreferences sp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tname=findViewById(R.id.t_name);
        tpass=findViewById(R.id.t_pass);
        sp=getSharedPreferences("login",MODE_PRIVATE);
        String name=sp.getString("Username","ABC");
        String pass=sp.getString("Password","123");
        tname.setText(name);
        tpass.setText(pass);
    }
}