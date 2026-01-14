/*
 * Program.java 1.0 14/1/2026
 *
 * exercicis11
 *
 * Donades dues cadenes, determina si són iguals o no.
 * Fes dues versions del programa: una usant el mètode areEquals(s1,s2) i una altra versió sense usar aquest mètode.
 *
 * Copyright 2026 Kurylyuk Stanislav
 */
public class Program1 {

    /**
     * Given two strings, determine whether they are equal or not.
     * Make two versions of the program: one using the areEquals(s1,s2) method and another version without using this method.
     *
     * @param s a string
     * @param c a character
     * @return found how many characters in string
     */
    public boolean areEquals(String s1,String s2) {
		return s1.equals(s2);
	}
    public static void main(String[] args) {
        Program1 p = new Program1();
        String s1 = "banana";
        String s2 = "banana";
        boolean result = p.areEquals(s1,s2);
        if (result = true) System.out.printf("Les paraules són les mateixes");
        if (result = false) System.out.printf("Les paraules són diferents");
    }
}

