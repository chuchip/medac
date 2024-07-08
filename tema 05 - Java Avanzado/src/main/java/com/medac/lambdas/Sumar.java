package com.medac.lambdas;

        public class Sumar extends Calculo{
            public static void main(String[] args) throws Throwable{
                CalculoInterfaz sumar=new Sumar();
                System.out.println("La suma de 1 y 2 es: "+sumar.calcular(1,2));
            }

            @Override
            public int calcular(int n1, int n2) {
                return n1+n2;
            }
        }

