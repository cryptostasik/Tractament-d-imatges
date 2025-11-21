/*
 * Program.java 1.0 21/11/25
 *
 * exercici25
 *
 * Donat un nombre enter, calcula el nombre de xifres que té.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {

    public static void numberOfDigits() {
        Scanner scanner = new Scanner(System.in);
        int number,count;
        
        System.out.print("Introduïu el número: ");
        number = scanner.nextInt();
        
        if (number < 0) {
            number = -number;
        }
        
        count = 0;
        do {
            count++;
            number /= 10;
        } while (number > 0);
        
        if (count == 0) count = 1;
        
        System.out.println("Nombre de dígits: " + count);
    }

    public static void main(String[] args) {
        numberOfDigits();
    }
}
