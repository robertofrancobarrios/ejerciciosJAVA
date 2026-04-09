package com.programacion.Actividades11;


// Copiar imagen

import java.io.*;

public class Ejemplo6 {
	
	public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("origen.jpg");
        FileOutputStream fos = new FileOutputStream("copia.jpg");

        int dato;
        while((dato = fis.read()) != -1){
            fos.write(dato);
        }

        fis.close();
        fos.close();
    }
}
