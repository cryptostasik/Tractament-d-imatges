/*
 * ProgramTUI.java 1.0 10/12/2025
 *
 * exerciciv23
 *
 * Donada una taula de nombres enters ordenats de forma creixent i un nombre enter, 
 * determina si el nombre és un element de la taula emprant cerca dicotòmica. 
 * No usis el mètode Arrays.binarySearch()
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Arrays;
public class Program {
	/**
     * 
     * Given a table of integers sorted in ascending order and an integer, 
     * determine whether the number is an element of the table using dichotomous search. 
     * Do not use the Arrays.binarySearch() method.
     * 
     * @param args command line arguments (not used)
     */
    public boolean binarySearch(int[] a,int n) {
        int center,low,top;
        boolean found = false;
        Arrays.sort(a);
        low = 0;
        top = a.length - 1;
        while (low <= top && !found) {
			center = (top + low) / 2;
            if (a[center] == n) {
				found = true;
			} else if (n < a[center]) {
				top = center - 1;
			} else {
				low = center + 1;
			}
        }
        return found;
    }
    public static void main(String[] args) {
        int[] a = {7, 4, 6, 8, 9};
        Program p = new Program();
        boolean treball = p.binarySearch(a,4);
        if(treball){
			System.out.print("Yes");
		} else{
			System.out.print("No");
		}
    }
}
