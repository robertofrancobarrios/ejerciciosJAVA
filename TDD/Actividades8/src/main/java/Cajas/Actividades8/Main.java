package Cajas.Actividades8;

public class Main {
    public static void main(String[] args) {
        Caja c1 = new Caja(20, 40, 60, Unidades.CM);
        Caja c2 = new Caja(1, 2, 3, Unidades.M);

        System.out.println(c1);
        System.out.println("Volumen: " + c1.getVolumen() + " m³");

        System.out.println(c2);
    }
}