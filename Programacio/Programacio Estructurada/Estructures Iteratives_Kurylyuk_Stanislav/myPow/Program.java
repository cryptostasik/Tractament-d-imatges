/*
 * Program.java 1.0 07/11/25
 *
 * exercicii18
 *
 * Donats el valor de la base, un nombre enter i l’exponent,
 * un nombre enter no negatiu, calcula el valor de la potència a b . No emprar la funció Math.pow().
 *
 * Copyright 2025  Kurylyuk Stanislav
 */

import java.util.Scanner;

public class Program {
    /**
     * Donats the value of the base, a name enter i l’exponent,
     * a non-negative enter name, calculates the value of the power a b . Do not start the Math.pow() function.
     * 
     * @param args command line arguments (not used)
     */
    public static int multiply(int base, int exponent) {
        int i,potencia;
        potencia = 1;
        for (i = 1 ; i <= exponent; i++) {
			if (i > 0){
				potencia = potencia * base ;
				}
        }
        return potencia;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int base,exponent,resultat;
		
        System.out.print("Introduïu el numero de la (base): ");
        base = s.nextInt();
        System.out.print("Introduïu el numero de la (exponent): ");
        exponent = s.nextInt();

        resultat = multiply(base,exponent);
        System.out.println(resultat);

    }
}
