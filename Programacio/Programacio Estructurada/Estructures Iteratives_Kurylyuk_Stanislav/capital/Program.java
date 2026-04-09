/*
 * Program.java 1.0 22/11/25
 *
 * exercici20
 * Donats el capital inicial, el % d'interès i el nombre d'anys,
 * calcula el capital final amb interés compost utilitzant un bucle.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {

    public static double calculateFinalCapital(double capital, double interes, int anys) {
        double actual = capital;

        // Each year we add interest to current capital
        for (int i = 1; i <= anys; i++) {
            actual = actual * (1 + interes / 100);
        }

        return actual;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double capital, interes,capitalFinal;
        int anys;

        // Input
        System.out.print("Donat el capital inicial: ");
        capital = sc.nextDouble();

        System.out.print("Donat el percentatge d'interès anual (%): ");
        interes = sc.nextDouble();

        System.out.print("Donat el nombre d'anys: ");
        anys = sc.nextInt();

        // Calculate
        capitalFinal = calculateFinalCapital(capital, interes, anys);
        System.out.printf("El capital final després de %d anys és: %.2f\n", anys, capitalFinal);
    }
}