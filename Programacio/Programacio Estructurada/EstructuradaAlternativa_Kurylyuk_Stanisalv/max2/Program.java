/*
 * exercici39.java 1.0 13/10/25
 *
 * Obté el nombre màxim d'entre dos nombres reals
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Finds the maximum of two real numbers.
     * 
     * @param num1 the first real number
     * @param num2 the second real number
     * @return the maximum of the two numbers
     */
    public static double max2(double num1, double num2) {
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num1, num2, max, diff;

        System.out.println("Introduïu el primer nombre real: ");
        num1 = s.nextDouble();
        System.out.println("Introduïu el segon nombre real: ");
        num2 = s.nextDouble();

        // Find the maximum
        max = max2(num1, num2);

        // Calculate the absolute difference
        diff = Math.abs(num1 - num2);

        System.out.printf("El màxim entre %.2f i %.2f és %.2f\n", num1, num2, max);
        System.out.printf("La diferència (distància) entre els dos és %.2f\n", diff);

        s.close();
    }
}
