/*
 * Program.java 1.0 22/11/25
 *
 * Exercise 25
 * Donat un nombre enter, calcula el nombre de xifres que té.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {

    // This method counts how many digits the number has
    public static int numberOfDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donat un nombre enter positiu, introdueix-lo: ");
        int nombre = sc.nextInt();
        
        String s = String.valueOf(nombre);
        int d = numberOfDigits(nombre);

        System.out.println("\nValue of digits in the \"Decimal numeral system\"\n");

        // Print powers of 10 (from 10^5 to 10^0)
        for (int i = 5; i >= 0; i--) {
            if (d > i) {
                System.out.print("10^" + i);
                if (i > 0) System.out.print("     ");
            } else {
                System.out.print("");
            }
        }
        System.out.println();

        // Print the digits of the number
        for (int i = 0; i < d; i++) {
            System.out.print(s.charAt(i));
            if (i < d - 1) System.out.print("        ");
        }
        System.out.println();
    }
}
