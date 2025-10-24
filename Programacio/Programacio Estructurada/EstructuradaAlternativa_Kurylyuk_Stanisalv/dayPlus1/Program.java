/*
 * exercici46 1.0 24/10/25
 *
 * A partir de dia, mes i any, retorna el dia següent amb el format “dd/mm/aaaa”.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Converts the month name to its corresponding number.
     * @param day the current day
     * @param month the current month as a string (e.g., "Octubre")
     * @param year the current year
     * @return the month number (1-12)
     */
    public int dayPlus1(int day, String month, int year) {
        int num_month = 0; // Initialize the month number
       
        // Assign a number to each month
        switch (month) {
            case "Gener":
                num_month = 1;
            case "Febrer":
                num_month = 2;
            case "Març":
                num_month = 3;
            case "Abril":
                num_month = 4;
            case "Maig":
                num_month = 5;
            case "Juny":
                num_month = 6;
            case "Juliol":
                num_month = 7;
            case "Agost":
                num_month = 8;
            case "Setembre":
                num_month = 9;
            case "Octubre":
                num_month = 10;
            case "Novembre":
                num_month = 11;
            case "Desembre":
                num_month = 12;
        }
        return num_month; // Return the month number
    }
  
    /**
     * Main method to run the program and get user input.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Program p = new Program();
        int day, year, num_month;
        String month; 
       
        System.out.println("Introdueix el dia :"); 
        day = s.nextInt(); // Read the day
       
        System.out.println("Introdueix el mes :");
        month = s.next();
       
        System.out.println("Introdueix el any :");
        year = s.nextInt();
       
        // Call dayPlus1 method and store the month number
        num_month = p.dayPlus1(day, month, year);
       
        // Format the date with leading zeros using printf
        System.out.printf("%02d/%02d/%04d", day, num_month, year); // Output the formatted date
    }
}
