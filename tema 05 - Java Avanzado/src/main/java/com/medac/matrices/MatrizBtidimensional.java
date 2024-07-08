package com.medac.matrices;


public class MatrizBtidimensional {
    public static void main(String[] args) {

        String[][] matrizTexto = new String[2][3]; // Se define una matriz de 5x3 elementos

        matrizTexto[0][0] = "0-0";
        matrizTexto[0][1] = "0-1";

        matrizTexto[1][0] = "1-0";
        matrizTexto[1][2] = "1-2";
        // matrizTexto[2][0] = "2-0"; Daria error
        System.out.println("Longitud de la primera dimension de  matrizTexto: " + matrizTexto.length);
        System.out.println("Longitud de la segunda dimension de  matrizTexto: " + matrizTexto[0].length);

        for (int n = 0; n < matrizTexto.length; n++) {
            for (int n1 = 0; n1 < matrizTexto[0].length; n1++)
                System.out.println("El elemento [" + n + "]-[" + n1 + "] de la matriz de Chars tiene el valor: " + matrizTexto[n][n1]);
        }
        System.out.println("");
        for (int n = 0; n < matrizTexto.length; n++) {
            System.out.println("El elemento " + n + " de la matriz de Chars tiene el valor: " + matrizTexto[n]); // LLama a la función toString
        }

    }
}
