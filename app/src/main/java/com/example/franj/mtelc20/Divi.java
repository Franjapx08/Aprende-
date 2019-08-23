package com.example.franj.mtelc20;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Divi extends AppCompatActivity {
    String [] datos = new String[10];
    Button facil, medio, difil;
    ImageButton help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divi);


        facil = (Button) findViewById(R.id.facilDivi);
        facil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = 10;
                Intent facil = new Intent(getApplicationContext(), suma_facil.class);
                facil.putExtra("datos", a);
                startActivity(facil);//Inicia la actividad

                /*
                Intent intent = new Intent(getApplicationContext(), suma_facil.class);
                startActivity(intent);
               */
                finish();
            }
        });

        help = (ImageButton) findViewById(R.id.helpDiv);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.monografias.com/trabajos88/aprende-sumar-restar-multiplicar-y-dividir/aprende-sumar-restar-multiplicar-y-dividir.shtml");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                finish();
            }
        });

        medio = (Button) findViewById(R.id.medioDivi);
        medio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = 11;
                Intent facil = new Intent(getApplicationContext(), suma_facil.class);
                facil.putExtra("datos", a);
                startActivity(facil);//Inicia la actividad

                /*
                Intent intent = new Intent(getApplicationContext(), suma_facil.class);
                startActivity(intent);
               */
                finish();
            }
        });

        difil = (Button) findViewById(R.id.perroDivi);
        difil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = 12;
                Intent facil = new Intent(getApplicationContext(), suma_facil.class);
                facil.putExtra("datos", a);
                startActivity(facil);//Inicia la actividad

                /*
                Intent intent = new Intent(getApplicationContext(), suma_facil.class);
                startActivity(intent);
               */
                finish();
            }
        });

    }
}
