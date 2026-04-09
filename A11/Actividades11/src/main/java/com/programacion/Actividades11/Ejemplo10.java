package com.programacion.Actividades11;
import java.io.*;

/**
 * BUSCAR ALUMNO POR ID
 */

public class Ejemplo10 {
	
    public static void main(String[] args) throws Exception {
        int buscar = 2;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));

        try{
            while(true){
                Alumno a = (Alumno) ois.readObject();
                if(a.id == buscar){
                    System.out.println("Encontrado: " + a.nombre);
                }
            }
        } catch(EOFException e){}

        ois.close();
    }
}	
