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
     * Program to request personal data(name,age,weight,)
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        String name1 = " ";
        String name2 = " ";  
        int edat1;
        int edat2;
        double pes1;
        double pes2;
        Scanner s = new Scanner(System.in);

		// 
        System.out.println("1)Com et dius? ");
        name1 = s.nextLine();
        System.out.println("\n1)Hola " + name1 + " !!!");


        System.out.println("\n1)Quina edat tens " + name1 + " ?");
        edat1 = s.nextInt();

        System.out.println("\n1)Quan peses ? ");
        pes1 = s.nextDouble();
        
		System.out.print("\n2)Com et dius? ");
        name2 = s.nextLine();
        name2 = s.nextLine();
        System.out.println("\n2)Hola " + name2 + "!!!");


        System.out.println("\n2)Quina edat tens " + name2 + " ?");
        edat2 = s.nextInt();

        System.out.println("\n2)Quan peses ? ");
        pes2 = s.nextDouble();


        System.out.println("\n\nTAULA DE INFORMACIO PERSONAL\n\n");
		System.out.println("---------------------");
		System.out.printf("|%-8s:%10s|\n","NOM1",name1); 
		System.out.printf("|%-8s:%10s|\n","NOM2",name2);
		System.out.printf("|%-8s:%010o|\n","EDAT_1",edat1);
		System.out.printf("|%-8s:%010o|\n","EDAT_2",edat2);
		System.out.printf("|%-8s:%10.2f|\n","PES1",pes1);
		System.out.printf("|%-8s:%10.2f|\n","PES2",pes2);
        s.close();
    }
}


