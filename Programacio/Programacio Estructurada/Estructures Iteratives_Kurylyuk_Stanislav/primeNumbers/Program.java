/*
 * Program.java 1.0 22/11/2025

 * exercici49 – Nombres primers entre n1 i n2
 * 
 * Donats dos nombres enters positius n 1 i n 2 amb n 1 < n 2 i 1 < n 1 , 
 * escriu els nombres primers que hi ha dins l’interval [n 1 , n 2 ] en ordre creixent.

 * Copyright 2025 Kurylyuk Stanislav
 */

import java.util.Scanner;

public class Program {

    public static void writePrimeNumbers(int n1, int n2) {
        int i,j;
        boolean primerTrobat = false;
        for (i = n1; i <= n2; i++) {

            boolean found = true;

            if (i <= 1) found = false;
            else if (i == 2) found = true;
            else if (i % 2 == 0) found = false;
            else {
                for (j = 3; j * j <= i; j += 2) {
                    if (i % j == 0) {
                        found = false;
                        break;
                    }
                }
            }

            if (found) {
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
        Scanner sc = new Scanner(System.in);

        System.out.print("Entra n1: ");
        int n1 = sc.nextInt();

        System.out.print("Entra n2: ");
        int n2 = sc.nextInt();

        System.out.printf("Nombres primers entre %d i %d: ", n1, n2);
        writePrimeNumbers(n1, n2);
    }
}