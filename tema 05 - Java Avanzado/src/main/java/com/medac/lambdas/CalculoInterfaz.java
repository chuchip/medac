package com.medac.lambdas;

@FunctionalInterface
public interface CalculoInterfaz {
    int calcular(int n1,int n2);


    default void imprime(int n1)
    {
        System.out.println("El valor de n1 es: "+n1);
    }
}

