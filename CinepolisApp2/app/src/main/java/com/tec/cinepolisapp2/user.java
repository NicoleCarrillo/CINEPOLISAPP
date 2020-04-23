package com.tec.cinepolisapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class user extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        text = findViewById(R.id.textView3);

        Bundle bundle2 = new Bundle(getIntent().getExtras());
        String name = bundle2.getString("Name");

        text.setText(name);

        //display Message:
        Toast.makeText(getApplicationContext(),"TU PERFIL ESTA EN CAMINO: "+name,Toast.LENGTH_LONG).show();
    }
}
