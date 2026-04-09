/*
 * Program.java 1.0 24/10/2025
 *
 * A partir de les llargades de tres segments, determina si formen o no un triangle. 
 * Per tal de que tres segments formin un triangle un segment qualsevol ha de ser més petit que la suma de la llargada dels altres dos.
 * Si els tres segments formen un triangle, determina si és equilàter (tres costats iguals), isòsceles (dos costats iguals) 
 * o escalè (tots els costats diferents).
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Determines if 3 segments form a triangle.
     *
     * @param a the length of a segment.
     * @param b the length of a segment.
     * @param c the length of a segment.
     * @return true if a, b, c form a triangle, false otherwise.
     */
    public static boolean isTriangle(double a, double b, double c) {
        // Check if the sum of any two sides is greater than the third side
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    /**
     * Finds out the type of a triangle.
     *
     * @param a the length of a segment.
     * @param b the length of a segment.
     * @param c the length of a segment.
     * @return "Equilàter", "Isòsceles", "Escalè".
     */
    public static String typeOfTriangle(double a, double b, double c) {
        // Check if all sides are equal for an equilateral triangle
        if (a == b && b == c) {
            return "Equilàter";
        }
        // Check if at least two sides are equal for an isosceles triangle
        else if (a == b || a == c || b == c) {
            return "Isòsceles";
        }
        // If all sides are different, it's a scalene triangle
        else {
            return "Escalè";
        }
    }

    public static void main(String[] args) {
        double a, b, c; 
        Scanner s = new Scanner(System.in);
        
        System.out.printf("\nTRIANGLE\n\n");
        

        System.out.printf("Introduiu el costat a: ");
        a = s.nextDouble();
        

        System.out.printf("Introduiu el costat b: ");
        b = s.nextDouble();
        

        System.out.printf("Introduiu el costat c: ");
        c = s.nextDouble();
        
        // Check if the sides form a triangle and determine its type
        boolean esTriangle = isTriangle(a, b, c);
        String tipus = typeOfTriangle(a, b, c);
        
        // Output the result based on whether a triangle is formed
        if (esTriangle) {
            System.out.printf("És un triangle de tipus: %s\n", tipus);
        } else {
            System.out.printf("Esls costats no formen un triangle.");
        }
    }
}
