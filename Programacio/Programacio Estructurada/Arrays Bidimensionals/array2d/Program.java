/*
 * Program.java 1.0 12/12/2025
 *
 * exerciciia1(Atel)
 *
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Arrays;
public class Program {
	/**
     * Read and write an array 2D.
     * 
     * @param args command line arguments (not used)
     */
	public static void main(String[] args) {
	int i,j;
	int [][] a = {{3,2,4,2},{6,8,9,2}};
	System.out.println("Recorregut per files");
	for (i = 0; i < a.length; i++) {
		for (j = 0; j < a[0].length; j++) {
			System.out.printf("%3d",a[i][j]);
		}
		System.out.printf("\n");
	}
	System.out.println("Recorregut per columes");
	for (i = 0; i < a[0].length; i++) {
		for (j = 0; j < a.length; j++) {
			System.out.printf("%3d",a[j][i]);
		}
		System.out.printf("\n");
	}
	}
}
