/*
 * Program.java 1.0 12/12/2025
 * 
 * exerciciia3
 * 
 * Donada una taula numèrica real, crea la seva taula transposada. 
 * La taula transposada s'obté canviant les files per les columnes.
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */

public class Program {
	/**
     * Given a real number table, create its transpose table.
     * The transpose table is obtained by changing the rows for the columns.
     * 
     * @param args command line arguments (not used)
     */
    public static int[][] transpose(int[][] m) {
        int fil = m.length;
        int column = m[0].length;

        int[][] t = new int[column][fil];

        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < column; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int[][] original = {{1,  2,  3,  4},{5,  6,  7,  8},{9, 10, 11, 12},{13,14, 15, 16}};
        
        System.out.println("Matriu original:");
        for (int[] fila : original) {
            for (int x : fila) {
                System.out.printf("%4d", x);
            }
            System.out.println();
        }
        
        int[][] transposada = transpose(original);
        System.out.println("\nMatriu transposada:");
        for (int[] fila : transposada) {
            for (int x : fila) {
                System.out.printf("%4d", x);
            }
            System.out.println();
        }
    }
}
