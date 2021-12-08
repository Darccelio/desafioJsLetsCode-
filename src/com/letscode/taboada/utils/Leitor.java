package com.letscode.taboada.utils;

import java.util.Scanner;

public class Leitor {

    private static Scanner sc = new Scanner(System.in);

    public static float scanerNumero() {
        Impressora.imprimirMensagemEntradaNumero();
        return sc.nextFloat();
    }

}
