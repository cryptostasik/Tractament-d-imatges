/*
 * Program.java 1.0 12/12/2025
 * 
 * exerciciia7
 * 
 * Donada una taula quadrada numèrica d'enters de dimensió n, determina si és simètrica. 
 * Una taula quadrada és simètrica si el elements simètrics respecte de la diagonal principal són iguals.
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Arrays;
public class Program {
	/**
     * Given a square numeric table of integers of dimension n, determine whether it is symmetric. 
     * A square table is symmetric if the elements symmetric about the main diagonal are equal.
     * 
     * @param args command line arguments (not used)
     */
    public static boolean isSymmetric(int[][] a,int size) {
        boolean found = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (a[i][j] != a[j][i]) { 
					found = false; 
				}
            }
        }
        return found;
    }
    public static void main(String[] args) {
		int[][] a = {{1,4,5},{4,-3,0},{5,0,7}};
		int size = a.length;
        boolean res = isSymmetric(a,size);
        System.out.print(res);
    }
}
