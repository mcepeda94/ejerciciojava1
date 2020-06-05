package cml.ejercicio1.metodos;

import java.io.BufferedReader;
import java.io.IOException;

public class Buscar {

    public boolean buscar(String palabra) {
        
        boolean existe = false;
        Util util = new Util();
        
        //leer archivo
        BufferedReader archivo = util.leerArchivo();
               
        // LINEA LEIDA
        String lineaLeida;
        try {
            // MIENTRAS LA LINEA LEIDA NO SEA NULL
            while ((lineaLeida = archivo.readLine()) != null) {
                String[] palabras = lineaLeida.split(" ");
                
                //Busca solo por rut
                if (palabras[0].equals(palabra)) {
                        existe=true;
                    }
                
                /*for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].equals(palabra)) {
                        existe=true;
                    }
                }*/
            }
        } catch (IOException ex) {
            System.out.println("Error al ejecutar la busqueda "+ex.toString());
        }
        
        return existe;
    }
    
    public String buscarModificar(String rut,String nombre,String apellido,int edad,boolean estadoCovid,String fechaIn){
        
        boolean existe = false;
        Util util = new Util();
        
        //leer archivo
        BufferedReader archivo = util.leerArchivo();
        
        //variable que guardara el contenido del texto
        String texto="";
        
        //armamos un String con los datos entrantes
        String data = rut + " " + nombre + " " + apellido + " " + edad + " " + estadoCovid + " " + fechaIn + "\n";
        
        // LINEA LEIDA
        String lineaLeida;
        try {
            // MIENTRAS LA LINEA LEIDA NO SEA NULL
            while ((lineaLeida = archivo.readLine()) != null) {
                String[] palabras = lineaLeida.split(" ");
                
                //Busca solo por rut y modifica los datos
                if (palabras[0].equals(rut)) {
                    texto=texto+data;
                } else{
                    texto=texto+lineaLeida+ "\n";
                }

            }
        } catch (IOException ex) {
            System.out.println("Error al ejecutar la busqueda "+ex.toString());
        }
        
        return texto;
    }
    
    public String buscarEliminar(String rut){
        
        boolean existe = false;
        Util util = new Util();
        
        //leer archivo
        BufferedReader archivo = util.leerArchivo();
        
        //variable que guardara el contenido del texto
        String texto="";

        // LINEA LEIDA
        String lineaLeida;
        try {
            // MIENTRAS LA LINEA LEIDA NO SEA NULL
            while ((lineaLeida = archivo.readLine()) != null) {
                String[] palabras = lineaLeida.split(" ");
                
                //Busca solo por rut y lo ignora
                if (!palabras[0].equals(rut)) {
                    texto=texto+lineaLeida+ "\n";
                }

            }
        } catch (IOException ex) {
            System.out.println("Error al ejecutar la busqueda "+ex.toString());
        }
        
        return texto;
    }

}
