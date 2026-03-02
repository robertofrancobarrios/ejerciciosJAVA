package Actividad6;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Valorable p1 = new Producto(1, "prod1", 10.0);
		Valorable p2 = new Producto(2, "prod2", 3.0);
		Valorable p3 = new Producto(3, "prod3", 100.0);
		Valorable p5 = new Producto(5, "prod5", 100.0);
		Valorable p4 = new Producto(4, "prod4", 5.0);
		Valorable p6 = new Producto(6, "prod6", 5.0);
		Valorable p7 = new Producto(7, "prod7", 2.0);
		Valorable p8 = new Producto(8, "prod8", 2.0);
		
		Valorable[] valorables = {p1, p2, p3, p5, p4, p6, p7, p8};
		
		ordenarPorPrecioAscYNombre(valorables);
		
			System.out.println(Arrays.toString(valorables));
	}
	
	public static void ordenarPorPrecioAscYNombre(Valorable[] arr) {
		// Idea (burbuja):
		for (int i = 0; i < arr.length - 1; i++) {
		  for (int j = 0; j < arr.length - 1 - i; j++) {
			  
			  boolean intercambiar = false;
			  
			  if (arr[j].getPrecio() > arr[j+1].getPrecio()) {
				  intercambiar = true;
				  
			  } else if (arr[j].getPrecio() == arr[j+1].getPrecio()) {
				  if (arr[j].getNombre().compareTo(arr[j+1].getNombre()) > 0) {
					  intercambiar = true; 
				  }
			  }
			  
			  if (intercambiar) {
				  Valorable temp = arr[j];
				  arr[j] = arr[j+1];
				  arr[j+1] = temp;
			  }
		    
		  }
		}
	}
	
}