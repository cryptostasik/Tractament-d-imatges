/*
 * Program.java 1.0 17/12/2025
 * 
 * exerciciia6
 * 
 * Donades dues taules quadrades numèriques enteres de dimensió n, 
 * calcula la taula producte d'ambdues. El producte de les taules 
 * s'efectua assignant a cada element la contracció de la fila i la columna ocupada per ell.
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Arrays;
public class Program {
	/**
     * Given two integer numerical square tables of dimension n, calculate the product table of both. 
     * The product of the tables is performed by assigning to each element the contraction of the 
     * row and column occupied by it.
     * 
     * @param args command line arguments (not used)
     */
       public static int[][] multiplyMatrices(int[][] a, int[][] b, int rowsA, int colsB, int common) {
        int[][] m = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int z = 0; z < common; z++) {
                    sum += a[i][z] * b[z][j];
                }
                m[i][j] = sum;
            }
        }
        
        return m;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6, 7}, {8, 9, 10}};
        
        int rowsA = a.length;
        int colsB = b[0].length;
        int common = a[0].length;    
        
        int[][] matriu = multiplyMatrices(a, b, rowsA, colsB, common);    
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
