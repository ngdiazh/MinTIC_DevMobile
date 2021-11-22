package com.empresa.spitnt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void btnIngresar(View view){
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }

    public void btnExplorar(View view){
        Intent explorar = new Intent(this, ExploraActivity.class);
        startActivity(explorar);
    }

    public void btnProgresar(View view){
        Intent progresar = new Intent(this, ProgresarActivity.class);
        startActivity(progresar);
    }

}