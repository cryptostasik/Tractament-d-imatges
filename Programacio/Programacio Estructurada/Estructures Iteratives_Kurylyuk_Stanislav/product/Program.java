/*
 * Program.java 1.0 07/11/25
 *
 * exercicii17
 *
 * Donats dos nombres enters positius a i b, calcula a × b
 * fent a + a + a + ... (b vegades)
 *
 * Copyright 2025  Kurylyuk Stanislav
 */

import java.util.Scanner;

public class Program {
    /**
     * Donats two names enters positius a i b, calculates a × b
     * fent a + a + a + ... (b vegades)
     * 
     * @param args command line arguments (not used)
     */
    public static int multiply(int a, int b) {
        int sum = 0;
        // Sumem 'a' exactament 'b' vegades
        for (int i = 0; i < b; i++) {
			if (i > 0){
				sum += a;
				}
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int a,b,resultat;
		
        System.out.print("Introduïu el primer numero (exactament): ");
        a = s.nextInt();
        System.out.print("Introduïu el segon numero (vegades): ");
        b = s.nextInt();

        resultat = multiply(a, b);
        System.out.println(resultat);

    }
}
