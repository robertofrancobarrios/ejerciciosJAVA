package com;

import java.util.Scanner;

public class TablaDeMultiplicarWhile {

	public static void main(String[] args) {
		int Multiplicando ;
	     
        System.out.println("¿Que tabla desea Realizar?");
        Scanner sc = new Scanner(System.in);
        Multiplicando = sc.nextInt();

        int multiplicador = 1;
        while(multiplicador <=10){
        System.out.println(Multiplicando + " X " + multiplicador + " = " + Multiplicando * multiplicador );
        multiplicador++;
    
        }
    } 
}