/*
 * exercici47 1.0 23/10/25
 *
 * Donada la següent equació de segon grau: ax^2 + bx + c = 0.
 * Les solucions es poden calcular a partir dels valors dels coeficients emprant les fórmules següents:
 * (-b + Math.sqrt(dis)) / (2 * a)
 * (-b - Math.sqrt(dis)) / (2 * a)
 * 
 * Delta < 0: "No hi ha solució"
 * Delta = 0: "Solució única x1 = x2" 
 * Delta > 0: "Solucions x1 i x2" 
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Calculates the solutions of a quadratic equation ax^2 + bx + c = 0.
     * @param a the first coefficient of the equation
     * @param b the second coefficient of the equation
     * @param c the constant term of the equation
     * @return Two real solutions or One real solution or No real solutions
     */
    public String calculateSolutions(double a, double b, double c) {
        double x1, x2, dis;        
        // Calculate the discriminant
        dis = b * b - 4 * a * c;
        
        if (dis > 0) {
            // Two real solutions
            x1 = (-b + Math.sqrt(dis)) / (2 * a);
            x2 = (-b - Math.sqrt(dis)) / (2 * a);
            return "Solucions: x1 = " + x1 + " i x2 = " + x2;
        } else if (dis == 0) {
            // One real solution
            x1 = -b / (2 * a);
            return "Solució única: x1 = x2 = " + x1;
        } else {
            // No real solutions
            return "No hi ha solució";
        }
    }

    /**
     * Main method to run the program and get user input.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Program p = new Program();

        double a, b, c;
        
        // Prompt user for the first coefficient
        System.out.println("Introdueix el primer número (a):");
        a = s.nextDouble();
        
        // Prompt user for the second coefficient
        System.out.println("Introdueix el segon número (b):");
        b = s.nextDouble();
        
        // Prompt user for the constant term
        System.out.println("Introdueix el tercer número (c):");
        c = s.nextDouble();

        // Calculate the result
        String result = p.calculateSolutions(a, b, c);
        System.out.println(result);
    }
}
