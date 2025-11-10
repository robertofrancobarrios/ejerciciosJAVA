package com;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int ALUMNOS = 5;
        final int TRIMESTRES = 3;

        // Matriz de notas (5 alumnos x 3 trimestres)
        int[][] notas = new int[ALUMNOS][TRIMESTRES];

        // Leer las notas de los alumnos
        leerNotas(notas, sc);

        // Calcular y mostrar la media del grupo por trimestre
        calcularMediaPorTrimestre(notas);

        // Calcular y mostrar la media de un alumno (por ejemplo, el alumno 3)
        System.out.println("¿De qué alumno quieres calcular la media?");
        int alumnoPos = sc.nextInt(); // Índice 2 corresponde al alumno 3
        calcularMediaAlumno(notas, alumnoPos-1);

        // Mostrar el contenido completo de la matriz para ver las notas de todos los alumnos
        System.out.println("\nNotas de todos los alumnos:");
        mostrarNotas(notas);

        sc.close();
    }

    // Función para leer las notas de los alumnos
    public static void leerNotas(int[][] notas, Scanner sc) {
        final int ALUMNOS = 5;
        final int TRIMESTRES = 3;

        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println("Introduce las notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < TRIMESTRES; j++) {
                System.out.print("  Trimestre " + (j + 1) + ": ");
                notas[i][j] = sc.nextInt();
            }
        }
    }

    // Función para calcular y mostrar la media del grupo por trimestre (por columna)
    public static void calcularMediaPorTrimestre(int[][] notas) {
        final int ALUMNOS = 5;
        final int TRIMESTRES = 3;

        System.out.println("\nMedia del grupo por trimestre:");
        for (int j = 0; j < TRIMESTRES; j++) {
            int suma = 0;
            for (int i = 0; i < ALUMNOS; i++) {
                suma += notas[i][j];
            }
            System.out.println("  Trimestre " + (j + 1) + ": " + (suma / (double) ALUMNOS));
        }
    }

    // Función para calcular la media de un alumno específico (por fila)
    public static void calcularMediaAlumno(int[][] notas, int pos) {
        final int TRIMESTRES = 3;

        int suma = 0;
        for (int j = 0; j < TRIMESTRES; j++) {
            suma += notas[pos][j];  // Sumar las notas del alumno 'pos' en los trimestres
        }
        System.out.println("Media del alumno " + (pos + 1) + ": " + (suma / (double) TRIMESTRES));
    }

    // Función para mostrar las notas de todos los alumnos
    public static void mostrarNotas(int[][] notas) {
        System.out.println(Arrays.deepToString(notas));
    }
}
