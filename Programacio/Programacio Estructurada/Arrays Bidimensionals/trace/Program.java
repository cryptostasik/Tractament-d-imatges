/*
 * Program.java 1.0 12/12/2025
 *
 * exerciciia2
 *
 * Donada una taula bidimensional quadrada numèrica real, calcula la seva traça. 
 * La traça d'una matriu és la suma dels elements de la diagonal principal.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Arrays;
public class Program {
	/**
     * Given a two-dimensional square real number table, calculate its trace. 
     * The trace of a matrix is ​​the sum of the elements of the main diagonal.
     * 
     * @param args command line arguments (not used)
     */
    public int trace(double [][]m){
		int i,j,suma;
		suma = 0;
		
		System.out.print("\n Suma de Matrix de Diagrama: ");
		
		for (i = 0; i < m.length; i++) {
			for (j = 0; j < m[0].length; j++) {
				if (i == j){
					suma += m[i][j];
				}
			}
		}
		//for (int i = 0; i < m.length; i++) {
        //   suma += m[i][i];
        //}
        return suma;
	}
	public static void main(String[] args) {
		double [][] m = {{3,2,4,2},{6,8,9,2},{3,2,6,4},{2,5,7,4}};
		Program p = new Program();
		int res = p.trace(m);
		System.out.print(res);
	}
}
