package es.iescamas.programacion.ej2;

/**
 *  Dados dos arrays de caracteres, implementa un método que combine los elementos alternando uno de cada array,
 *   y devuelva un nuevo array resultante. Además, todas las letras mayúsculas deben convertirse a minúsculas.
 */

public class Ej2_Arrays {
	
	 public static String combinarArrays(char[] array1, char[] array2) {
	     
		 int n = array1.length;
		 int m = array2.length;
		 int longitudTotal = array1.length + array2.length;
	        
		 char[] resultado = new char [n+m];
		 
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        
	       while (i < n && j < m) {
	    	   resultado[k++] = Character.toLowerCase(array1[i++]);
	    	   resultado[k++] = Character.toLowerCase(array2[j++]);
	    	   
	       }
	       
	       while (i < n) {
	    	   resultado[k++] = Character.toLowerCase(array1[i++]);
	       }
	       
	       while (j < m) {
	    	   resultado[k++] = Character.toLowerCase(array2[j++]);
	       }
	       
	       
		   return new String(resultado);
	       
	       
	        
	 }
}