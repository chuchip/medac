package com.medac.matrices;

public class MatrizObjetos {
    public static void main(String[] args) {
        MiClase[] misClases=new MiClase[5];

        misClases[0]= new MiClase("Objeto 1");
        misClases[1]= new MiClase("Objeto 2");
        misClases[2]= new MiClase("Objeto 3");

        int n=0;
        for (MiClase miClase : misClases)
        {
            MiClase miClase0=misClases[0];
            if (miClase!=null) // misClases[0]
            {
                System.out.println("Valor de elemento "+n+ " -> "+  miClase.getValor());
            }
            else
            {
                System.out.println("Valor de  elemento "+n+ " es nulo");
            }
            n++;
        }
    }

}

