package com.grupo2.amst2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //IrMenuPrincipal desplaza la vista del teléfono entre actividades
    public void irMenuPrincipal(View v){
        Intent menuPrincipal = new Intent(getBaseContext(), menu.class);
        startActivity(menuPrincipal);
    }

}