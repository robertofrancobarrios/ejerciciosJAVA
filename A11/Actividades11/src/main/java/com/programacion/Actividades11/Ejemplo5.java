package com.programacion.Actividades11;

import java.io.*;

// Leer un objeto de un archivo binario


public class Ejemplo5 {

	public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"));

        Persona p = (Persona) ois.readObject();

        System.out.println(p.nombre + " - " + p.edad);

        ois.close();
    }
}