/*
 * Program.java 1.0 21/11/25
 *
 * exerciciv2
 *
 * Donada una taula de nombres reals, calcula la suma dels seus elements.
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
	 /**
     * Given a table of real numbers, calculate the sum of its elements.
     */
	public double sumArray(double[] array){
		double suma = 0;
		for (int i = 1; i < array.length; i++) {
			suma += array[i];
		}
		for(double x: array) {
			// x == array[i];
			suma += x;
		}
		return suma;
	}
    public static void main(String[] args) {
		double numbers[] = {6.0,5,0};
		Program p = new Program();
		System.out.println("sumArray = " + p.sumArray(numbers));
    }
}
