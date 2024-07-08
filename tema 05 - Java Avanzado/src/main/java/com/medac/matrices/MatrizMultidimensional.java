package com.medac.matrices;


public class MatrizMultidimensional {
    public static void main(String[] args) {

        String[][][] matrizTexto = new String[2][3][4]; // Se define una matriz de 5x3x4 elementos

        matrizTexto[0][0][0] = "0-0-0";
        matrizTexto[0][1][1] = "0-1-1";

        matrizTexto[1][0][1] = "1-0-1";
        matrizTexto[1][2][2] = "1-2-2";
        // matrizTexto[2][0] = "2-0"; Daria error
        System.out.println("Longitud de la primera dimension de  matrizTexto: " + matrizTexto.length);
        System.out.println("Longitud de la segunda dimension de  matrizTexto: " + matrizTexto[0].length);
        System.out.println("Longitud de la tercera dimension de  matrizTexto: " + matrizTexto[0][0].length);

        for (int n = 0; n < matrizTexto.length; n++) {
            for (int n1 = 0; n1 < matrizTexto[0].length; n1++)
                for (int n2 = 0; n2 < matrizTexto[0][0].length; n2++)
                     System.out.println("El elemento [" + n + "]-[" + n1 + "]-["+n2+"] de la matriz de Chars tiene el valor: " + matrizTexto[n][n1][n2]);
        }


    }
}
