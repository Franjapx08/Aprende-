package com.example.franj.mtelc20;

import java.util.ArrayList;

/**
 * Created by franj on 09/12/2018.
 */

public class DataAsk {

    private static DataAsk ourInstance = new DataAsk();

    public static DataAsk getInstance() {
        return ourInstance;
    }


    int puntos=0;
    private DataAsk() {
    }

    public int getPuntos() {
        return puntos;

    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
