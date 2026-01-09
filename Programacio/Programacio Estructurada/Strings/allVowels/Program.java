/*
 * Program.java 1.0 9/1/2026
 *
 * exercicis3
 *
 * Donada una cadena, determina si apareixen totes les vocals.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given a string, determine if all vowels appear.
     *
     * @param s a string
     * @return the number of vowels
     */
    public boolean allVowels(String s) {
        String s2;
        s2 = s.toLowerCase();
        char c;
        boolean A1 = false;
        boolean E1 = false;
        boolean I1 = false;
        boolean O1 = false;
        boolean U1 = false;
        
        for (int i = 0; i < s2.length(); i++) {
			c = s.charAt(i);
            if (c == 'a') A1 = true;
            if (c == 'e') E1 = true;
            if (c == 'i') I1 = true;
            if (c == 'o') O1 = true;
            if (c == 'u') U1 = true;
		}
		return A1 && E1 && I1 && O1 && U1;
	}
    public static void main(String[] args) {
        Program p = new Program();
        System.out.println(p.allVowels("aeioup"));         
    }
}
