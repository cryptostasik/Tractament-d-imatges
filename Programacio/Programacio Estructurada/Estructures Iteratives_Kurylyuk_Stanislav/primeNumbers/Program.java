/*
 * Program.java 1.0 20/11/2025
 *
 * exercici49
 *
 * Donats dos nombres enters positius n1 i n2 amb n1 < n2 i 1 < n1,
 * escriu els nombres primers que hi ha dins l’interval [n1, n2] en ordre creixent
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {

    /**
	* Checks if a number is prime.
	* @param num number to check
	* @return true if prime, false otherwise
	*/
    public static boolean esPrimer(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        // Just check divisors up to the square root
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

	/**
	* Write all prime numbers in the interval [n1, n2] in ascending order
	* @param n1 lower bound (inclusive)
	* @param n2 upper bound (inclusive)
	*/
    public static void escriuPrimers(int n1, int n2) {
        boolean primerTrobat = false;

        for (int i = n1; i <= n2; i++) {
            if (esPrimer(i)) {
                if (primerTrobat) {
                    System.out.print(" ");
                }
                System.out.print(i);
                primerTrobat = true;
            }
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
		Program p = new Program();
        int n1 = 10, n2 = 30;
        System.out.printf("Nombres primers entre %d i %d: ", n1, n2);
        p.escriuPrimers(n1, n2);
    }
}
