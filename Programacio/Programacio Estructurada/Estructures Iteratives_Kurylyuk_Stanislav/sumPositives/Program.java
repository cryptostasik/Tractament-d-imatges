/*
 * Program.java 1.0 7/11/25
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
    /**
     * Donats two name enters n1 i n2 amb n1 < n2 , 
     * calculates the sum of the names entered positius that have occurred in the interval [n1, n2].
     * 
     * @param args command line arguments (not used)
     */
    public static void sumPositives(int n1, int n2) {
		int i;
		int suma = 0;  
        for (i = n1 ; i <= n2; i++) {
            if (i > 0) {	
				suma += i;  //suma = suma + i;
            }
            System.out.print(suma + " ");
        }
    }
    public static void main(String[] args) {
		int n1,n2;
		
		Program p = new Program();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduïu un numero(n1)");
        n1 = s.nextInt();
        System.out.print("Introduïu un numero(n2)");
        n2 = s.nextInt();
        
        p.sumPositives(n1,n2);
    }
}
