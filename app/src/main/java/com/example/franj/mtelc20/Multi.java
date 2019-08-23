package com.example.franj.mtelc20;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Multi extends AppCompatActivity {
    String [] datos = new String[10];
    Button facil, medio, difil;
    ImageButton help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);


        facil = (Button) findViewById(R.id.facilMult);
        facil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = 7;
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

        help = (ImageButton) findViewById(R.id.helpMulti);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.monografias.com/trabajos88/aprende-sumar-restar-multiplicar-y-dividir/aprende-sumar-restar-multiplicar-y-dividir.shtml");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                finish();
            }
        });

        medio = (Button) findViewById(R.id.medioMult);
        medio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = 8;
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

        difil = (Button) findViewById(R.id.perroMult);
        difil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = 9;
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
