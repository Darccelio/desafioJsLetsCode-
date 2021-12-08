package com.letscode.taboada.service;

public class Operacoes {

    public static float[] taboadaSoma(float numero) {

        float[] taboada = new float [10];

        for(int i=0; i <= taboada.length; i++) {
            taboada[i] =  i * numero;
        }

        return taboada;

    }
}

