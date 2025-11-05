/*
 * ProgramTUI.java 1.0 5/11/25
 *
 * exercicii11
 *
 * Llegeix un nombre enter n i n nombres enters i escriu el nombre més gran i el més petit d'ells.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class ProgramTUI {
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
            } else {
			    min = numero;
            }
        }
        
        //max = munero > max ? numero : max;
        //min = munero < min ? numero : min;
        
        System.out.println("El més gran: " + max);
        System.out.println("El més petit: " + min);

    }
}
