/*
 * Program.java 1.0 12/11/25
 *
 * exercici40
 *
 * Llegeix una seqüència de més de dos nombres enters acabada en zero i escriu 
 * si hi ha dos nombres consecutius iguals (interrompent la lectura si el trobes)
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class ProgramTUI {
	 /**
     * 
     * Read a sequence of more than two integers ending in zero and write if there are two consecutive numbers that are the same 
     * (interrupting the reading of the sequence if you find one)
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1,n2,n3;

        System.out.println("INTRODUEIX UNA SEQÜÈNCIA DE NOMBRES ENTERS ACABADA EN 0:");
        
        // Llegim el primer número
        System.out.print("Primer número: ");
        n1 = s.nextInt();
        
        // Llegim el segon número
        System.out.print("Segon número: ");
        n2 = s.nextInt();
        
        boolean found = false;

        // Comprovem si els dos primers ja són iguals
        if (n2 == 0) {
            System.out.println("No hi ha dos nombres consecutius iguals (seqüència massa curta).");
            return;
        }

        if (n1 == n2) {
            found = true;
        } else {
            // Continuem llegint fins trobar 0 o repetits
            while (n2 != 0 && !found) {
                System.out.print("Següent número: ");
                n3 = s.nextInt();
                
                if (n3 == 0) break; // Acaba la seqüència
                
                if (n2 == n3) {
                    found = true;
                } else {
                    n2 = n1;
                    n2 = n3;
                }
            }
        }

        // Sortida final
        if (found) {
            System.out.println("SÍ hi ha dos nombres consecutius iguals.");
        } else {
            System.out.println("NO hi ha dos nombres consecutius iguals.");
        }
    }
}
