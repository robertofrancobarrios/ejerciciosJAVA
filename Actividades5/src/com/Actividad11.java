package com;

import java.util.Scanner;

public class Actividad11 {
	public static void main(String[] args) {
        int[][] m = new int[4][4];
        leerMatriz(m);

        int suma = sumaFila(m, 0); // Suma de referencia: primera fila
        boolean magica = true;

        // Verificar filas
        for (int i = 1; i < 4 && magica; i++) {
            if (sumaFila(m, i) != suma) {
                magica = false;
            }
        }

        // Verificar columnas
        for (int j = 0; j < 4 && magica; j++) {
            if (sumaColumna(m, j) != suma) {
                magica = false;
            }
        }

        // Resultado
        if (magica)
            System.out.println("La matriz es mágica. Todas las filas y columnas suman " + suma);
        else
            System.out.println("La matriz NO es mágica.");
    }

    // MÉTODO PARA LEER LA MATRIZ
    public static void leerMatriz(int[][] m) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los elementos de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
    }

    // PARA SUMAR UNA FILA
    public static int sumaFila(int[][] m, int fila) {
        int suma = 0;
        for (int j = 0; j < 4; j++) {
            suma += m[fila][j];
        }
        return suma;
    }

    // MÉTODO PARA SUMAR UNA COLUMNA
    public static int sumaColumna(int[][] m, int columna) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += m[i][columna];
        }
        return suma;
    }
}
