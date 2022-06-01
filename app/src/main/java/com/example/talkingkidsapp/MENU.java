package com.example.talkingkidsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MENU extends AppCompatActivity {

    Button juegosboton;
    Button amigosboton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        juegosboton = (Button) findViewById(R.id.juegosboton);

        juegosboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MENU.this, Juegos.class);
                startActivity(i);
            }


        });
        amigosboton = (Button) findViewById(R.id.amigosboton);

        amigosboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MENU.this, AMIGOS.class);
                startActivity(i);
            }

        });
    }
}