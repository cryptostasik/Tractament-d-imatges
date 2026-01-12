/*
 * Program.java 1.0 12/1/2026
 *
 * exercicis7
 *
 * Donats un caràcter i una cadena, determina si el caràcter es troba dins de la cadena o no. 
 * Fes dues versions del programa: una usant elmètode indexOf(c) i una altra versió sense usar aquest mètode.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program2 {

    /**
     * Given a character and a string, determine whether the character is within the string or not. 
	 * Make two versions of the program: one using the indexOf(c) method and another version without using this method.
	 * 
     * @param s a string
     * @param c a character
     * @return true if c is in s,flase otherwise.
     */
    public boolean isCharInString(char c, String s) {
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                found = true;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Program2 p = new Program2();          
        char c = '.';
        String s = "Welcome.com";

        boolean resultat = p.isCharInString(c, s);   
        System.out.println(resultat);
    }
}
