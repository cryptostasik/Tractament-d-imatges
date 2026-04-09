/*
 * exercici4.java 1.0 29/09/25
 *
 * Calcula la mitja aritmètica de tres nombres reals
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

public class Program {
    /**
     * Calculates the average of four numbers.
     *
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @param d the fourth number
     * @return the average of the four numbers
     */
    public static double average(double a, double b, double c, double d) {
        // Compute the average by summing all numbers and dividing by 4
        return (a + b + c + d) / 4;
    }

    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double d = 6.0;
		exercici4 p = new exercici4();
        double suma = p.average(a, b, c, d);
        System.out.println(suma);
    }
}
