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
public class exercici23 {
    /**
     * Determines if a given year is a leap year.
     *
     * @param a the year to check
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isDate(int year, int day, int month) {
		// Check if the year is divisible by 400 or divisible by 4 but not by 100
		boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
		boolean data31 = ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) && (day >= 1 ) && (day <= 31 );
		boolean data30 = ( month == 4 || month == 6 || month == 9 || month == 11 ) && (day >= 1 ) && (day <= 30 );
		boolean february = (month == 2) && ((isLeapYear && day >= 1 && day <= 29) || (!isLeapYear && day >= 1 && day <= 28));
		
	return data31 || data30 || february;
}
    public static void main(String[] args) {
        int year = 2001;
        int day = 3;
        int month = 7;
        exercici23 p = new exercici23();
        boolean isDate = p.isDate(year,day,month);
        // Print the result
        
         System.out.println("Data " + day + "/" + month + "/" + year + " " + (isDate ? "correct date" : "incorrect date"));
         System.out.println("Year" + year + " " + ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? "leap year" : "no leap year"));
    }
}
