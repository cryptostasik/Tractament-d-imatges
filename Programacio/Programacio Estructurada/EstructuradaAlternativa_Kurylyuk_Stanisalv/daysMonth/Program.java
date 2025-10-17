/*
 * exercici45.java 1.0 13/10/25
 *
 * A partir del mes i l'any d'una data, esbrina el nombre de dies que té el mes d'aquest any.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Determines the number of days in a given month for a specified year.
     * Accounts for leap years for February.
     *
     * @param year The year to check (e.g., 2025)
     * @param month The month name in Catalan (e.g., "Gener", "Febrer")
     * @return The number of days in the month, or -1 if the month is invalid
     */
    public static int getNumberOfDays(int year, String month) {
        // Convert month to lowercase for case-insensitive comparison
        month = month.trim().toLowerCase();

        // Check for February and handle leap year logic
        if (month.equals("febrer")) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                return 29; // Leap year: February has 29 days
            } else {
                return 28; // Non-leap year: February has 28 days
            }
        }
        // Months with 31 days
        else if (month.equals("gener") ||
                 month.equals("març") ||
                 month.equals("maig") ||
                 month.equals("juliol") ||
                 month.equals("agost") ||
                 month.equals("octubre") ||
                 month.equals("desembre")) {
            return 31;
        }
        // Months with 30 days
        else if (month.equals("abril") ||
                 month.equals("juny") ||
                 month.equals("setembre") ||
                 month.equals("novembre")) {
            return 30;
        }
        // Invalid month
        else {
            return -1;
        }
    }

    /**
     * Main method to prompt the user for a month and year, then display
     * the number of days in that month for the given year.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner s = new Scanner(System.in);

        // Prompt for month
        System.out.print("Introduïu el mes (p.ex., Gener, Febrer, ...): ");
        String month = s.nextLine();

        // Prompt for year
        System.out.print("Introduïu l'any: ");
        int year = s.nextInt();

        // Get the number of days
        int days = getNumberOfDays(year, month);

        // Display the result
        if (days != -1) {
            System.out.printf("El mes de %s de l'any %d té %d dies.\n", month, year, days);
        } else {
            System.out.println("Error: Mes no vàlid. Si us plau, introduïu un mes vàlid en català.");
        }

        // Close the Scanner to prevent resource leaks
        s.close();
    }
}
