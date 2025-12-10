/*
 * ProgramTUI.java 1.0 10/12/2025
 *
 * exerciciv21
 *
 * Fer un programa que llegeixi una taula numèrica real, 
 * l'ordeni pel mètode de la bombolla i escrigui els seus elements.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Arrays;
public class Program {
	/**
     * 
     * Make a program that reads a real number table, 
     * sorts it using the bubble method and writes its elements.
     * 
     * @param args command line arguments (not used)
     */
    public void bubbleSort(double[] a) {
        double aux;
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        double[] a = {7.0, 4.0, 6.0, 8.0, 9.0};
        Program p = new Program();
        p.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
