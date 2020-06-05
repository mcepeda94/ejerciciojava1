package cml.ejercicio1.metodos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Agregar {

    public void Agregar() {

        Util util = new Util();
        Buscar buscar = new Buscar();

        System.out.println("------------------------------");
        System.out.println("Registro Nuevo Paciente:");
        System.out.println("------------------------------");

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese Rut: ");
        String rut = in.nextLine();

        System.out.println("Ingrese Nombre: ");
        String nombre = in.nextLine();

        System.out.println("Ingrese Apellido: ");
        String apellido = in.nextLine();

        System.out.println("Ingrese Edad: ");
        int i = in.nextInt();
        in.nextLine();

        System.out.println("Tiene Covid-19?: ");
        System.out.println("1.- SI");
        System.out.println("2.- NO");

        boolean incorrecto = true;

        boolean estadoCovid=false;

        while (incorrecto) {
            String covid = in.nextLine();
            if (covid.equalsIgnoreCase("1")) {
                estadoCovid = true;
                incorrecto = false;
            } else if (covid.equalsIgnoreCase("2")) {
                estadoCovid = true;
                incorrecto = false;
            } else {
                System.out.println("Ingrese una opcion valida");
                System.out.println("Tiene Covid-19?: ");
                System.out.println("1.- SI");
                System.out.println("2.- NO");
            }
            
        }

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String fechaIn = formatter.format(date);

        String data = rut + " " + nombre + " " + apellido + " " + i + " " + estadoCovid + " " + fechaIn + "\n";

        if (buscar.buscar(rut)) {
            System.out.println("El paciente ya se encuentra ingresado");
        } else {
            util.escribirArchivo(data);
        }

    }
}
