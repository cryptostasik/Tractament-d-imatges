/*
 * Program.java 1.0 29/10/25
 *
 * exercicii19
 *
 * Donat un nombre enter positiu, escriu els seus divisors positius
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {
    public static void writeDivisors(int n1, int n2) {
        int i;
        for (i = n1; i <= n2; i++) {
			if (i % 2 == 0){
				System.out.printf(i + " ");	
				for (i == n2){
					int divir = i % 2;
					System.out.printf(divir + " ");	
					}
				}         
            }
        }
    public static void main(String[] args) {
        Program p = new Program();
        p.writeDivisors(0, 10);
    }
}
