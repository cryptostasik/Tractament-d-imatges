/*
 * Program.java 1.0 29/10/25
 *
 * exercicii1
 *
 * Donats dos nombres enters n1 i n2 amb n1 < n2, escriu per pantalla tots els nombres enters dins l’interval
 * [n1, n2] en ordre creixent.
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
    public static void writeAscNumbers(int n1, int n2) {
        int i = n1;
        while (i <= n2) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        writeAscNumbers(1, 5);
    }
}
