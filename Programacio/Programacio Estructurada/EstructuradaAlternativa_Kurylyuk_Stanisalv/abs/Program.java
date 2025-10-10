/*
 * exercici37.java 1.0 10/10/25
 *
 * Calcula el valor absolut d'un nombre real (sense utilizar Math.abs(x)).
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Calculates the absolute value of a real number without using Math.abs().
     * 
     * @param num the real number to process
     * @return the absolute value of the input number
     */
    public static double abc(double num) {
        // Check if the number is negative
        if (num < 0) {
        // Return the negation of the number if it is negative
            return -num;
        }
        // Return the number as is if it is non-negative
        return num;
    }
    public static void main(String[] args) {
		Program p = new Program();
        Scanner s = new Scanner(System.in);        
        double num, result;

        System.out.println("Introduïu un nombre real (positiu o negatiu): ");
        num = s.nextDouble();
      
        result = p.abc(num);
        System.out.printf("El valor absolut de %.2f és %.2f\n", num, result);

        s.close();
    }
}
