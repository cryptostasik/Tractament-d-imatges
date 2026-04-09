/*
 * exercici49.java 1.0 24/10/25
 *
 * Escriu un menú amb 4 opcions, que ens permeti fer una de les operacions bàsiques amb dos nombres (usar switch).
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Inner class to perform basic arithmetic operations.
     */
    private static class Calculator {
        /**
         * Adds two numbers.
         * @param a the first number
         * @param b the second number
         * @return the sum of a and b
         */
        public double add(double a, double b) {
            return a + b;
        }

        /**
         * Subtracts the second number from the first number.
         * @param a the first number
         * @param b the second number
         * @return the difference of a and b
         */
        public double subtract(double a, double b) {
            return a - b;
        }

        /**
         * Multiplies two numbers.
         * @param a the first number
         * @param b the second number
         * @return the product of a and b
         */
        public double multiply(double a, double b) {
            return a * b;
        }

        /**
         * Divides the first number by the second number.
         * @param a the dividend
         * @param b the divisor
         * @return the quotient of a divided by b
         */
        public double divide(double a, double b) {
            return a / b; 
        }
    }

    /**
     * Main method to run a menu-driven program that allows the user to perform basic operations
     * with two numbers (addition, subtraction, multiplication, division) using a Calculator class.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calculator calc = new Calculator();
       
        double num1, num2, result; 
        int op;
        
        // Display the menu
        System.out.println("\n\nMenu\n");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicació");
        System.out.println("4. Divisió");
        
        // Read the user's menu choice
        System.out.print("Opcio? ");
        op = s.nextInt();
        
        // Handle the menu options using a switch statement
        switch (op) {
            case 1: // Addition
                System.out.println("\nSuma\n");
                System.out.println("Introdueix primer nombre: ");
                num1 = s.nextDouble();
                System.out.println("Introdueix segon nombre: ");
                num2 = s.nextDouble();
                result = calc.add(num1, num2);
                System.out.printf("La suma de %.2f i %.2f es %.2f.\n", num1, num2, result);
                break;
                
            case 2: // Subtraction
                System.out.println("\nResta\n");
                System.out.println("Introdueix primer nombre: ");
                num1 = s.nextDouble();
                System.out.println("Introdueix segon nombre: ");
                num2 = s.nextDouble();
                result = calc.subtract(num1, num2);
                System.out.printf("La resta de %.2f i %.2f es %.2f.\n", num1, num2, result);
                break;
                
            case 3: // Multiplication
                System.out.println("\nMultiplicació\n");
                System.out.println("Introdueix primer nombre: ");
                num1 = s.nextDouble();
                System.out.println("Introdueix segon nombre: ");
                num2 = s.nextDouble();
                result = calc.multiply(num1, num2);
                System.out.printf("La multiplicació de %.2f i %.2f es %.2f.\n", num1, num2, result);
                break;
                
            case 4: // Division
                System.out.println("\nDivisió\n");
                System.out.println("Introdueix primer nombre: ");
                num1 = s.nextDouble();
                System.out.println("Introdueix segon nombre: ");
                num2 = s.nextDouble();
                if (num2 == 0) {
                    System.out.println("Error: No es pot dividir per zero!");
                } else {
                    result = calc.divide(num1, num2);
                    System.out.printf("La divisió de %.2f i %.2f es %.2f.\n", num1, num2, result);
                }
        }
    }
}
