package com.example.franj.mtelc20;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class inicio extends AppCompatActivity {

    EditText EdiPago;
    Button suma, divi,multi,resta, salir;
    ListView ResuPago;
    ArrayList<String> iteraciones;
    Spinner spinner;
    ImageButton help, info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        suma = (Button) findViewById(R.id.suma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), suma2.class);
                startActivity(intent);
                //finish();
            }
        });

        resta = (Button) findViewById(R.id.resta);

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Resta.class);
                startActivity(intent);
             //   finish();
            }
        });

        multi = (Button) findViewById(R.id.multi);

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Multi.class);
                startActivity(intent);
              //  finish();
            }
        });

        divi = (Button) findViewById(R.id.divi);

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Divi.class);
                startActivity(intent);
              //  finish();
            }
        });

        help = (ImageButton) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.monografias.com/trabajos88/aprende-sumar-restar-multiplicar-y-dividir/aprende-sumar-restar-multiplicar-y-dividir.shtml");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        info = (ImageButton) findViewById(R.id.config);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), AcercaDe.class);
                startActivity(intent);
              //  finish();
                DataAsk.getInstance().setPuntos(DataAsk.getInstance().getPuntos() + 5);
            }
        });


        salir = (Button) findViewById(R.id.salir);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p = android.os.Process.myPid();
                android.os.Process.killProcess(p);
               // startActivityForResult(p,0);
                finish();
            }
        });




    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_activity_actions, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.guardar:
            /*




                SharedPreferences sharedPref = getSharedPreferences("datos", Context.MODE_PRIVATE);
                String Valor = String.valueOf(sharedPref.getInt("puntos", 0));

                int old = Integer.parseInt(Valor);
                int  oldPto = DataAsk.getInstance().getPuntos();
                int Total = old + oldPto;

                /*
               int puntos = DataAsk.getInstance().getPuntos();
                SharedPreferences sharedPref = getSharedPreferences("datos", Context.MODE_PRIVATE);
                String Valor = String.valueOf(sharedPref.getInt("puntos", 0));
                */
/*
                SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferencias.edit();
                SharedPreferences.Editor puntos = editor.putInt("puntos", Total);
                editor.commit();

                */
/*

                return true;

            case R.id.cuenta:

                Intent intent = new Intent(getApplicationContext(), Cuenta.class);
                startActivity(intent);



                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
*/

}


