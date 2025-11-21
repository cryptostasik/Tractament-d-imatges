/*
 * Program.java 1.0 21/11/25
 *
 * exercicii24
 *
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
        
        System.out.print("Enter a positive integer (0 is even): ");
        int number = scanner.nextInt();
        
        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void main(String[] args) {
        isEven();
    }
}
