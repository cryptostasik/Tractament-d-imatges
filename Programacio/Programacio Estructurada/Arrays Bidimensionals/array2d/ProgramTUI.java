/*
 * ProgramTUI.java 1.0 12/12/2025
 *
 * exerciciia1
 *
 * Llegeix el nombre de files i el nombre de columnes d'una taula 
 * bidimensional numèrica entera, llegeix la taula i escriu-la
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;
import java.util.Arrays;
public class ProgramTUI {
	/**
     * Read and write an array 2D.
     * 
     * @param args command line arguments (not used)
     */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nr,nc,i,j;
		int[][] m;
		System.out.printf("\n\nMATRIU\n\n");
		System.out.printf("Nombre de files ?");
		nr = s.nextInt();
		System.out.printf("Nombre de columnes ?");
		nc = s.nextInt();
		m = new int [nr] [nc];
		//Read the array 2D
		for (i = 0; i < nr; i++) {
			for(j = 0; j < nc; j++) {
				System.out.printf("t[%d][%d] = ", i,j);
				m[i][j] = s.nextInt();
			}
		}
		//Write the array 2D
		for (i = 0; i < nr; i++) {
			for (j = 0; j < nc; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
