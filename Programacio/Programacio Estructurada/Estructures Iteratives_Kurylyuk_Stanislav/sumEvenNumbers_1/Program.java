/*
 * Program.java 1.0 10/11/25
 *
 * exercicii34
 *
 * Llegeix una seqüència de nombres enters acabada en zero i escriu la suma dels que són parells.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;
public class ProgramTUI {
    /**
     * Get a sequence of names ending in zero and write the sum of those that are equal.
     * 
     * @param args command line arguments (not used)
     */
    public static int sumEvenNumbers(int n) { 
		int suma = 0;
		while (n != 0) {
			if (n % 2 == 0){
				suma += n;
				break;		
			}	
		} 
		return suma;
	}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Program p = new Program();
        int suma;
        System.out.print("Entra nombres (0 per acabar): ");
		int n = s.nextInt();
        
        p.sumEvenNumbers(suma);
    }
}
