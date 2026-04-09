/*
 * Program.java 1.0 12/11/25
 *
 * exercici42
 *
 * Llegeix un nombre enter x i una seqüència de nombres enters acabada en zero i escriu si hi ha algun element més gran que x
 * (interrompent la lectura de nombres si trobes l'element).
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class ProgramTUI {
    /**
     * Read an integer x and a sequence of integers terminated by zero and write if there is any element greater than x
     * (interrupting the reading of numbers if you find the element).
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,nombre;
        
        System.out.print("Introduïu un número x: ");
        x = s.nextInt();

        boolean trobat = false;

        System.out.print("Introduïu el nombre (0 per acabar): ");
        nombre = s.nextInt();

        while (nombre != 0 && !trobat) {
            if (nombre > x) {
                trobat = true;
            } else {
                System.out.print("Introduïu el nombre (0 per acabar): ");
                nombre = s.nextInt();
            }
        }

        if (trobat) {
            System.out.println("Sí, hi ha un nombre més gran que " + x);
        } else {
            System.out.println("No hi ha cap nombre més gran que " + x);
        }
    }
}
