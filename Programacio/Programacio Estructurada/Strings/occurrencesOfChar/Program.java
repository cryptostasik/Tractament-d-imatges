/*
 * Program.java 1.0 14/1/2026
 *
 * exercicis8
 *
 * Donats un caràcter i una cadena, calcula quantes vegades apareix el caràcter dins la cadena.
 *
 * Copyright 2026 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given a character and a string, calculate how many times the character appears in the string.
     *
     * @param s a string
     * @param c a character
     * @return found how many characters in string
     */
    public static int occurrencesOfChar(String s,char c) {
    int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
    public static void main(String[] args) {
        Program p = new Program();
        char c = 'a';
        String s = "banana";
        int resultat = p.occurrencesOfChar(s,c);
        System.out.printf("La paraula \"%s\" conté %d lletres '%c' %n", s, resultat, c);
    }
}

