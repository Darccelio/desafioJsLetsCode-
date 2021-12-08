package com.letscode.taboada;

import com.letscode.taboada.service.Operacoes;
import com.letscode.taboada.utils.Impressora;
import com.letscode.taboada.utils.Leitor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float numeroTaboada = Leitor.scanerNumero();
        String taboada = Arrays.toString(Operacoes.taboadaSoma(numeroTaboada));
        Impressora.imprimirTaboada(taboada);

    }
}
