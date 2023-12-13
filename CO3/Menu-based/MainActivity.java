package com.example.menuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //    return super.onCreateOptionsMenu(menu);
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       // return super.onOptionsItemSelected(item);
        int itemId = item.getItemId();
        if(itemId ==R.id.android){
            Toast.makeText(this, "android", Toast.LENGTH_SHORT).show();
            return  true;
        } else if (itemId ==R.id.name) {
            Toast.makeText(this, "name", Toast.LENGTH_SHORT).show();
        } else if (itemId ==R.id.profile) {
            Toast.makeText(this, "profile", Toast.LENGTH_SHORT).show();
            return  true;
        } else if (itemId ==R.id.setting) {
            Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
            return  true;
        } else if (itemId ==R.id.photo) {
            Toast.makeText(this, "photo", Toast.LENGTH_SHORT).show();
            return  true;
        }

        return  true;

    }
}