package com.example.talkingkidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class INICIO extends AppCompatActivity {

    Button LOGINBOTON;
    Button REGISTROB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        LOGINBOTON = (Button) findViewById(R.id.LOGINBOTON);

        LOGINBOTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(INICIO.this, MENU.class);
                startActivity(i);
            }


        });

    }
}