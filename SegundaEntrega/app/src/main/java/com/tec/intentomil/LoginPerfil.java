package com.tec.intentomil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPerfil extends AppCompatActivity {

    EditText nickname, password;
    Button loginLButton;
    String name="Luis",pass="1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_perfil);

        nickname = (EditText)findViewById(R.id.nicknameLField);
        password = (EditText)findViewById(R.id.passwordLField);
        loginLButton = (Button)findViewById(R.id.loginLButton);

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

    }
}