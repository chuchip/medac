package com.medac.streams;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream1 {
    static List<String> nombres=List.of("Luis","Jose","Maria","Pablo","Andres");
    public static void main(String[] args) throws Throwable{

        inicio();
        filtros();

    }
    static void inicio()
    {
        List<String> nombresConA=new ArrayList<>();
        List<Character> primerasLetras=new ArrayList<>();

        for(String nombre: nombres){
            if(nombre.toUpperCase().contains("A"))
                nombresConA.add(nombre);
        }

        for(String palabraConA: nombresConA){
            primerasLetras.add(palabraConA.charAt(0));
        }
        System.out.println("Primera letra de los nombres que tienen en el nombre la letra A");
        for(char c: primerasLetras){
            System.out.print(c);
        }

        System.out.println("\n-----------------------------------\nUtilizando streams ...");

        primerasLetras = nombres.parallelStream()
                .filter( nombre -> nombre.toUpperCase().contains("A"))
                .map(nombre -> nombre.charAt(0))
                .collect(Collectors.toList());

        primerasLetras.forEach(letra -> System.out.println("Primera letra del nombre "+letra));

    }
    static void colector()
    {
        List<String> nombres2=nombres.stream()
                .filter( nombre -> nombre.toUpperCase().contains("A"))
                .collect(Collectors.toList());
    }
    static void filtros()
    {
        List<String> nombres=List.of("Luis","Jose","Maria","Pablo","Andres");
        nombres.stream()
                .filter( nombre -> {
                    if (nombre.toUpperCase().contains("A"))
                        return true;
                    else
                        return false;
                })
                .forEach(nombre -> System.out.println("Palabras que contienen la letra 'A'"+nombre));

        System.out.println("\n-----------------------------------\nOtra manera de usar un filter ...");
        nombres.stream()
                .filter( new MiFiltro())
                .forEach(nombre -> System.out.println("Palabras que contienen la letra 'A': "+nombre));


        List<String> nombres2=List.of("Luis","Jose","Maria","Pablo","Andres");
        nombres2.stream()
                .filter( nombre ->  nombre.toUpperCase().contains("A") )
                .forEach(nombre -> System.out.println("Palabras que contienen la letra 'A'"+nombre));
    }

    static class MiFiltro implements Predicate<String>
    {
        public MiFiltro()
        {
            System.out.println("En el constructor de mi filtro");
        }
        public boolean test(String nombre)
        {
            if (nombre.toUpperCase().contains("A"))
                return true;
            else
                return false;
        }
    }

    static void mapear()
    {
        List<Integer> longitudNombres= nombres.stream()
                .map( nombre -> nombre.length()).
                collect(Collectors.toList());

    }
}

