/*
 * ProgramTUI.java 1.0 10/12/2025
 *
 * exerciciv17
 *
 * Donades dues taules de nombres enters, determina si són iguals o no. 
 * Dues taules són iguals si tenen els mateixos elements en les mateixes posicions.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Arrays;
public class Program {
    /**
     * 
     * @param a primera taula
     * @param b segona taula
     * @return true si són idèntiques, false altrament
     */
    public boolean equals(int[] a, int[] b) {
        int i;
        boolean found = false;
        if (a.length != b.length) {
            found = true;
        } else {
			i = 0;
			while (i < a.length && !found) {
				if (a[i] != b[i]) {
					found = true;        
				}
				i++;                        
			}
		}
        return found;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        int[] b = {1, 2, 4, 5, 6};
        Program p = new Program();
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if (p.equals(a, b)) {
			System.out.println("Diferents");
		} else {
			System.out.println("Iguals");
		}
    }
}
