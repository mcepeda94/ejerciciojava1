package cml.ejercicio1.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Opciones {

    public void Opciones() {

        Eliminar eliminarpaciente = new Eliminar();
        Modificar modificarpaciente = new Modificar();
        Agregar agregarPaciente = new Agregar();

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // opcion del usuario

        while (!salir) {
            System.out.println("------------------------");
            System.out.println("¿Que desea Hacer?");
            System.out.println("------------------------");
            System.out.println("Operaciones disponibles:");
            System.out.println("1-	Agregar Paciente");
            System.out.println("2-	Modificar Paciente");
            System.out.println("3-	Eliminar Paciente");
            System.out.println("4-	Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("Agregar");
                        agregarPaciente.Agregar();
                        break;
                    case 2:
                        System.out.println("Modificar");
                        modificarpaciente.Modificar();
                        break;
                    case 3:
                        System.out.println("Eliminar");
                        eliminarpaciente.Eliminar();
                        break;
                    case 4:
                        System.out.println("Adios");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
            
            //validacion para seguir o no seguir
            System.out.println("------------------------");
            System.out.println("¿Desea Continuar?");
            System.out.println("------------------------");
            System.out.println("1-	Si");
            System.out.println("2-	No");
            
            boolean incorrecto = true;
            sn.nextLine();
            while (incorrecto) {
                
                String seguir = sn.nextLine();
                if (seguir.equalsIgnoreCase("1")) {
                    salir = false;
                    incorrecto = false;
                } else if (seguir.equalsIgnoreCase("2")) {
                    salir = true;
                    incorrecto = false;
                } else {
                    System.out.println("Ingrese una opcion valida");
                    System.out.println("1-	Si");
                    System.out.println("2-	No");
                }
            }
        }
    }

}
