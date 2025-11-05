/*
 * Program.java 1.0 5/11/25
 *
 * exercicii15
 *
 * Donats dos nombre enters n1 i n2 amb n1 < n2 , 
 * calcula la suma dels nombres enters positius que hi ha dins l’interval [n1 , n2].
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;
public class Program {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int i,n,numero,min,max;

        System.out.print("Introduïu la quantitat de números (n):\n");
        n = s.nextInt();

        System.out.print("Introduïu un numero 1: \n");
        numero = s.nextInt();
        max = numero;
        min = numero;

        for (i = 2; i <= n; i++) {
            System.out.printf("Introduïu un numero %d:\n",i);
            numero = s.nextInt();
            if (numero > max) {
                max = numero;
            } else if (numero < min) {
			    min = numero;
            }
        }
        System.out.println("El més gran: " + max);
        System.out.println("El més petit: " + min);

    }
}
