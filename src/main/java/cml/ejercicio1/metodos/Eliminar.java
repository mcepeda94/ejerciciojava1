package cml.ejercicio1.metodos;

import java.util.Scanner;


public class Eliminar {

    public void Eliminar() {
        Util util = new Util();
        Buscar buscar = new Buscar();

        System.out.println("------------------------------");
        System.out.println("Eliminar Registro Paciente:");
        System.out.println("------------------------------");

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese Rut: ");
        String rut = in.nextLine();

        if (buscar.buscar(rut)) {

            String data = buscar.buscarEliminar(rut);

            util.sobreEscribirArchivo(data);

        } else {
            System.out.println("El paciente no se encuentra ingresado");
        }
    }
}
