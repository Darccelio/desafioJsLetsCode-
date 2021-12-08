package com.letscode.taboada.utils;

public class Impressora {

    private final static String MENSAGEM_INSERCAO_NUMERO = "Por favor, insira um numero .......: ";

    public static void imprimirMensagemEntradaNumero() {
        System.out.print(MENSAGEM_INSERCAO_NUMERO);
    }

    public static void imprimirTaboada(String arrayTaboada) {
        System.out.println(arrayTaboada);
    }
}
