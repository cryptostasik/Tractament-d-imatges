/*
 * ProgramTUI.java 1.0 17/11/2025
 *
 * exercicii41 
 *
 * Llegeix una seqüència de tres o més nombres enters acabada en zero i escriu si la seqüència és una progressió aritmètica.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

import java.util.Scanner;
public class ProgramTUI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("PROGRESSIÓ ARITMÈTICA");
        System.out.println("Introdueix nombres enters (acaba amb 0)\n");

        // Читаємо перше число
        System.out.print("Entra un nombre (0 per acabar): ");
        int primer = scan.nextInt();
        if (primer == 0) {
            System.out.println("No");
            return;
        }

        // Читаємо друге число
        System.out.print("Entra un nombre (0 per acabar): ");
        int segon = scan.nextInt();
        if (segon == 0) {
            System.out.println("No"); 
            return;
        }

        // Визначаємо різницю (d)
        int dif = segon - primer;


        int anterior = segon;
        boolean esProgressio = true;  // припускаємо, що так

        while (true) {
            System.out.print("Entra un nombre (0 per acabar): ");
            int actual = scan.nextInt();

            if (actual == 0) {
                break;  
            }


            if (actual - anterior != dif) {
                esProgressio = false;
            }

            anterior = actual;  // оновлюємо "попереднє" число
        }


        if (esProgressio) {
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
    }
}
