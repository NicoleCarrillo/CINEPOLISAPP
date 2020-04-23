package com.tec.cinepolisapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {
    Button boton;
    EditText edit1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        boton = findViewById(R.id.button);
        edit1=findViewById(R.id.editText);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle1 = new Bundle();
                bundle1.putString("Name",String.valueOf(edit1.getText()));
                Intent myIntent =new Intent(getApplicationContext(),user.class);
                myIntent.putExtras(bundle1);
                startActivity(myIntent);
            }
        });
    }
}
