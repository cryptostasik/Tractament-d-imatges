/*
 * exercici15.java 1.0 29/09/25
 *
 * Determina si un nombre real és positiu.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

public class exercici15 {
    /**
     * Determines if a real number is positive.
     *
     * @param a the real number to check 
     * @return true if the number is positive, false otherwise or 0 false
     */
    public static boolean isPositive(double a) {
		// Returns true if the input number is greater than zero
        boolean	isPositive;
        isPositive = a > 0;
        return isPositive;
    }

    public static void main(String[] args) {
		// Initialize a test number
        double a = - 1.0;
        exercici15 p = new exercici15();
        // Check if the number is positive
        boolean isPositive = p.isPositive(a);
        // Print the result
        System.out.println("Is " + a + " positive? " + isPositive);
        
    }
}
