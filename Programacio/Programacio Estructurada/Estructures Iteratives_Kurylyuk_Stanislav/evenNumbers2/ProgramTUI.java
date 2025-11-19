/*
 * Program.java 1.0 10/11/25
 *
 * exercici33
 *
 * Llegeix una seqüència de nombres no negatius acabada en zero i escriu quants nombres parells hi ha.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class ProgramTUI{

    /**
     * Get a non-negative sequence of names ending in zero and write how many names you have.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma,n;
        
        suma = 0;
        System.out.print("Introduïu un nombre enter positiu (0 per acabar): ");
        n = s.nextInt();

        // Read numbers until 0 is entered
        while (n != 0) {
            // Check if the number is even and positive (0 doesn't count)
            if (n > 0 && n % 2 == 0) {
                suma++;
            }
            System.out.print("Introduïu un nombre enter positiu (0 per acabar): ");
            n = s.nextInt();
        }

        // After entering 0, print the result
        System.out.println("Quants nombres parells: " + suma);
    }
}
