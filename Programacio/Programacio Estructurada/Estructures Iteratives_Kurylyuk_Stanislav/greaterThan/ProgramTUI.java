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
     * 
     * Read an integer x and a sequence of integers terminated by zero and write if there is any element greater than x
	 * (interrupting the reading of numbers if you find the element).
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,nombre;
        
        // 
        System.out.print("Introduïu un número x:");
        x = s.nextInt();
        
        // 
        System.out.print("Introduïu el nombre: ");
        nombre = s.nextInt();
        
        boolean found = false;

        // Comprovem si els dos primers ja són iguals
        if (x == 0) {
            System.out.println("No hi ha dos nombres consecutius iguals (seqüència massa curta).");
            return;
        }

        if (n1 == n2) {
            found = true;
        } else {
            // Continuem llegint fins trobar 0 o repetits
            while (x2 != 0 && !found) { 
                if (x2 > x){
					found = true;
				} if else (){
					
					}
                
                
                break; // Acaba la seqüència
                
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
            System.out.println("Nombre mes gran que x");
        } else {
            System.out.println("No cap nombre mes gran que x");
        }
    }
}
