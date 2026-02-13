package es.iescamas.estructura;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        
    	PilaArray pila = new PilaArray();
    	
    	pila.push(5);
    	pila.push(10);
    	pila.push(16);
    	
    	System.out.println(pila.peek()); // 16
    	System.out.println(pila.pop()); // 16
    	System.out.println(pila);		// 5,10
    }
}
