package com.example.franj.mtelc20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Cuenta extends AppCompatActivity {

    TextView ptos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta);
        /*
        int old;
        int Total;

        ptos = (TextView) findViewById(R.id.puntos);

        SharedPreferences sharedPref = getSharedPreferences("datos", Context.MODE_PRIVATE);
        String Valor = String.valueOf(sharedPref.getInt("puntos", 0));
        if (Valor.equals("0")){
            old=0;
            int  oldPto = DataAsk.getInstance().getPuntos();
            Total = old + oldPto;
            ptos.setText(Total);
        }else {
             old = Integer.parseInt(Valor);
            int  oldPto = DataAsk.getInstance().getPuntos();
            Total = old + oldPto;
            ptos.setText(Total);


        }
        */




    }







}
