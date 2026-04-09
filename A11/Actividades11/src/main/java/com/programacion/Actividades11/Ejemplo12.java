package com.programacion.Actividades11;

import java.io.*;

/**
 * BORRADO LÓGICO
 */

public class Ejemplo12 {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("temp.dat"));

        try {
            while (true) {
                Alumno a = (Alumno) ois.readObject();

                // Borrado lógico
                if (a.id == 2) {
                    a.activo = false;
                }

                oos.writeObject(a);
            }
        } catch (EOFException e) {
            // Fin del fichero
        }

        ois.close();
        oos.close();

        new File("alumnos.dat").delete();
        new File("temp.dat").renameTo(new File("alumnos.dat"));
    }
}