/*
 * Program.java 1.0 12/11/25
 *
 * exercicii35
 *
 * Llegeix una seqüència de nombres no negatius acabada en zero i escrigui la mitjana aritmètica dels nombres entrats. 
 * La mitjana aritmètica d'una seqüència numèrica es calcula sumant els elements de la seqüència i dividint pel nombre d'elements
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;
public class ProgramTUI {
    /**
     * I created a non-negative sequence of names ending in zero and wrote the arithmetic method of the names entered. 
	 * The arithmetic technique of a numerical sequence is to calculate the elements 
	 * of the sequence and divide them by the name of the elements
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ProgramTUI p = new ProgramTUI();
        int numero,mitjana,suma,contrador;
		suma = 0;
		contrador = 0;
		
        System.out.println("POT UNA SEQUENCIA DE NUMERO Y ACABA CON UN 0:  ");
        
        System.out.print("Pot el numero: ");
		numero = s.nextInt();
			
		while (numero != 0) {
					contrador++;
                    suma = suma + numero;
                    System.out.print("Pot el numero:");
                    numero = s.nextInt();
                }
        mitjana = suma / contrador;
        System.out.print("La mitjana dels numeros es : " + mitjana);	     
		}
}
