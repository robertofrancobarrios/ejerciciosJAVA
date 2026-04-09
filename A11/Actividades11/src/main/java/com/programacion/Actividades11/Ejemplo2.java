package com.programacion.Actividades11;

import java.io.*;

// Leer enteros de un archivo binario

public class Ejemplo2 {

	public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("numeros.dat"));

        try {
            while(true){
                System.out.println(dis.readInt());
            }
            
        } catch(EOFException e){
            System.out.println("Fin del fichero");
        }

        dis.close();
    }
}