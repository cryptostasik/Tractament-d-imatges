/*
 * ProgramTUI.java 1.0 17/11/2025
 *
 * exercicii37
 *
 * Llegeix una seqüència de notes obtingudes per un grup d’alumnes acabada en -1 i escriu quants alumnes han obtingut 
 * les qualificacions MD, I, S,B, N, E. La correspondència entre notes i qualificacions és: MD=[0, 3) I=[3, 5) S=[5, 6) B=[6, 7) N=[7, 9) Ex=[9, 10]
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

import java.util.Scanner;

public class ProgramTUI {
	/**
     * 
     * Read a sequence of grades obtained by a group of students ending in -1 and write how many students obtained
	 * the grades MD, I, S,B, N, E. The correspondence between grades and grades is: MD=[0, 3) I=[3, 5) S=[5, 6) B=[6, 7) N=[7, 9) Ex=[9, 10]
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int md = 0, i = 0, s = 0, b = 0, n = 0, ex = 0;
        double grade;

        System.out.println("ACADEMIC GRADES");
        System.out.println("Enter grades (0-10). Finish with -1\n");

        System.out.print("Enter a grade (-1 to finish): ");
        grade = scan.nextDouble();


        while (grade != -1) {
			
            if (grade < 0 || grade > 10) {
                System.out.println("Error: grade must be between 0 and 10 ");
            }
            
            // Assign the correct category 
            else if (grade < 3) {
                md++;
            } else if (grade < 5) {
                i++;
            } else if (grade < 6) {
                s++;
            } else if (grade < 7) {
                b++;
            } else if (grade < 9) {
                n++;
            } else {
                ex++;
            }

            System.out.print("Enter a grade (-1 to finish): ");
            grade = scan.nextDouble();
        }

        System.out.println("\n--- RESULTS ---");
        System.out.printf("MD = %d ,I = %d ,S = %d ,B = %d ,N = %d ,Ex = %d", md,i,s,b,n,ex);
    }
}
