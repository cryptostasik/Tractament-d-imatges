/*
 * exercici28.java 1.0 03/10/25
 *
 * Crea una aplicació per sol·licitar dades personals
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

import java.util.Scanner;

public class exercici28 {
	/**
     * Program to request personal data(name,age,weight)
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        String name; 
        int edat;
        double pes;
        
        Scanner s = new Scanner(System.in);

		// 
        System.out.print("Com et dius? ");
        name = s.nextLine();
        System.out.println("Hola " + name + "!!!");


        System.out.print("Quina edat tens? ");
        edat = s.nextInt();

        System.out.print("Quin pes tens? ");
        pes = s.nextDouble();


        System.out.println("En " + name + " té " + edat + " anys i pesa " + pes + " kilos.");

        s.close();
    }
}


