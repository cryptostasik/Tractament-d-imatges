/*
 * Program.java 1.0 10/11/25
 *
 * exercicii31
 *
 * Donat un nombre enter positiu, escriu els nombres de Fibonacci (Lleonard de Pisa) inferiors o iguals a ell. 
 * Els nombres de Fibonacci es defineixen de la manera següent: El primer és 0, el segon és 1, 
 * el següent és la suma dels dos anteriors i així successivament.
 *
 * Copyright 2025  Kurylyuk Stanislav
 */

import java.util.Scanner;

public class Program {
    /**
     * Give a positive name, write the Fibonacci names (Leonard of Pisa) less than or equal to it. 
     * Fibonacci names are defined as follows: The first is 0, the second is 1, 
     * The next one is the sum of the two previous ones and then successively.
     * 
     * @param args command line arguments (not used)
     */
    public static void fibonacci(int limit) {

        if (limit < 0) {
            System.out.println("Error: el número ha de ser positiu o zero.");
            return;
        }

        if (limit == 0) {
            System.out.println("0");
            return;
        }
        int t1 = 0; 
        int t2 = 1;  
        int t3;
        
        System.out.print("Fibonacci " + limit + ": ");
        System.out.print(t1 + " " + t2); 

        while (true) {
            t3 = t1 + t2;
            if (t3 > limit) {
                break;  
            }
            System.out.print(" " + t3);
            t1 = t2;
            t2 = t3;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Program p = new Program();
        System.out.print("Introduïu un nombre enter positiu: ");
        int n = s.nextInt();
        p.fibonacci(n);
    }
}
