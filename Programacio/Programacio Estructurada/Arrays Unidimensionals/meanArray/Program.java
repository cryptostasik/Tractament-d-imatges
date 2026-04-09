/*
 * Program.java 1.0 21/11/25
 *
 * exerciciv4
 *
 * Donada una taula de nombres reals, calcula la mitjana aritmètica dels seus elements.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {

    /**
     * Calculates the arithmetic mean (average) of all elements in the given array.
     *
     * @param array the array of real numbers (double values)
     * @return the average of the elements
     * @throws IllegalArgumentException if the array is null or empty
     */
    public double averageArray(double[] array) {
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        double[] numbers = {6.0, 5.0, 8.0, 12.0, 3.0};
        Program p = new Program();
        double average = p.averageArray(numbers);
        System.out.printf("Average : %.2f%n", average);
    }
}
