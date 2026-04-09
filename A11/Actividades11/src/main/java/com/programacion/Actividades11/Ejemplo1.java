package com.programacion.Actividades11;

import java.io.*;

public class Ejemplo1 {

    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("numeros.dat"))) {

            for(int i = 1; i <= 5; i++) {
                dos.writeInt(i * 10);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}