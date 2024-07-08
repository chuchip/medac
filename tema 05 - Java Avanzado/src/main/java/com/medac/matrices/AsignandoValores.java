package com.medac.matrices;


public class AsignandoValores {
    public static void main(String[] args) {

        char[] matrizTexto= new char[50]; // Se define una matriz de 50 elementos

        matrizTexto[0]='a'; // Primer elemento
        matrizTexto[10]='b'; // Elemento numero 11
        matrizTexto[-1]='.'; // Elemento numero 50  no existe. Dara un error.
    }
}