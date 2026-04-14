package com.programacion.EJ6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>(List.of(1, 10, 4, 5, 7, 9, 8, 2, 13, 22));
		Iterator<Integer> it = numeros.iterator();
		
		while(it.hasNext()) {
			Integer num = it.next();
			if(num % 2 == 0) {
				it.remove();
			}
		}
		
		System.out.println(numeros);

	}
	

}
