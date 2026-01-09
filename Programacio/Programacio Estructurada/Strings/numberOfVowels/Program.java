/*
 * Program.java 1.0 9/1/2026
 *
 * exercicis1
 *
 * Donada una cadena calcula quants d’ells són vocals. S'ha de considerar que tant el caràcter a com el caràcter A són vocals.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given a string, calculate how many of them are vowels.
     * Both the character a and the character A must be considered vowels.
     *
     * @param s a string
     * @return the number of vowels
     */
    public int numberOfVowels(String s) {
        String s2;
        char c;
        int count = 0;
        s2 = s.toLowerCase();
        for (int i = 0; i < s2.length(); i++) {
			c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Program p = new Program();
        System.out.println(p.numberOfVowels("dotnetcluster")); // 4
        System.out.println(p.numberOfVowels("Hello World"));   // 3
        System.out.println(p.numberOfVowels("aeiou"));         // 5
    }
}
