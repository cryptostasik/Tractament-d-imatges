/*
 * Program.java 1.0 24/11/25
 *
 * exerciciv11
 *
 * Donada una taula de nombres enters, calcula el valor més freqüent de la taula. 
 * Si n'hi ha més d'un que presenta la freqüència màxima, haurem de retornar el que té l'índex més petit.
 * 
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
	 /**
     * Given a table of integers, calculate the most frequent value in the table.
	 * If there is more than one that has the maximum frequency, we must return the one with the smallest index.
     */
	public int frequent(int[] array){
		int bestValue,maxCount,currentCount;
		bestValue = array[0];              
        maxCount = 0;   
        currentCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount || (currentCount == maxCount & i < array.length )){
				maxCount = currentCount;		
            }
        }
        return bestValue;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 5, 4, 8, 4, 5, 8};
        Program p = new Program();
        System.out.println("Valor més freqüent (l'índex més petit):" + p.frequent(numbers));
    }
}
