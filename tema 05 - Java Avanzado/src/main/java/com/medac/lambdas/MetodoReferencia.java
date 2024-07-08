package com.medac.lambdas;

public class MetodoReferencia {
    public static void main(String[] args) throws Throwable{
        Persona persona = new Persona("Juan");
        persona::saludar;
        persona.saludar(); // Imprime "Hola, me llamo Juan"
    }

}
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }
}
