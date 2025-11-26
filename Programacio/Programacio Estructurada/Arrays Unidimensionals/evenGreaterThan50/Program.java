/*
 * Program.java 1.0 24/11/25
 *
 * exerciciv14
 *
 * Donada una taula inicialitzada amb els següents valors:
 * retorna una altra taula amb tots aquells elements parells majors que 50.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    public int[] evenGreaterThan50(int[] array) {
        int pos = 0, count = 0;
		

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 50 && array[i] % 2 == 0) {
                count++;
            }
        }
        int[] resultat = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 50 && array[i] % 2 == 0) {
                resultat[pos] = array[i];
                pos++;
            }
        }
        return resultat;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 10, 32, 60, 91, 34, 56, 73, 88, 86};
        Program p = new Program();
        int[] result = p.evenGreaterThan50(numbers);
        System.out.print("Elements parells > 50: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }

    }
}
