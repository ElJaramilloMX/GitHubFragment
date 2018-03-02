package com.example.jfuentesj.fragmentsactivities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FragmentActivity extends AppCompatActivity implements TestInterface{
    TextView tv_mensjae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        tv_mensjae = (TextView) findViewById(R.id.tv_saludo);
        App nevomensaje = (App) getApplication();
        tv_mensjae.setText(nevomensaje.mensaje);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        transaction.replace(R.id.fr_fragmento, new CiclodeVidaFragment(this));
        transaction.commit();



    }
    @Override
    public void mostarNombre() {

    }
    @Override
    public void mostaraMaternoApellido() {

    }
    @Override
    public int mostarEdad() {
        return 0;
    }
    @Override
    public void mctodoSpora() {

    }

}
