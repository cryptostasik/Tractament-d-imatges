/*
 * Program.java 1.0 21/11/25
 *
 * exercicii5
 *
 * Donats dos nombres enters n1 i n2 amb n1 < n2 i un nombre enter x,
 * escriu x nombres enters aleatoris dins l’interval [n1, n2].
 * NOTA: Math.random() retorna un valor aleatori major o igual a 0 i menor a 1.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Donats dos nombres enters n1 i n2 amb n1 < n2 i un nombre enter x,
     * escriu x nombres enters aleatoris dins l’interval [n1, n2] (ambdues fronteres incloses).
     *
     * @param n1 límit inferior de l'interval (inclòs)
     * @param n2 límit superior de l'interval (inclòs), n1 < n2
     * @param x  quantitat de números aleatoris a generar (x > 0)
     */
    public static void writeRandomNumbers(int n1, int n2, int x) {
        int randomNumber,i;
        for (i = 0; i < x; i++) {
            randomNumber = (int) (Math.random() * (n2 - n1 + 1)) + n1;
            System.out.print(randomNumber);
            // Separate the numbers with a comma and space, except for the last one
            if (i < x - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // New line at the end
    }

    public static void main(String[] args) {
        System.out.println("10 números aleatoris entre 1 i 100:");
        writeRandomNumbers(1, 100, 10);
    }
}
