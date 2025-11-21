/*
 * Program.java 1.0 21/11/25
 *
 * exerciciv3
 *
 * Donada una taula de nombres reals, esbrina quin és el nombre més gran dels seus elements.
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
	 /**
     * Given a table of real numbers, find the largest number of its elements.
     */
	public double findMaxValue(double[] array){
		double max = 0;
		
		for (int i = 1; i < array.length; i++) {
			if ( array[i] > max) {
				max = array[i];
			}
		}
		
	//	for(double x: array) {
	//		if ( x > max) {
	//			max = x;
	//		}
	//	}
		
		return max;
	}
    public static void main(String[] args) {
		double numbers[] = {10.0,22.0,5.0,3.0,45.0};
		Program p = new Program();
		System.out.println("Largest number is : " + p.findMaxValue(numbers));
    }
}
