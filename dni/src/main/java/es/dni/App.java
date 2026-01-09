package es.dni;

public class App {

	public static void main(String[] args) {
        ControladorDNI controlador = new ControladorDNI();
        
        // Generar un DNI aleatorio
        String dniGenerado = controlador.generarAleatorioDNI();
        System.out.println("DNI Generado: " + dniGenerado);
        
        // Verificar si el DNI es válido
        boolean esValido = controlador.esValido(dniGenerado);
        System.out.println("¿El DNI es válido? " + esValido);
    }
}