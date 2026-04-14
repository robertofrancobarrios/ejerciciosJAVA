package com.programacion.EJ2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EliminarDuplicados {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(1);
		lista.add(2);
		System.out.println("Total (con repetidos): " + lista.size());
		
		Set<Integer> conjunto = new HashSet<Integer>();
		conjunto.addAll(lista);
		System.out.println("Total (sin repetir): " + conjunto.size());
		
		
		List<Integer> lista2 = new ArrayList<Integer>(conjunto);
		for (Integer num : lista2) {
			System.out.println(num);
		}
	}

}
