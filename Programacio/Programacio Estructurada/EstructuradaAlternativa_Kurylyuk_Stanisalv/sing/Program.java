/*
 * exercici42 1.0 24/10/25
 *
 * Determina si un nombre real és positiu, negatiu o zero.
 * El mètode retornarà les cadenes “positiu”, “negatiu” o “zero”, respectivament.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Determines the sign of a real number and returns the result in Catalan.
     * @param number the real number to check
     * @return a string indicating "positiu" (positive), "negatiu" (negative), or "zero"
     */
    public static String sign(double number) {
        // Check if the number is positive
        if (number > 0) {
            return "positiu";
        }
        // Check if the number is negative
        else if (number < 0) {
            return "negatiu";
        }
        // If neither positive nor negative, the number must be zero
        else {
            return "zero";
        }
    }

    /**
     * Main method to run the program and get user input.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Program	p = new Program();
        
        double number;

        // Prompt the user to enter a real number
        System.out.println("Introdueix un nombre real:");
        number = s.nextDouble();

        // Call the sign method and display the result
        String result = p.sign(number);
        System.out.println("El nombre és: " + result);

    }
}
