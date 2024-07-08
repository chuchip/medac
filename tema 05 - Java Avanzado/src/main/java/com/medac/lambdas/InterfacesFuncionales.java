package com.medac.lambdas;

import java.util.Arrays;
import java.util.List;

public class InterfacesFuncionales {
    public static void main(String[] args) throws Throwable {
        List<String> lista = Arrays.asList("pepe", "luis", "maria");

        String parte = lista.get(1).substring(1, 3);


        List lista2 = Arrays.asList("pepe", "luis", "maria");

        // String parte2=lista2.get(1).substring(1,3); // Java da error
        String parte2 = ((String) lista2.get(1)).substring(1, 3);
        consumer();
    }
    static void consumer()
    {
        List<String> lista = Arrays.asList("pepe", "luis", "maria");

        // Iterando sobre una lista
        for (String nombre: lista)
        {
            System.out.println("Nombre es: "+nombre);
        }
        System.out.println("------------------------------------------");
        System.out.println("Usando una expresion lambda en un foreach");
        System.out.println("------------------------------------------");
        lista.forEach(nombre -> System.out.println("Nombre es: "+nombre));
    }

}
