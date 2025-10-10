/*
 * exercici8.java 1.0 29/09/25
 * 
 * A partir d'un nombre enter d’hores, un nombre enter de
minuts i un nombre enter de segons, escriu el nombre de segons equivalents.
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */

public class Program { 
    /**
     * Converts hours and minutes into total seconds
     *
     * @param a the number of hours
     * @param c the number of minutes
     * @return d the total seconds equivalent to hours + minutes
     */
    public static double hms2s(double a, double c) {
        // Convert hours to minutes
        double b = a * 60;
        // Add minutes and convert the total to seconds
        double d = (b + c) * 60;
        return d;
    }

    public static void main(String[] args) {
        double a = 1;   
        double c = 17;
        Program p = new Program();
        double d = p.hms2s(a, c);
        System.out.println("Time in seconds: " + d);
    }
}

