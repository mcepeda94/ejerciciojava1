package cml.ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;




public class Ejecutor {

    static int lineasTotales;
    static int totalCoincidencias;
    public static boolean seguir = true;

    public static void main(String[] args) {

        //Agregar agregarpaciente = new Agregar();

        System.out.println("------------------------");
        System.out.println("BIENVENIDO A CLÍNICA CLM");
        System.out.println("------------------------");

        while(seguir){
            Opciones menu = new Opciones();
            menu.Opciones();
            
            System.out.println("cml.ejercicio1.Ejecutor.main()");
        }

    }

}
