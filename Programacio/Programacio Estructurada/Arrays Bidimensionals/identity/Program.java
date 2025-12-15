/*
 * Program.java 1.0 12/12/2025
 * 
 * exerciciia4
 * 
 * Donat un nombre enter major que zero, crea la matriu identitat de dimensió el nombre enter donat. 
 * Per exemple, si el número és 5 la matriu identitat de dimensió 5 és :
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;
import java.util.Arrays;
public class Program {
	/**
     * Given an integer greater than zero, create the identity matrix of dimension the given integer.
     * For example, if the number is 5 the identity matrix of dimension 5 is:
     * 
     * @param args command line arguments (not used)
     */
    public static int[][] identity(int size) {
        int[][] m = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nombre de files x columnes: ? ");
        int size = s.nextInt();
        int[][] matriu = identity(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
