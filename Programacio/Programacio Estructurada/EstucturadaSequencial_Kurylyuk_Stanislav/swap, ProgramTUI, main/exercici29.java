/*
 * exercici29.java 1.0 03/10/25
 *
 * Llegeix dos nombres reals introduïts per teclat, posa'ls en dues variables, 
 * intercanvia el contingut de les dues variables i escriu el seu valor per pantalla.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

import java.util.Scanner;

public class exercici29 {
    /**
     * Swap the two variables with each other.
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double var1;
        double var2;
        double swap;

        System.out.print("Introdueix la primera variable : ");
        var1 = s.nextDouble();
        System.out.print("Introdueix la segona variable : ");
        var2 = s.nextDouble();

        // Show the original values
        System.out.println("Abans de l'intercanvi:");
        System.out.println("num1 = " + var1);
        System.out.println("num2 = " + var2);

        // Exchange values
        swap = var1;  
        var1 = var2;
        var2 = swap;

        // Show values ​​after exchange
        System.out.println("Després de l'intercanvi:");
        System.out.println("num1 = " + var1);
        System.out.println("num2 = " + var2);
        s.close();
    }
}
