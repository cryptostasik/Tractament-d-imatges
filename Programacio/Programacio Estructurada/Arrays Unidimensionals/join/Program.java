
/*
 * Program.java 1.0 1/12/25
 *
 * exerciciv15
 *
 * Donades dues taules numèriques reals, construeixi una tercera taula amb els elements 
 * de la primera taula seguits dels elements de la segona i retorna aquesta tercera taula.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;
public class Program {
    public int[] join(int[] num1, int[] num2) {
		int i;
		int[] x = new int[num1.length + num2.length];
		int j = 0;
		for (i = 0; i < num1.length; i++) {
			x[j] = num1[i];
			j++;
        }
        for (i = 0; i < num2.length; i++) {
			x[j] = num2[i];
			j++;
        }
        return x;
    }

    public static void main(String[] args) {
        int[] num1 = {50, 60, 40, 20, 35, 78, 90};
        int[] num2 = {1, 4, 6, 10, 7, 50, 9, 3};
        Program p = new Program();
        int[] result = p.join(num1,num2);
        System.out.print("Tots Elements: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
    }
}
