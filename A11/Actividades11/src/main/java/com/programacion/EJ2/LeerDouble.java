package com.programacion.EJ2;

import java.io.*;

public class LeerDouble {
	
	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(new FileInputStream ("decimal.dat"));
		
		try {
			while (true) {
				System.out.println(dis.readDouble());
			}
		} catch(EOFException e) {
			System.out.println("Fin del fichero");
		}
		
		dis.close();
			
		
	}

}
