package test;

import clases.Persona;

public class Main {
    public static void main(String[] args) {
        Persona karla = new Persona("Karla Jiménez", 19, "Estudiante");
        System.out.println( karla.getNombre() );
    }
}