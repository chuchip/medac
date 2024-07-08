package com.medac.lambdas;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class SumarLambda  {
    public static void main(String[] args) throws Throwable{
       CalculoInterfaz resultado= (a,b) -> {return a+b;};

       resultado= (a,b) -> a+b;


        System.out.println(resultado.calcular(1,3));

        List<Integer> numeros = List.of(1,2,3);




    }

}

