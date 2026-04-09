/*
 * Program.java 1.0 9/1/2026
 *
 * exercicis2
 *
 * Donada una cadena, troba la primera vocal. Si no té vocals, retornarem un espai en blanc.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given a string, find the first vowel. If there are no vowels, we will return a blank space.
     *
     * @param s a string
     * @return the number of vowels
     */
    public char firstVowels(String s) {
        String s2;
        s2 = s.toLowerCase();
        char vowel = ' ';
        char result = ' ';
        
        for (int i = 0; i < s2.length(); i++) {
			vowel = s.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
                result = vowel;
                i = s2.length();
			}
		}
		return result;
	}

    public static void main(String[] args) {
        Program p = new Program();
        System.out.println(p.firstVowels("hello"));         
    }
}
