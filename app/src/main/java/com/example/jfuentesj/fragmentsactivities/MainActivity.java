package com.example.jfuentesj.fragmentsactivities;

import android.app.Application;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App texto = new App();

        Button btn_fragmento = findViewById(R.id.btn_verfragment);
        btn_fragmento.setText(texto.cambiar);
        btn_fragmento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity","Se inicio la aplicacion");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","Esta en Resumen la aplicacion");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","Esta en pausa la aplicacion");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","Se detuvo la aplicacion");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","Se destruyo la aplicacion");
    }

}
