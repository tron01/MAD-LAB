package com.example.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText name,pswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        name =findViewById(R.id.name);
        pswd =findViewById(R.id.password);

    }

    public void login(View view){

        String uname ="admin";
        String ps ="123";

        String s1 =name.getText().toString();
        String s2 =pswd.getText().toString();

        if(s1.matches(uname) && s2.matches(ps) ){

            Toast.makeText(this, "logined ", Toast.LENGTH_SHORT).show();
            Intent i =new Intent(this,MainActivity2.class);
            startActivity(i);

        }else {
            Toast.makeText(this, " not logined ", Toast.LENGTH_SHORT).show();

        }

    }

}