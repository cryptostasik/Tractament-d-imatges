/*
 * Program.java 1.0 19/1/2026
 *
 * exercicis14
 *
 * Donades dues cadenes, determina quantes vegades apareix la segona dins la primelara.
 *
 * Copyright 2026 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given two strings, determine how many times the second appears in the first.
     *
     * @param s1 a string (text)
     * @param s2 a string (sub)
     * @return the int how many times the second appears in the first.
     */
    public int occurrencesOfString(String s1, String s2) {
		int i = 0,count = 0;
		String sub;
		while (i <= s1.length() - s2.length()) {
			sub = s1.substring(i, s2.length() + i);
			if (s2.equals(sub)) count++;
			i++;
		}
		return count;
	}

    public static void main(String[] args) {
        Program p = new Program();
        String s1 = "banana";
        String s2 = "na";
        int occurrences = p.occurrencesOfString(s1,s2);
        System.out.printf("A la línia \"%s\" la subcadena \"%s\" apareix %d vegades%n", s1, s2, occurrences);
    }
}
