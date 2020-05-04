package com.tec.intentomil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class Perfil extends AppCompatActivity {

    TextView name,puntos;
    Intent intent;

    ArrayList<String> userInfo;
    int points;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        intent = getIntent();
        name = (TextView)findViewById(R.id.name);
        puntos=(TextView) findViewById(R.id.puntos);

        Random rnd=new Random();
        points=rnd.nextInt(101);

        userInfo = new ArrayList<String>();


        name.setText("Bienvenido "+intent.getStringExtra("message"));
        puntos.setText("Puntos: "+points);





    }
}