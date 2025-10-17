/*
 * exercici47 1.0 10/17/25
 *
 * Discrinant 3 vario < 0 = "No te solucio" o = 0 "Asolucio x 1 = x2" o >0 "Solucions x1 x2
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * 
     * 
     *
     * @param
     */
     public String calculateSolutions(double a, double b, double c) {
        double x1, x2, dicriminant;
        if ()
        return abs;
    }
    /**
     * 
     * 
     *
     * @param
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Program p = new Program();
        
        double num, num1, num2, abs, min;
        int op;

        // Display the menu
        System.out.println("\nMenu");
        System.out.println("1. Valor absolut");
        System.out.println("2. Minim de dos nombres");
        System.out.println("3. Sortir");

        // Read the user's menu choice
        System.out.print("Opcio? ");
        op = s.nextInt();

        // Handle the menu options using a switch statement
        switch (op) {
            case 1:
                // Calculate the absolute value of a number
                System.out.print("\n EL VALOR ABSOLUT \n\n");
                System.out.println("Introdueix un nombre: ");
                num = s.nextDouble();
                abs = p.abs(num); // Calculate absolute value
                System.out.printf("El valor absolut del nombre %.2f es %.2f.\n", num, abs);
                break;
            case 2:
                // Find the minimum of two numbers
                System.out.printf("\n Nombre minim d´entre des nombres reals. \n\n");
                System.out.println("Introdueix primer nombre: ");
                num1 = s.nextDouble();
                System.out.println("Introdueix segon nombre: ");
                num2 = s.nextDouble(); 
                min = p.min(num1, num2); // Calculate the minimum
                System.out.printf("\nEl minim de %.2f i %.2f es %.2f \n", num1, num2, min);
                break;
            case 3:
                // Exit the program
                System.out.println("Sortint del programa...");
                break;
        }
    } 
}
