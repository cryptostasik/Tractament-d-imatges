/*
 * Program.java 1.0 24/11/25
 *
 * exerciciv9
 *
 * Donada una taula numèrica d'enters que simbolitzen un vector, calcula el seu mòdul. 
 * El mòdul d'un vector es calcula de la següent manera:
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
	 /**
     * Given a numerical table of integers that symbolize a vector, calculate its modulus.
     */
	public double modulus(double[] array){
		double suma = 0, modul = 0;
		for (int i = 1; i < array.length; i++) {
			suma = suma + array[i] * array[i];
		}
		modul = Math.sqrt(suma);
		return suma;
	}
    public static void main(String[] args) {
		double numbers[] = {3.0,1.0,2.0,11.1};
		Program p = new Program();
		System.out.println("Modulu = " + p.modulus(numbers));
    }
}
