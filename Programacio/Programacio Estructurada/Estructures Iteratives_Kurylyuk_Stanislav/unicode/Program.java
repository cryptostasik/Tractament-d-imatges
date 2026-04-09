/*
 * Program.java 1.0 21/11/25
 *
 * exercicii5
 *
 * Donats dos nombres enters positius n1 i n2 amb n1 < n2,
 * escriu els caràcters Unicode de dins de l'interval [n1, n2] en ordre creixent.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given two positive integers n1 and n2 with n1 <= n2,
     * prints the Unicode characters in the range [n1, n2] in ascending order.
     *
     * @param n1 start of the range
     * @param n2 end of the range
     */
    public static void writeUnicode(int n1, int n2) {
        // Validate input
        for (int i = n1; i <= n2; i++) {
            char c = (char) i;
            System.out.printf("U+%04X : %c%n", i, c);
        }
    }

    public static void main(String[] args) {
        // Example: print characters from 65 ('A') to 90 ('Z')
        System.out.println("Caràcters Unicode de 65 a 90 (lletres majúscules llatines):");
        writeUnicode(65, 90);
    }
}
