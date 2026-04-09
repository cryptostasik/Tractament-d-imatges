/*
 * Program.java 1.0 21/11/25
 *
 * exercici
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double[] a;
		int n,suma;
		System.out.print("");
		System.out.print("Dimencio ? ");
		n = s.nextInt();
		a = new double[n];
		for (int i = 1; i < n;i++){
			System.out.printf("a[%d]",i);
			a[i] = s.nextDouble();
			suma =+i; 
		}
		for (int i = 0; i < a.length;i++){
			System.out.printf("%f",a[i]);
		}
		
    }
}
