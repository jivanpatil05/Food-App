package com.example.foodapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodapp.MainActivity;
import com.example.foodapp.R;

public class LoginActivity extends AppCompatActivity {
    EditText email,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void register(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
    }

    public void home(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));

        email=(EditText) findViewById(R.id.email);
        pass=(EditText) findViewById(R.id.pass);
        login=(Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("jivan123") && pass.getText().toString().equals("jp123"))
                {
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                    finish();
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "sorry Try Agin", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
