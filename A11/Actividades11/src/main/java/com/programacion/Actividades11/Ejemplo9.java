package com.programacion.Actividades11;

import java.io.*;

public class Ejemplo9 {
	
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));

        try{
            while(true){
                Alumno a = (Alumno) ois.readObject();
                System.out.println(a.id + " " + a.nombre + " " + a.nota);
            }
        } catch(EOFException e){
            System.out.println("Fin");
        }

        ois.close();
    }
}
