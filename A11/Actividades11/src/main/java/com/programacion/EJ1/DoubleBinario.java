package com.programacion.EJ1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DoubleBinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número decimal: ");
		double valor = sc.nextDouble();
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("decimal.dat"))) {
			
			dos.writeDouble(valor);
			System.out.println("Número guardado.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
