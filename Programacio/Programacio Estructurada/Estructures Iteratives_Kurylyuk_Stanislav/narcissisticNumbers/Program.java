/*
 * writeNarcissisticNumbers.java 1.0 29/10/25
 *
 * exercicii10
 *
 * Print all 3-digit narcissistic numbers.
 * A number is narcissistic if it equals the sum of the cubes of its digits.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {
    public static void writeNarcissisticNumbers(int n1, int n2) {
        System.out.println("Narcissistic numbers (3 digits):");
        int i;
        for (i = n1; i <= n2; i++) {
			
            int centenars = i / 100;
            int desenes = (i / 10) % 10;
            int unitats = i % 10;
            
            if (i == Math.pow(centenars,3) + Math.pow(desenes,3) + Math.pow(unitats,3)  ) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Program p = new Program();
        p.writeNarcissisticNumbers(100, 999);
    }
}
