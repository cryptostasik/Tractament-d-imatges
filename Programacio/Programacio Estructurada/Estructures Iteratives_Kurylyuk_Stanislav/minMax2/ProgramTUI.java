/*
 * ProgramTUI.java 1.0 5/11/25
 *
 * exercicii36
 *
 * Llegeix una seqüència de nombres acabada en zero i escriu el més gran i el més petit de la seqüència.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class ProgramTUI {
	/**
     * He created a sequence of names ending in zero and wrote the largest and smallest of the sequence.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero,max, min;    
        int i = 1;    
         
        System.out.println("INTRODUEIX UNA SEQÜÈNCIA DE NOMBRES (ACABA AMB 0):");
        
        System.out.print("Introduïu un número 1: ");
        numero = s.nextInt();
        max = numero;
        min = numero;

        while (numero != 0) {
            i++;
            System.out.printf("Introduïu un número %d: ", i);
            numero = s.nextInt();
            if (numero != 0) {
                if (numero > max) {
                    max = numero;
                } else if (numero < min) { 
                    min = numero;
                }
            }
        }
        System.out.println("El més gran: " + max);
        System.out.println("El més petit: " + min);
    }
}
