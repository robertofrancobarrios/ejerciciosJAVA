package com.programacion.Actividades11;

import java.io.*;

// Copiar audio (no hay audio descargado)

public class Ejemplo7 {
	
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("audio.mp3"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copia.mp3"));

        int dato;
        while((dato = bis.read()) != -1){
            bos.write(dato);
        }

        bis.close();
        bos.close();
    }
}