/*
 * Program.java 1.0 22/11/25
 *
 * exercicii13 
 * 
 * Donats dos nombres enters n1 i n2 amb n1 < n2,
 * calcula la suma dels nombres enters que hi ha dins l'interval [n1, n2].
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {

    // Calculates sum of integers from n1 to n2 (inclusive)
    public static int sumInterval(int n1, int n2) {
        int i, sum = 0;
        for (i = n1; i <= n2; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2,result;

        System.out.print("Donat el primer nombre (n1): ");
        n1 = sc.nextInt();

        System.out.print("Donat el segon nombre (n2): ");
        n2 = sc.nextInt();

        result = sumInterval(n1, n2);

        // Beautiful output like in the example
        System.out.print("La suma dels nombres des de " + n1 + " fins a " + n2 + " és: ");
        for (int i = n1; i <= n2; i++) {
            System.out.print(i);
            if (i < n2) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + result);
    }
}