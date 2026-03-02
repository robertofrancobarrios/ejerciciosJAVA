package Actividad5;

public class Main {

    public static void main(String[] args) {

        Descuentable[] items = new Descuentable[2];

        items[0] = new Producto("PC", 1000);
        items[1] = new Servicio("Reparación", 300);

        double descuento = 10; // 10%

        for (Descuentable item : items) {
            System.out.println(item);
            System.out.println("Precio base: " + item.precioBase());
            System.out.println("Precio con descuento: " + item.precioFinal(descuento));
            System.out.println();
        }
    }
}