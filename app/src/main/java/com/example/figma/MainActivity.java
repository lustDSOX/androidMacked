package com.example.figma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    Button signIn;
    EditText email;
    TextInputEditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.edit_login);
        //password = findViewById(R.id.edit_password);
        signIn = findViewById(R.id.login);

       // email.addTextChangedListener(watcher);
        //password.addTextChangedListener(watcher);

    }

    final TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            if(email.length() >0 && password.length() >0){
                Toast toast = Toast.makeText(getApplicationContext(), "Пора покормить кота!", Toast.LENGTH_SHORT);
                toast.show();
            }
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
    public void Register(View v){
        Intent reg = new Intent(MainActivity.this,register.class);
        startActivity(reg);
    }
}