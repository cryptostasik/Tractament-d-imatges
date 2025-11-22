/*
 * Program.java 1.0 22/11/25
 *
 * exercicii29
 *  
 * Donat un nombre enter positiu, escriu la seva descomposició en producte de nombres primers
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {

    public static void primeFactorization(int n) {
        int original = n;
        String result = "";

        // Divide by 2
        while (n % 2 == 0) {
            if (!result.isEmpty()) result += " * ";
            result += "2";
            n /= 2;
        }

        // Divide by odd numbers
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                if (!result.isEmpty()) result += " * ";
                result += i;
                n /= i;
            }
        }

        // If n is a prime number
        if (n > 1) {
            if (!result.isEmpty()) result += " * ";
            result += n;
        }

        // Only the final result
        System.out.println(result + " = " + original);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program p = new Program();
        int n;

        System.out.print("Donat un nombre enter positiu: ");
        n = sc.nextInt();

        p.primeFactorization(n);
    }
}