/*
 * ProgramTUI.java 1.0 22/11/25
 *
 * exercici38 - positiveNegative
 * Llegeix una seqüència de nombres enters acabada en zero
 * i escriu si hi ha més nombres positius que negatius.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class ProgramTUI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive, negative, number;
        positive = 0;
        negative = 0;

        System.out.println("Introdueix una seqüència de nombres enters (acaba amb 0):");

        // Read numbers until 0
        do {
            number = sc.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }
        // if number == 0 → do nothing

        } while (number != 0);

        // show result
        System.out.print("Hi ha ");

        if (positive > negative) {
            System.out.println("mes nombres positius.");
        } else if (negative > positive) {
            System.out.println("mes nombres negatius.");
        } else {
            System.out.println("el mateix nombre de positius i negatius.");
        }
    }
}