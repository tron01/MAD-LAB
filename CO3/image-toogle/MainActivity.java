package com.example.imagetoogle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img1,img2,img3,img4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.imageView1);
        img2=findViewById(R.id.imageView2);
        img3=findViewById(R.id.imageView3);
        img4=findViewById(R.id.imageView4);
        t1 = findViewById(R.id.textView2);
        t1.setText("1");
    }

    public  void swap(View view) {

        if (view ==img1){
            img1.setVisibility(View.INVISIBLE);
            img2.setVisibility(View.VISIBLE);
            t1.setText("2");
        } else if (view==img2) {
            img2.setVisibility(View.INVISIBLE);
            img3.setVisibility(View.VISIBLE);
            t1.setText("3");
        } else if (view==img3) {
            img3.setVisibility(View.INVISIBLE);
            img4.setVisibility(View.VISIBLE);
            t1.setText("4");
        } else if (view ==img4) {
            img4.setVisibility(View.INVISIBLE);
            img1.setVisibility(View.VISIBLE);
            t1.setText("1");
        }
    }

}