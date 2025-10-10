/*
 * exercici38.java 1.0 10/10/25
 *
 * Obté el nombre mínim d'entre dos nombres reals.
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Finds the minimum of two real numbers.
     * 
     * @param num1 the first real number
     * @param num2 the second real number
     * @return the minimum of the two numbers
     */
    public static double min2(double num1, double num2) {
        // Check if num1 is less than num2
        if (num1 < num2) {
            // Return num1 if it is smaller
            return num1;
        }
        // Return num2 if it is smaller or equal
        return num2;
    }
    public static void main(String[] args) {
		Program p = new Program();
        Scanner s = new Scanner(System.in);
        double num1, num2;

        System.out.println("Introduïu el primer nombre real: ");
        num1 = s.nextDouble();
        System.out.println("Introduïu el segon nombre real: ");
        num2 = s.nextDouble();

        double result = p.min2(num1, num2);

        System.out.printf("El mínim entre %.2f i %.2f és %.2f\n", num1, num2, result);
        s.close();
    }
}
