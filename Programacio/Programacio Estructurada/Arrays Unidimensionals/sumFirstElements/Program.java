/*
 * Program.java 1.0 26/11/25
 *
 * exerciciv7
 *
 * Donada una taula numèrica d'enters i un nombre enter x, 
 * escriu els x primers elements de la taula i retorna la seva suma.
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
	 /**
     * Given a table of integers and a number between x, 
     * write the first x elements of the table and return its sum.
     */
	public int sumFirstElements(int[] array,int x){
		int suma = 0;
        for (int i = 0; i < x; i++) {
			if (i < x){
				suma += array[i];
				System.out.printf("El segon numero de array es %d\n" ,array[i] );
				}
            }
        System.out.println("");
        return suma;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 5, 4, 8, 4, 5, 8};
        int x = 5;
        Program p = new Program();
        System.out.println("Suma es:" + p.sumFirstElements(numbers, x));
    }
}
