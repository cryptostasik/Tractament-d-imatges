/*
 * Program.java 1.0 21/11/25
 *
 * exercicii24
 * Donat un nombre enter positiu, determina si és parell.
 * No emprar els operadors divisió entera ni mòdul.
 * El nombre zero es considera parell.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {

    public static void isEven() {
        Scanner scanner = new Scanner(System.in);
         
        int number, temp;
        // Ask for a positive number
        System.out.print("Donat un nombre enter positiu, introdueix-lo: ");
        number = scanner.nextInt();

        temp = number;
        while (temp > 0) {
            temp = temp - 2;
        }

        // If temp == 0 → number is even
        if (temp == 0) {
            System.out.println("El nombre " + number + " és parell.");
        } else {
            System.out.println("El nombre " + number + " és senar.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Program p = new Program();
        p.isEven();
    }
}