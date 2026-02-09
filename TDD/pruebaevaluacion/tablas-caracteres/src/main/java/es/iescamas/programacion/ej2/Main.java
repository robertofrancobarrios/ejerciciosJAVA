package es.iescamas.programacion.ej2;

public class Main {

	public static void main(String[] args) {
        char[] array1 = {'A', 'b', 'C'};
        char[] array2 = {'d', 'E', 'f', 'G'};

        String combinado = Ej2_Arrays.combinarArrays(array1, array2);
        System.out.println(combinado);
    }
}

