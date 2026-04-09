/*
 * Program.java 1.0 07/11/25
 *
 * exercicii19
 *
 * Donat un nombre enter positiu calcula el seu factorial. 
 * El factorial d’un nombre enter positiu n es defineix com: n! = 1 × 2 × 3 × ...× ( n−1 ) × n
 *
 * Copyright 2025  Kurylyuk Stanislav
 */

import java.util.Scanner;

public class Program {
    /**
     * Donat a name enter positiu calculates the factorial seu. 
	 * The factorial of a positive enter name is defined as: n! = 1 × 2 × 3 × ...× ( n−1 ) × n
     * 
     * @param args command line arguments (not used)
     */
    public static int factorial(int n) {
        int i,factorial;
        factorial = 1;
        for (i = 1 ; i <= n; i++) {
			if (i > 0){
				factorial = factorial * i ;
				}
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n,resultat;
		
        System.out.print("Introduïu el numero de la (factorial): ");
        n = s.nextInt();

        resultat = factorial(n);
        System.out.println(resultat);

    }
}
