/*
 * ProgramTUI.java 1.0 19/11/25
 *
 * exercicii48
 *
 * Llegeix un nombre enter positiu n i n nombres enters i escriu el seu producte. No fer ús de l'operador *.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class ProgramTUI {
	/**
     * Read a positive integer n and n integers and write their product. Do not use the * operator.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int quantitat,num,suma,i,j;
        
		System.out.print("Introduïu número(quantitat) : ");
        quantitat = s.nextInt(); 
		for(i = 1; i <= quantitat; i++) {
			suma = 0;
			System.out.print("Introduïu un nombres enters(num): ");
			num = s.nextInt();
			for (j = 1; j <= num; j++) {
				suma =+ num;
				}
			System.out.printf("El producte de %d es %d\n", num, suma);
		}
	}
}
