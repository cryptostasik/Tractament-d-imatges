/*
 * Program.java 1.0 12/12/2025
 * 
 * exerciciia5
 * 
 * Donades dues taules quadrades numèriques enteres de dimensió n, calcula la seva suma. 
 * La suma de les taules s'efectua assignant a cada element de la nova taula la suma dels elements que ocupen la mateix fila i la mateixa columna.
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Arrays;
public class Program {
	/**
     * Given an integer greater than zero, create the identity matrix of dimension the given integer.
     * For example, if the number is 5 the identity matrix of dimension 5 is:
     * 
     * @param args command line arguments (not used)
     */
    public static int[][] multiplyMatrices(int [][]a,int [][]b,int size) {
        int[][] m = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
				a[]
            }
        }
        return m;
    }
    public static void main(String[] args) {
        int [][]a = {{3,8},{4,6}};
        int [][]b = {{4,0},{1,-9}};
        int[][] matriu = multiplyMatrices(a,b);
        int size = a.length;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
