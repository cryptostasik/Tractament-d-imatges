/*
 * exercici2.java 1.0 29/09/25
 *
 * Suma dos nombres enters
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

public class exercici2 {
    /**
     * Calculates the sum of two integers.
     *
     * @param a the first integer 
     * @param b the second integer 
     * @return c the sum of the two integers
     */
    public int add(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
    public static void main(String[] args) {
        int a, b, suma;
        a = 2;    
        b = 3;
        exercici2 p = new exercici2();
        suma = p.add(a, b);
        System.out.println("Suma = " + suma);
    }
}
