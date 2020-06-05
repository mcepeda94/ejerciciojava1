package cml.ejercicio1;

import cml.ejercicio1.metodos.Agregar;
import cml.ejercicio1.metodos.Opciones;

public class Ejecutor {

    static int lineasTotales;
    static int totalCoincidencias;
    public static boolean seguir = true;

    public static void main(String[] args) {

        Agregar agregarpaciente = new Agregar();

        System.out.println("------------------------");
        System.out.println("BIENVENIDO A CLÍNICA CLM");
        System.out.println("------------------------");

        Opciones menu = new Opciones();
        menu.Opciones();

    }

}
