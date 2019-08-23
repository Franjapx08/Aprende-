package com.example.franj.mtelc20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import static com.example.franj.mtelc20.Adaptador.ArrayResp;
import static com.example.franj.mtelc20.Adaptador.myArray;

public class RespSuma extends AppCompatActivity {

    TextView resp, alert;
    ListView lista;
    Button aceptar;
    ArrayList<String> datos;
    ArrayList<String> respuestas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resp_suma);

        setTitle("Resultados");


        lista = (ListView) findViewById(R.id.lista);
        lista.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Disallow the touch request for parent scroll on touch of child view
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
        //respuestas correctas
        respuestas = new ArrayList<String>();
        //respuestas del usuario
        datos = new ArrayList<String>();
        resp = (TextView)findViewById(R.id.pr);
        alert = (TextView)findViewById(R.id.Fel);
        String nom = "V";
        String nom2 = "F";
        int pnt = 0;
        int pnts = 0;
        for(int n=1;n<myArray.length;n++){
            if(nom == myArray[n]){
                pnt++;
            }else if(nom2 == myArray[n]) {
                pnts++;

                datos.add("Pregunta"+" "+n+" "+"Incorrecta respuesta correcta: "+ArrayResp[n]);

            }
        }
        if (pnts == 0){
            datos.add("No hay errores");
            alert.setText("Felcidades calificación perfecta!!");
        }else {
            datos.add("Errores " + pnts);
            alert.setText("Necesitas estudiar más para una calificación perfecta");
        }

        resp.setText(pnt+" "+"Puntos de 5 En total");

        Arrays.fill(myArray, null);
        Arrays.fill(ArrayResp, null);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.resultados, datos);
        lista.setAdapter(adapter);

        aceptar = (Button) findViewById(R.id.acpe2);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), inicio.class);
                startActivity(intent);
                finish();
            }
        });


    }
    @Override
    public void onBackPressed() {

    }
}
