/*
 * ProgramTUI.java 1.0 17/11/2025
 *
 * exercici41
 *
 * Llegeix una seqüència de tres o més nombres enters acabada en zero 
 * i escriu si la seqüència és una progressió aritmètica.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class ProgramTUI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2,difference,previous,current;

        System.out.println("Enter a sequence of integers (at least 3 numbers)");
        System.out.println("Finish the sequence by entering 0\n");
        
        System.out.print("→ Enter the 1st number (0 to finish): ");
        num1 = scan.nextInt();
        
        System.out.print("→ Enter the 2nd number (0 to finish): ");
        num2= scan.nextInt();

        difference = num2 - num1;
        previous = num2;
        boolean isArithmetic = true;

        System.out.println("Common difference (d) = " + difference);
        System.out.println("Now enter the rest of the sequence:\n");

        while (true) {
            System.out.print("→ Enter next number (0 to finish): ");
            current = scan.nextInt();

            if (current == 0) {
                break;
            }

            // Check if the difference is still the same
            if (current - previous != difference) {
                isArithmetic = false;
            }

            previous = current;  // update previous for next iteration
        }
        
        if (isArithmetic) {
            System.out.println("YES → The sequence IS an arithmetic progression!");
            System.out.println("Common difference d = " + difference);
        } else {
            System.out.println("NO → The sequence is NOT an arithmetic progression.");
            System.out.println("The difference changed at some point.");
        }
    }
}
