/*
 * exercici22.java 1.0 29/09/25
 *
 * Donats un dia, un mes i un any determina si és una data vàlida. 
 * S'ha de tenir present el valor dels dies en funció dels mesos i dels anys. És a dir:
Els mesos 1,3,5,7,8,10 i 12 tenen 31 dies.
Els mesos 4, 6, 9 i 11 tenen 30 dies.
El mes 2 té 28 dies, excepte quan l'any és de traspàs, que té 29 dies.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class exercici22 {
    /**
     * Determines if a given year is a leap year.
     *
     * @param a the year to check
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isDate(int a) {
		// Check if the year is divisible by 400 or divisible by 4 but not by 100
		boolean isDate = (a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)
        return isDate;
    }

    public static void main(String[] args) {
        int year = 2001;
        int day = 3;
        int month = 7;
        int month_year = 12;
        int days_leap_year = 29;
        int 
        exercici22 p = new exercici22();
        boolean isLeapYear = p.isLeapYear(a);
        // Print the result
        System.out.println("Is " + a + " a leap year? " + isLeapYear);
    }
}
