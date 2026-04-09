/*
 * exercici40.java 1.0 13/10/25
 *
 * Obté el nombre màxim d'entre tres nombres reals
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Finds the maximum of three real numbers.
     * 
     * @param num1 the first real number
     * @param num2 the second real number
     * @param num3 the third real number
     * @return the maximum of the three numbers
     */
    public static double max3(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num1, num2, num3, max;

        System.out.println("Introduïu el primer nombre real: ");
        num1 = s.nextDouble();
        System.out.println("Introduïu el segon nombre real: ");
        num2 = s.nextDouble();
        System.out.println("Introduïu el tercer nombre real: ");
        num3 = s.nextDouble();

        // Find the maximum
        max = max3(num1, num2, num3);
        
        System.out.printf("El màxim entre %.2f, %.2f i %.2f és %.2f\n", num1, num2, num3, max);

        s.close();
    }
}
