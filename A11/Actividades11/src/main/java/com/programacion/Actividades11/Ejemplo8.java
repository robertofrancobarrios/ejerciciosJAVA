package com.programacion.Actividades11;

import java.io.*;

/**
 * [C]RUD DE OBJETOS EN BINARIO
 * CREATE
 */

public class Ejemplo8 {
	public static void main(String [] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));

        oos.writeObject(new Alumno(1,"Ana",7.5));
        oos.writeObject(new Alumno(2,"Luis",8.2));

        oos.close();
	}
}
