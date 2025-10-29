/*
 * Program.java 1.0 29/10/25
 *
 * exercicii2
 *
 * Donats dos nombre enters n 1 i n 2 amb n 1 < n 2 , 
 * escriu tots els nombres enters dins l’interval [n 1 , n 12 ] en ordre decreixent.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Write to console all the integer numbers between n1 and n2 (inclusive). 
     *
     * @param n1 an integer number (start)
     * @param n2 an integer number (end), n1 <= n2
     */
    public static void writeDescNumbers(int n1, int n2) {
        for (int i = n1;i <= n2;i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        writeDescNumbers(1, 12);
    }
}
