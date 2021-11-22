package com.empresa.spitnt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText NoDocumento;
    private EditText Password;
    private Button Login;
    private int counter = 5;
    private TextView Info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        NoDocumento = (EditText)findViewById(R.id.etNoDocumento);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);
        Info = (TextView)findViewById(R.id.tvIntentos);

        Info.setText("Número de intentos restantes permitidos: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(NoDocumento.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userNoDocumento, String userPassword){
        if((userNoDocumento.equals("admin")) && (userPassword.equals("1234"))){
           Intent intent = new Intent(Login.this, SesionActivity.class);
           startActivity(intent);
        }else{
            counter--;
            Info.setText("Número de intentos restantes permitidos: " + String.valueOf(counter));
            if (counter == 0){
                Login.setEnabled(false);
            }
        }
    }
}