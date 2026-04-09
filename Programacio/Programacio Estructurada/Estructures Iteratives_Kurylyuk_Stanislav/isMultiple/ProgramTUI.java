/*
 * Program.java 1.0 12/11/25
 *
 * exercici39
 *
 * Llegeix un nombre enter positiu x, un nombre enter n i una seqüència de n nombres enters i escriu si algun d'ells és múltiple de x 
 * (interrompent la lectura de la seqüència si el trobes).
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class ProgramTUI {
	 /**
     * 
     * Read un nombre enter positive x, un nombre enter n i una sequència de n nombres enters i escriu si algun d'ells és multiple de x 
     * (interrompent la lectura de la sequència si el trobes).
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,nombre,n;
        n = 0;
        
        // Llegim el primer número
        System.out.print("Introduïu un número x: ");
        x = s.nextInt();
        
        if (x == 0) {
            System.out.println("Solo positivo ");
            return;
        } 
        
        // Llegim el segon número
        System.out.print("Introduïu el nombre: ");
        nombre = s.nextInt();
        
        boolean found = false;

        // 
        while (n != 0 && !found) {
			for (int i = 0; n < nombre; n++,i++){
			System.out.printf("Introduïu %d numero :",i);
			n = s.nextInt();
			if (n % x == 0){
				found = true;
			} else {
				found = false;
			}
        // Sortida final
        if (found) {
            System.out.println("SÍ hi ha dos nombres consecutius iguals.");
        } else {
            System.out.println("NO hi ha dos nombres consecutius iguals.");
        }
    }
  }
 }
}

