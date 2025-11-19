/*
 * Program.java 1.0 29/10/25
 *
 * exercicii49
 *
 * Donats dos nombres enters positius n 1 i n 2 amb n 1 < n 2 i 1 < n 1 , 
 * escriu els nombres primers que hi ha dins l’interval [n 1 , n 2 ] en ordre creixent
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;
public class Program{
    /**
     * Given two positive integers n 1 and n 2 with n 1 < n 2 and 1 < n 1 ,
	 * write the prime numbers within the interval [n 1 , n 2 ] in increasing order
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1,n2,suma,resultat;
        
        suma = 0;
        resultat = 0;
        
		System.out.print("Introduïu número(n1) : ");
        n1 = s.nextInt();
        
        System.out.print("Introduïu número(n2) : ");
        n2 = s.nextInt();
      
		boolean found = false;
      
		while ()
      
      
		for(int i = n1; i <= n2; i++) {
			if (n2 % i == 0){
				System.out.printf("%d ",i);	
				}
		}
	}
}
