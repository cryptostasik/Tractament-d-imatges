/*
 * exercici17.java 1.0 29/09/25
 *
 * Donats dos nombres reals a i b, determina si un tercer nombre real està en l'interval obert (a,b).
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {
    /**
     * Checks if a real number is within the open interval (lowerBound, upperBound).
     *
     * @param a lowerBound the lower bound of the interval
     * @param b upperBound the upper bound of the interval
     * @param c number the number to check
     * @return true if the number is within the open interval (lowerBound, upperBound), false otherwise
     */
    public static boolean isInOpenInterval(double a, double b, double c) {
        // Check if the number is greater than lowerBound and less than upperBound
        boolean isInOpenInterval = ((a > c) && (c < b) || (b > c) && (c > a));
        return isInOpenInterval;
    }

    public static void main(String[] args) {
        // Initialize test values for the open interval (a, b)
        double a = 1.0; 
        double b = 3.0; 
        double c = 2.0; 
        // Check if the number is in the open interval
        Program p = new Program();
        boolean isInOpenInterval = p.isInOpenInterval(a, b, c);
        // Print the result
        System.out.println("Is " + c + " in the open interval (" + a + ", " + b + ")? " + isInOpenInterval);
    }
}
