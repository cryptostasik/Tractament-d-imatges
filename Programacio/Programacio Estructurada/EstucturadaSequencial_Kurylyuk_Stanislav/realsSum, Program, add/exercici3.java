/*
 * exercici3.java 1.0 29/09/25
 *
 * Suma dos nombres reals.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

public class exercici3 {
    /**
     * Calculates the sum of two real numbers.
     *
     * @param a the first real number
     * @param b the second real number
     * @return с the sum of the two real numbers
     */
    public double add(double a, double b) {
        // Add the two real numbers
        double c;
        c = a + b;
        return c;
    }
    public static void main(String[] args) {
        double a, b, c;
        a = -3.0 / 5.0; 
        b = 1.0 / 5.0;  
        exercici3 p = new exercici3();
        c = p.add(a, b);
        System.out.println("Suma = " + c);
    }
}
