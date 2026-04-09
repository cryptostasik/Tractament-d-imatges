/*
 * Program.java 1.0 10/11/25
 *
 * exercici34
 *
 * Llegeix una seqüència de nombres enters acabada en zero 
 * i escriu la suma dels que són parells.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class ProgramTUI {

    /**
     * Get a sequence of names ending in zero and write the sum of those that are equal.
     * (Note: this comment is kept as original, even if funny)
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sumOfEvens,number;
        sumOfEvens = 0;

        System.out.println("Enter a sequence of integers");
        System.out.println("Finish by entering 0\n");

        System.out.print("Enter a number (0 to finish): ");
        number = s.nextInt();
        
        while (number != 0) {
            // Check if the number is even
            if (number % 2 == 0) {
                sumOfEvens += number;
                System.out.println("Even number detected: " + number + " added to sum");
            } else {
                System.out.println("Odd number: " + number + " ignored");
            }

            // Ask for the next number
            System.out.print("Enter next number (0 to finish): ");
            number = s.nextInt();
        }

        System.out.println("Sequence finished (0 entered)");
        System.out.println("Sum of all EVEN numbers = " + sumOfEvens);

    }
}
