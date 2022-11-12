package com.example.figma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void Register(View v){
        Intent reg = new Intent(register.this,accountCreated.class);
        startActivity(reg);
    }
    public void Login(View v){
        Intent reg = new Intent(register.this,MainActivity.class);
        startActivity(reg);
    }
}