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
public class Program1 {

    /**
     * Given a character and a string, determine whether the character is within the string or not. 
	 * Make two versions of the program: one using the indexOf(c) method and another version without using this method.
	 * 
     * @param s a string
     * @param c a character
     * @return true if c is in s,flase otherwise.
     */
    public boolean isCharInString(String s,char c) {
		return s.indexOf(c) != -1;
	}
    public static void main(String[] args) {
        Program1 p = new Program1();
        char c = '.';
        String s = "Welcome.com";
		boolean resultat = p.isCharInString(s,c);
        System.out.println(resultat);
          
    }
}
