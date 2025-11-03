/*
 * Program.java 1.0 29/10/25
 *
 * exercicii8
 *
 * Donats dos nombre enters n 1 i n 2 amb n 1 < n 2 , escriu els nombres enters parells que hi ha dins 
 * l’interval [n 1 , n 2 ] en ordre creixent. El nombre zero es considera parell.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program{
    public static void writeEvenNumbers(int n1, int n2) {
		int i;
		for (i = n1; i <= n2; i++) {
			if (i % 2 == 0){
				System.out.printf(i + " ");	
				}
		}
	}
    public static void main(String[] args) {
		Program p = new Program();
        p.writeEvenNumbers(0,10); // call the method
    }
}
