/*
 * Program.java 1.0 5/11/25
 *
 * exercicii9
 *
 * Donat un nombre enter positiu, escriu els seus divisors positius
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {
    public static void writeDivisors(int n1) {
        int i;
        for (i = 1; i <= n1; i++) {
			if (n1 % i == 0){
				System.out.printf(i + " ");			
				}         
            }
        }
    public static void main(String[] args) {
        Program p = new Program();
        p.writeDivisors(12);
    }
}
