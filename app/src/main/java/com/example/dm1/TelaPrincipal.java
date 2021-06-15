package com.example.dm1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class TelaPrincipal extends AppCompatActivity {
    Button splash;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        splash = findViewById(R.id.splash_screen);
        login = findViewById(R.id.login);
        setTitle("Tela Principal");

        splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaPrincipal.this, MainActivity.class);
                startActivity(i);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaPrincipal.this, Home.class);
                startActivity(i);
            }
        });

    }
}