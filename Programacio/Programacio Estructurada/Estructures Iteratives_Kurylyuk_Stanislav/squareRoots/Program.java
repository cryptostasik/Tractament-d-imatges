/*
 * Program.java 1.0 29/10/25
 *
 * exercicii3
 *
 * Donats dos nombres enters n1 i n2 amb n1 < n2,
 * escriu les arrels quadrades dels nombres enters dins l'interval [n1, n2] en ordre creixent.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Escriu a la consola les arrels quadrades dels nombres enters
     * des de n1 fins a n2 (inclosos), en ordre creixent.
     *
     * @param n1 nombre enter (inici de l'interval)
     * @param n2 nombre enter (final de l'interval), n1 <= n2
     */
    public static void writeSquareRoots(double n1, double n2) {
        for (double i = n1;i <= n2;i++) {
            System.out.print(Math.sqrt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
		Program p = new Program();
        p.writeSquareRoots(4, 36);
    }
}
