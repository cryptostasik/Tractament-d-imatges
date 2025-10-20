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
     * Accounts for leap years for February. Assumes the month is a valid Catalan month name.
     *
     * @param year The year to check
     * @param month The month name in Catalan (e.g., "gener", "febrer")
     * @return The number of days in the month
     */
    public static int getNumberOfDays(int year, String month) {
        // Use switch to determine the number of days based on the month
        switch (month) {
            case "febrer":
                // Handle February with leap year logic
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    return 29; // Leap year: February has 29 days
                } else {
                    return 28; // Non-leap year: February has 28 days
                }
            case "gener":
            case "març":
            case "maig":
            case "juliol":
            case "agost":
            case "octubre":
            case "desembre":
                return 31; // Months with 31 days
            case "abril":
            case "juny":
            case "setembre":
            case "novembre":
                return 30; // Months with 30 days
        }
        // This line is unreachable if all inputs are valid, but required for compilation
        return 0;
    }
    /**
     * Main method to prompt the user for a month and year, then display
     * the number of days in that month for the given year.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int year, days;

        // Prompt for the month
        System.out.print("Introduïu el mes (p.ex., Gener, Febrer, ...): ");
        String month = s.nextLine();

        // Prompt for the year
        System.out.print("Introduïu l'any: ");
        year = s.nextInt();

        // Get the number of days
        days = getNumberOfDays(year, month);

        // Display the result
        System.out.printf("El mes de %s de l'any %d té %d dies.\n", month, year, days);

    }
}
