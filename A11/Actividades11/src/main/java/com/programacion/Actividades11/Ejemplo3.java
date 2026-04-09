package com.programacion.Actividades11;

import java.io.*;

public class Ejemplo3 {

	public static void main(String[] args) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("texto.dat"));

        dos.writeUTF("Hola mundo");
        dos.writeUTF("Java binario");

        dos.close();
    }
}