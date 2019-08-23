package com.example.franj.mtelc20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.franj.mtelc20.Adaptador.myArray;

public class suma_facil extends AppCompatActivity {
    private RecyclerView mylista2;
    boolean check = true;
    Button acp, ok;
    EditText campo;
    int valores;

    private List<PersonTest> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma_facil);
        //  final String[][] value = new String[1][1];
        mylista2 = (RecyclerView) findViewById(R.id.mylista);
        acp = (Button) findViewById(R.id.actp);
        // ok = (Button)findViewById(R.id.ok);
        // campo = (EditText)findViewById(R.id.valida);

        acp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int x = 0; x<myArray.length; x++){
                    if (myArray[x] == null){
                        Toast toast1 =
                                Toast.makeText(getApplicationContext(),"Conestar todas las preguntas para ver resultados.", Toast.LENGTH_SHORT);

                        toast1.show();
                        check = false;
                    }else {
                        check = true;
                    }
                }

                if (check) {
                    Intent intentamela = new Intent(getApplicationContext(), RespSuma.class);
                    startActivity(intentamela);
                    finish();
                }

            }
        });


        LinearLayoutManager llm = new LinearLayoutManager(this);
        mylista2.setLayoutManager(llm);
        mylista2.setHasFixedSize(true);



        Bundle extras = getIntent().getExtras();//Variable de tipo Bundle, sirve para cachar los extras.
        valores = extras.getInt("datos");

        int a = 1;
        int b = 1;

        if ( valores == 1){
            setTitle("Suma - Nivel Fácil");
            initializeData();
            initializeAdapter();
        }else if (valores == 2){
            setTitle("Suma - Nivel Medio");
            initializeData2();
            initializeAdapter();
        }
        else if (valores == 3){
            setTitle("Suma - Nivel Difícil");
            initializeData3();
            initializeAdapter();
        }
        else if (valores == 4){
            setTitle("Resta - Nivel Fácil");
            initializeData4();
            initializeAdapter();
        }
        else if (valores == 5){
            setTitle("Resta - Nivel Medio");
            initializeData5();
            initializeAdapter();
        }
        else if (valores == 6){
            setTitle("Resta - Nivel Difícil");
            initializeData6();
            initializeAdapter();
        }
        else if (valores == 7){
            setTitle("Multiplicación - Nivel Fácil");
            initializeData7();
            initializeAdapter();
        }
        else if (valores == 8){
            setTitle("Multiplicación - Nivel Medio");
            initializeData8();
            initializeAdapter();
        }
        else if (valores == 9){
            setTitle("Multiplicación - Nivel Difícil");
            initializeData9();
            initializeAdapter();
        }
        else if (valores == 10){
            setTitle("División - Nivel Fácil");
            initializeData10();
            initializeAdapter();
        }
        else if (valores == 11){
            setTitle("División - Nivel Medio");
            initializeData11();
            initializeAdapter();
        }
        else if (valores == 12){
            setTitle("División - Nivel Difícil");
            initializeData12();
            initializeAdapter();
        }

      //  setupActionBar();

    }

    @Override
    public void onBackPressed() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_op, menu);
        return super.onCreateOptionsMenu(menu);
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_check:
                for (int x = 0; x<myArray.length; x++){
                    if (myArray[x] == null){
                        Toast toast1 =
                                Toast.makeText(getApplicationContext(),"Conestar todas las preguntas para ver resultados.", Toast.LENGTH_SHORT);

                        toast1.show();
                        check = false;
                    }else {
                        check = true;
                    }
                }

                if (check) {
                    Intent intentamela = new Intent(getApplicationContext(), RespSuma.class);
                    startActivity(intentamela);
                    finish();
                }
                return true;
            case R.id.action_back:
                Intent intent6 = new Intent(getApplicationContext(), inicio.class);
                startActivity(intent6);
                TaskStackBuilder.create(getApplicationContext()).addNextIntentWithParentStack(intent6).startActivities();
                //elimina el array global de respuestas
                Arrays.fill(myArray, null);
               // finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

