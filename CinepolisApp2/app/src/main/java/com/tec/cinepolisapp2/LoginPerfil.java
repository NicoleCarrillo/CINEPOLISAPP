package com.tec.cinepolisapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPerfil extends AppCompatActivity {

    EditText nickname, password;
    Button loginLButton, registerLButton;
    String name="Luis Nuñez",pass="1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_perfil);

        nickname = (EditText)findViewById(R.id.nicknameLField);
        password = (EditText)findViewById(R.id.passwordLField);
        loginLButton = (Button)findViewById(R.id.loginLButton);
        registerLButton = (Button)findViewById(R.id.registerLButton);

        loginLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String entryNickname = nickname.getText().toString();
                String entryPassword = password.getText().toString();

                if(name.equals(entryNickname)&& pass.equals(entryPassword)){
                    Toast.makeText(getApplicationContext(),"Login exitoso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginPerfil.this, Perfil.class);
                    intent.putExtra("message", entryNickname);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(getApplicationContext(),"Datos incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        registerLButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginPerfil.this, Registrar.class);
                startActivity(intent);

            }
        });

    }
}