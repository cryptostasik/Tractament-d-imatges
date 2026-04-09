/*
 * exercici22.java 1.0 29/09/25
 *
 * Llegeix un any i escriu si és un any de traspàs (febrer amb 29 dies) o no. 
Són de traspàs els anys que són múltiples de 400 i els anys que són múltiples de 4 però no de 100.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {
    /**
     * Determines if a given year is a leap year.
     *
     * @param a the year to check
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int a) {
        // Check if the year is divisible by 400 or divisible by 4 but not by 100
        return (a % 400 == 0) || (a % 4 == 0 && a % 100 != 0);
    }

    public static void main(String[] args) {
        int a = 2001; // year
        Program p = new Program();
        boolean isLeapYear = p.isLeapYear(a);
        // Print the result
        System.out.println("Is " + a + " a leap year? " + isLeapYear);
    }
}
