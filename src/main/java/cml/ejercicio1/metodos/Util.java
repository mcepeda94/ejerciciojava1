package cml.ejercicio1.metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Util {

    private final String NOMBRE_ARCHIVO = "listaPacientes.txt";

    //Valida si el archivo existe, si no existe lo crea
    public boolean existeArchivo() {

        try {

            File file = new File("./" + NOMBRE_ARCHIVO);
            //Si el archivo no existe, se crea!
            if (!file.exists()) {
                file.createNewFile();
            }
            return true;
            
        } catch (FileNotFoundException ex) {
            System.out.println("Ocurrio un error al leer el archivo " + NOMBRE_ARCHIVO + " " + ex.getMessage());
            return false;
        } catch (IOException ex) {
            System.out.println("Ocurrio un error al leer el archivo " + NOMBRE_ARCHIVO + " " + ex.getMessage());
            return false;
        }
    }
    
    //Lee el archivo y devuelve el buffer con el resultado de la lectura
    public BufferedReader leerArchivo() {
        BufferedReader leerArchivo = null;
        try {

            if(existeArchivo()){
                leerArchivo = new BufferedReader(new FileReader("./" + NOMBRE_ARCHIVO));
            }

            return leerArchivo;
        } catch (FileNotFoundException ex) {
            System.out.println("Ocurrio un error al leer el archivo " + NOMBRE_ARCHIVO + " " + ex.getMessage());
            return leerArchivo;
        } catch (IOException ex) {
            System.out.println("Ocurrio un error al leer el archivo " + NOMBRE_ARCHIVO + " " + ex.getMessage());
            return leerArchivo;
        }
    }

    //escribe en el archivo el string que se le envia por parametro
    public void escribirArchivo(String data) {

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            File file = new File("./"+ NOMBRE_ARCHIVO);
            
            existeArchivo();

            //flag true, indica adjuntar información al archivo.
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);

        } catch (IOException ex) {
            System.out.println("Ocurrio un error al escribir el archivo " + NOMBRE_ARCHIVO + " " + ex.getMessage());

        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {
                System.out.println("Ocurrio un error al escribir el archivo " + NOMBRE_ARCHIVO + " " + ex.getMessage());
            }
        }

    }

    //escribe en el archivo el string que se le envia por parametro
    public void sobreEscribirArchivo(String data) {

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {

            existeArchivo();

            //flag true, indica adjuntar información al archivo.
            fw = new FileWriter("./"+ NOMBRE_ARCHIVO);
            bw = new BufferedWriter(fw);
            bw.write(data);

        } catch (IOException ex) {
            System.out.println("Ocurrio un error al escribir el archivo " + NOMBRE_ARCHIVO + " " + ex.getMessage());

        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null) {
                    bw.close();
                }
                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {
                System.out.println("Ocurrio un error al escribir el archivo " + NOMBRE_ARCHIVO + " " + ex.getMessage());
            }
        }

    }
    
}
