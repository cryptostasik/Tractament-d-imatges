/*
 * Program.java 1.0 10/11/25
 *
 * exercicii33
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
    public static void evenNumbers2(int n) {
		int suma = 0;
		while (n != 0) {
			if (n % 2 == 0){
				suma  = suma + 1;
				break;
				
		} System.out.printf(suma + "" );	
	}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ProgramTUI p = new ProgramTUI();

        System.out.print("Introduïu un nombre enter positiu: ");
        int n = s.nextInt();

        p.evenNumbers2(n);
    }
}
