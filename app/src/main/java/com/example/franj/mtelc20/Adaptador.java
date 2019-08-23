package com.example.franj.mtelc20;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by franj on 08/12/2018.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.PersonViewHolder> {

    //respuestas del usuario
    public static String[] myArray = new String[6];
    //respuestas reales
    public static String [] ArrayResp = new  String[6];
    //validar input
    public static String[] check = new String[6];

    public static class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        Context contex;
        CardView cv;
        TextView personName;
        ImageView personPhoto;
        TextView hidden, id, num;
        Button a;
        Button ko;
        EditText val;

        PersonViewHolder(View itemView) {
            super(itemView);
            contex =  itemView.getContext();
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
            val = (EditText)itemView.findViewById(R.id.valida);
            hidden = (TextView)itemView.findViewById(R.id.hidden_value2);
            id = (TextView)itemView.findViewById(R.id.hidden_value3);
            a = (Button) itemView.findViewById(R.id.ok);
            ko = (Button) itemView.findViewById(R.id.actp);
            num = (TextView) itemView.findViewById(R.id.num);

        }
        void setOnClick(){
            a.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
                myArray[0] = "x";
            switch (view.getId()) {
                case R.id.ok:

                    int a = Integer.parseInt(hidden.getText().toString());

                    int op = Integer.parseInt(id.getText().toString());


                    if(val.getText().toString().equals("")){


                        if (myArray[op] == "F" || myArray[op] == "V"){

                            Toast toast1 =
                                    Toast.makeText(contex,
                                            "Usted ya guardo su respuesta:"+check[op], Toast.LENGTH_SHORT);

                            toast1.show();

                            val.setText(check[op]);
                            val.setBackgroundResource(R.color.ColorVal);

                        }else {

                            Toast toast1 =
                                    Toast.makeText(contex,
                                            "Coloque algo en el input", Toast.LENGTH_SHORT);

                            toast1.show();
                            //   val.setBackgroundResource(R.color.ColorBad);
                        }

                    }else {
                        //cambia colo input
                        val.setBackgroundResource(R.color.ColorVal);
                        //guarda respeusta correcta
                        ArrayResp[op] = String.valueOf(a);
                        int b = Integer.parseInt(val.getText().toString());
                        check[op] = String.valueOf(b);
                         if (a == b) {
                           Toast toast1 =
                                    Toast.makeText(contex,
                                           "Guardado", Toast.LENGTH_SHORT);
                            toast1.show();
                           //  DataAsk.getInstance().setPuntos(DataAsk.getInstance().getPuntos() + 5);
                             myArray[op] = "V";
                        } else {
                             myArray[op] = "F";
                            Toast toast1 =
                                    Toast.makeText(contex,
                                            "Guardado", Toast.LENGTH_SHORT);
                            toast1.show();
                        }
                    }
                    break;
            }
        }
    }

    List<PersonTest> persons;
    Adaptador(List<PersonTest> persons){
        this.persons = persons;
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.setOnClick();
        personViewHolder.personName.setText(persons.get(i).name);
      //  personViewHolder.personAge.setText(persons.get(i).age);
        personViewHolder.personPhoto.setImageResource(persons.get(i).photoId);
        personViewHolder.hidden.setText(persons.get(i).idd);
        personViewHolder.id.setText(persons.get(i).id);
        personViewHolder.num.setText(persons.get(i).id);
        // personViewHolder.a.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }


}
