/*
 * Program.java 1.0 9/1/2026
 *
 * exercicis4
 *
 * Donada una cadena, determina si hi ha més vocals que altres caràcters.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given a string, determine if there are more vowels than other characters.
     *
     * @param s a string
     * @return the number of vowels
     */
    public boolean moreVowels(String s) {
        String s2;
        char c;
        int vowels,total,others;
        vowels = 0;
        s2 = s.toLowerCase();
        total = s.length();
        
        for (int i = 0; i < s2.length(); i++) {
			c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }
        
		others = total - vowels;
        return vowels > others;
    }

    public static void main(String[] args) {
        Program p = new Program();
        System.out.println(p.moreVowels("Hello"));
    }
}
