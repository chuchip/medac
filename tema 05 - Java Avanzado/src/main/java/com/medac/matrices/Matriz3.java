package com.medac.matrices;


public class Matriz3 {
    public static void main(String[] args) {
        int numElementos=5;
        char[] matrizChars= new char[numElementos]; // Se define una matriz de 5 elementos

        matrizChars[0]='a'; // Primer elemento
        matrizChars[2]='b'; // Elemento numero 2

        for (int n=0;n<matrizChars.length;n++)
        {
            System.out.println("El elemento "+n+" de la matriz de Chars tiene el valor: "+matrizChars[n]);
        }
        System.out.println("\n\n");
        funcion2();
        funcion3();

    }
    static void funcion2()
    {
        String[] matrizTextos= new String[5]; // Se define una matriz de 5 elementos

        matrizTextos[0]="Primer elemento";
        matrizTextos[1]="null";
        matrizTextos[2]="Segundo elemento";

        for (int n=0;n<matrizTextos.length;n++)
        {
            System.out.println("El elemento "+n+" de la matriz de Textos tiene el valor: "+matrizTextos[n]);
        }
    }
    static void funcion3()
    {
        int[] matrizNumeros= new int[5]; // Se define una matriz de 5 elementos
        int numero;
        char caracter;

        matrizNumeros[0]=1;
        matrizNumeros[2]=2;

        for (int n=0;n<matrizNumeros.length;n++)
        {
            System.out.println("El elemento "+n+" de la matriz de Textos tiene el valor: "+matrizNumeros[n]);
        }
    }
}