/*
    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);


        }
    }
    */

            //suma
    private void initializeData(){

            persons = new ArrayList<>();
            persons.add(new PersonTest("Hay 5 peras y me como 2. ¿Cuántas quedan?", R.drawable.peras1, "3", "1"));
            persons.add(new PersonTest("Hay 6 magdalenas y me como 2. ¿Cuántas quedan?", R.drawable.cup, "4", "2"));
            persons.add(new PersonTest("Tenía 10 galletas. Si me como 3, ¿cuántas me quedan?", R.drawable.galle, "7", "3"));
            persons.add(new PersonTest("Tengo 7 mariquitas y encuentro 3. ¿Cuántas tengo en total?", R.drawable.insec, "10", "4"));
            persons.add(new PersonTest("Tengo 5 flores y encuentro 3 más. ¿Cuántas tengo en total?", R.drawable.flor, "8", "5"));

    }

    private void initializeData2(){

        persons = new ArrayList<>();
        persons.add(new PersonTest("¿Cuál de las respuestas es lo mismo que 3 + 5 = 8?\n1). 3 + 8 = 11\n" +
                "2). 5 + 3 = 8" +
                "\n3). 4 + 5 = 9", R.drawable.sumas, "2", "1"));
        persons.add(new PersonTest("Kely tiene 2 coches verdes y 4 rojos. ¿Cuántos coches tiene en total?\n1). Tiene 6 coches: 2 + 4 = 6\n" +
                "2). Tiene 8 coches: 4 + 4 = 8" +
                "\n3). Tiene 4 coches: 2 + 2 = 4", R.drawable.carro, "1", "2"));
        persons.add(new PersonTest("Ana ha comido 3 galletas. si aún le quedan 4, ¿cuántas galletas tenía?\n1). No tiene galletas.\n" +
                "2). 6 galletas porque 3 + 3 = 6" +
                "3). 7 galletas porque 3 + 4 = 7", R.drawable.galle, "3", "3"));
        persons.add(new PersonTest("¿Cuál de las respuestas NO es igual a 7?\n1. 6 + 1\n" +
                "2). 7 + 0\n" +
                "3). 2 + 6", R.drawable.sumas, "3", "4"));
        persons.add(new PersonTest("¿Cómo consigues el número 4?\n1). 5 + 2 \n2). 2 + 2 \n3). 7 + 2", R.drawable.sumas, "2", "5"));

    }

    private void initializeData3(){
        persons = new ArrayList<>();
        persons.add(new PersonTest("Hay 7 manzanas. Si Grin y kely compran una cada una, ¿cuántas tienen?\n1). 10 manzanas porque 7 + 3 = 10\n" +
                "2). 9 manzanas porque 7 + 2 = 9\n" +
                "3). 6 manzanas porque 7 + 1 = 8", R.drawable.arbol, "2", "1"));
        persons.add(new PersonTest("¿Cuál de las respuestas NO es igual a 7?\n1). 3 + 4 \n2). 5 + 2 \n3). 5 + 5", R.drawable.sumas, "3", "2"));
        persons.add(new PersonTest("Ana tiene 10 galletas. Si compra dos, ¿cuántas tiene?\n1). 13 porque 10 + 3 = 3\n" +
                "2). 12 porque 10 + 2 = 12\n" +
                "3). 20 porque 10 + 10 = 20", R.drawable.galle, "2", "3"));
        persons.add(new PersonTest("¿Cuál de las respuestas NO es igual a 5?\n1). 4 + 1\n" +
                "2). 7 + 0\n" +
                "3). 2 + 3", R.drawable.sumas, "2", "4"));
        persons.add(new PersonTest("¿Cómo consigues el número 2?\n1). 7 + 2 \n2). 1 + 1 \n3). 7 + 2", R.drawable.sumas, "2", "5"));

    }

            //restas
    private void initializeData4(){

        persons = new ArrayList<>();
        persons.add(new PersonTest("Hay 7 manzanas. Si Rogelio y Jesus se comen una cada uno, ¿cuántas quedan?\n1). 9 manzanas porque 7 + 2 = 9\n" +
                "2). 5 manzanas porque 7 - 2 = 5\n" +
                "3). 6 manzanas porque 7 - 1 = 6", R.drawable.arbol, "2", "1"));
        persons.add(new PersonTest("¿Cuál de las respuestas NO es igual a 2?\n1). 4 - 2 \n2). 6 - 4 \n3). 8 - 2", R.drawable.peras1, "3", "2"));
        persons.add(new PersonTest("Meysi tiene 10 galletas. Si se come dos, ¿cuántas le quedan?\n1). Dos porque 10 - 8 = 2\n" +
                "2). 8 porque 10 - 2 = 8\n" +
                "3). 0 porque 10 - 10 = 0", R.drawable.galle, "2", "3"));
        persons.add(new PersonTest("¿Cuál de las respuestas NO es igual a 5?\n1). 4 + 1\n" +
                "2). 7 + 0\n" +
                "3). 2 + 3", R.drawable.peras1, "2", "4"));
        persons.add(new PersonTest("¿Cómo consigues el número 8?\n1). 10 - 2 \n2). 5 - 8 \n3). 7 - 15", R.drawable.peras1, "1", "5"));

    }

    private void initializeData5(){

        persons = new ArrayList<>();
        persons.add(new PersonTest("Un arbol tiene 10 manzanas y un mono le quita 5, ¿cuántas quedan?\n1). 5 manzanas porque 10 - 5 = 5\n" +
                "2). 8 manzanas porque 10 - 2 = 8\n" +
                "3). 6 manzanas porque 10 - 4 = 6", R.drawable.arbol, "1", "1"));
        persons.add(new PersonTest("¿Cuál de las respuestas NO es igual a 20?\n1). 30 - 10 \n2). 45 - 25 \n3). 8 - 2", R.drawable.peras1, "3", "2"));
        persons.add(new PersonTest("Ana tiene 15 galletas. Si se come dos, ¿cuántas le quedan?\n1). 2 porque 10 - 8 = 2\n" +
                "2). 13 porque 15 - 2 = 13\n" +
                "3). 0 porque 10 - 10 = 0", R.drawable.galle, "2", "3"));
        persons.add(new PersonTest("¿Cuál de las respuestas NO es igual a 55?\n1). 155 - 55\n" +
                "2). 200 - 145\n" +
                "3). 60 - 5", R.drawable.peras1, "1", "4"));
        persons.add(new PersonTest("¿Cómo consigues el número 1?\n1). 7 - 2 \n2). 5 - 4 \n3). 7 - 2", R.drawable.peras1, "2", "5"));

    }

    private void initializeData6(){

        persons = new ArrayList<>();
        persons.add(new PersonTest("Ximena tiene 2500 pesos, ella compro un makeUp de 775 pesos , ¿cuánto dinero le quedo?\n1).  2500 - 775 = 1725\n" +
                "2). 2500 - 775 = 1555\n" +
                "3). 2500 - 775 = 2450", R.drawable.make, "1", "1"));
        persons.add(new PersonTest("¿Cuál de las respuestas NO es igual a 857?\n1). 1857 - 1000 \n2). 1500 -500 \n3). 2850 - 1993", R.drawable.resta, "3", "2"));
        persons.add(new PersonTest("Anel tiene 500 galletas. Si se come 175, ¿cuántas le quedan?\n1). 325 \n" +
                "2). 550\n" +
                "3). 150", R.drawable.galle, "1", "3"));
        persons.add(new PersonTest("¿Cual de estas operaciones NO es igual a 200\n1). 450 - 250\n" +
                "2). 1250 - 1050\n" +
                "3). 1500 - 1200", R.drawable.carro, "3", "4"));
        persons.add(new PersonTest("¿Cómo consigues el número 50?\n1). 7580 - 580 \n2). 5580 - 5530 \n3). 7550 - 2222", R.drawable.cincue, "2", "5"));

    }

        //multiplicaciones 1
    private void initializeData7(){

        persons = new ArrayList<>();
        persons.add(new PersonTest("¿Cuanto es 5 x 5?", R.drawable.suma2, "25", "1"));
        persons.add(new PersonTest("¿Cuanto es 10 x 2?", R.drawable.suma2, "10", "2"));
        persons.add(new PersonTest("Si tengo 20 pesos y quiero darle la mitad a Chuy,¿Cuanto le tengo que dar'", R.drawable.suma2, "20", "3"));
        persons.add(new PersonTest("¿Que numero hace falta? 2 x ... = 6", R.drawable.suma2, "3", "4"));
        persons.add(new PersonTest("¿Cuanto es 3 x 3?", R.drawable.suma2, "9", "5"));

    }

    private void initializeData8(){

        persons = new ArrayList<>();
        persons.add(new PersonTest("Una señora compro 6 paquetes con 3 sodas cada uno, para llevar a una fiesta,¿Cuantas sodas llevara a la fiesta?", R.drawable.suma2, "18", "1"));
        persons.add(new PersonTest("Don Rogelio lleva en su carro 10 cajas con 10 melones cada una.¿Cuantos melones llevara en total?", R.drawable.carro, "100", "2"));
        persons.add(new PersonTest("Yo recogo basura, me pagan 100 pesos a la semana, si ahorro,¿Cuanto tendre en 4 semanas?", R.drawable.suma2, "400", "3"));
        persons.add(new PersonTest("En un rancho se recogen 30 huevos al dia,¿Cuantos huevos tendra en 1 semana?", R.drawable.huevo, "210", "4"));
        persons.add(new PersonTest("Luis gasta 10 pesos al dia en peceros,¿Cuanto gasta a la semana sin contar fines de semana?", R.drawable.auto, "50", "5"));

    }


    private void initializeData9(){

        persons = new ArrayList<>();
        persons.add(new PersonTest("Mi hermano gasta 20 pesos todos los dias en pasajes para ir a la escuela.¿Cuanto gasta al mes sin contar fines de semana?", R.drawable.auto, "400", "1"));
        persons.add(new PersonTest("En una plaza hay 30 carros, si cada auto tiene 4 llantas ¿Cuantas llanas hay en total?", R.drawable.carro, "120", "2"));
        persons.add(new PersonTest("Tengo 7 alumnos y 21 libros. ¿Cuantos libros le tocan a cada alumno?", R.drawable.book, "3", "3"));
        persons.add(new PersonTest("En una caja de pinceles vienen 12 ¿Cuántas tengo en total en 3 cajas?", R.drawable.suma2, "36", "4"));
        persons.add(new PersonTest("Por un dia de trabajo gano 20 pesos, ¿Cuantos dias tengo que trabajar para tener 100?", R.drawable.suma2, "100", "5"));

    }

        //divisiones
    private void initializeData10(){
        persons = new ArrayList<>();
        persons.add(new PersonTest("¿Cuanto es 4 / 2?", R.drawable.divi, "2", "1"));
        persons.add(new PersonTest("¿Cuanto es 10 / 5?", R.drawable.divi, "2", "2"));
        persons.add(new PersonTest("¿Cuanto es 20 / 4?", R.drawable.divi, "5", "3"));
        persons.add(new PersonTest("¿Cuanto es 50 / 10?", R.drawable.divi, "5", "4"));
        persons.add(new PersonTest("¿Cuanto es 1 / 1?", R.drawable.divi, "1", "5"));

    }

    private void initializeData11(){

        persons = new ArrayList<>();
        persons.add(new PersonTest("Hay que distribuir 56 boliches entre 4 niños.\n" +
                "\n" +
                " ¿Cuántos boliches le corresponden a cada niño", R.drawable.divi, "14", "1"));
        persons.add(new PersonTest("Las gallinas de una granja pusieron 675 huevos en una\n" +
                "\n" +
                "semana. Si cada gallina puso 5 huevos, ¿cuántas \n" +
                "\n" +
                "gallinas hay en la granja?", R.drawable.huevo, "135", "2"));
        persons.add(new PersonTest("Un museo envía 432 cuadros a una exposición.\n" +
                "\n" +
                "Si en cada caja caben 4, ¿cuántas cajas se \n" +
                "\n" +
                "necesitan?", R.drawable.divi, "108", "3"));
        persons.add(new PersonTest("Al vivero de Federico llegaron cuatro camiones\n" +
                "cargados con un total de 1.052 plantas.\n" +
                "Si cada camión traía la misma cantidad de\n" +
                "plantas, ¿cuántas cargaba cada camión? ", R.drawable.divi, "263", "4"));
        persons.add(new PersonTest("Tengo 60 pesos  entre 10 hermanos. ¿Cuántas dinero le toco a cada hermano?", R.drawable.divi, "6", "5"));

    }

    private void initializeData12(){

        persons = new ArrayList<>();
        persons.add(new PersonTest("Pepe tiene 1000 bolitas y las quiere repartir entre 25 personas. ¿Cuantas bolitas lleva cada una de las personas?", R.drawable.dulces, "40", "1"));
        persons.add(new PersonTest("En mi jardín tengo 30 manzanos como este, pero se seco la mitad de los manzanos. ¿Cuántas manzanas me quedan?", R.drawable.arbol, "105", "2"));
        persons.add(new PersonTest("Un camión transporta 2.160 refrescos en cajas de 24 refrescos cada una. ¿Cuántas cajas lleva el camión?", R.drawable.auto,"90", "3"));
        persons.add(new PersonTest("En una cesta había 52 huevos y se rompieron la cuarta parte. ¿Cuántos huevos quedaron útiles para la venta?", R.drawable.huevo, "39", "4"));
        persons.add(new PersonTest("¿Cuántos minutos tardará en desalojarse un local con 1750 personas, si cada minuto salen 5?", R.drawable.divi, "350", "5"));

    }

    private void initializeAdapter(){
        Adaptador adapter = new Adaptador(persons);
        mylista2.setAdapter(adapter);
    }

}


