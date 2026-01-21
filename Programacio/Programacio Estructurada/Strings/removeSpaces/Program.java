/*
 * Program.java 1.0 21/1/2026
 *
 * exercicis10
 *
 * Donada una cadena, crea una altra cadena igual a la primera sense espais en blanc.
 *
 * Copyright 2026 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given a string, create another string equal to the first without whitespace
     *
     * @param s a string
     * @return the string without whitespace
     */
    public String removeSpaces(String s) {
        String remove = "";
        for (int i = 0; i < s.length();i++) {
            if (s.charAt(i) != ' '){
				remove+= s.charAt(i);
			}
        }
        return remove;
    }
    
    // return s.replace(" ","");

    public static void main(String[] args) {
        Program p = new Program();
        String s = "banana ban";
        String remove = p.removeSpaces(s);
        System.out.println("Original: " + s);
        System.out.println("removeSpaces: " + remove);
    }
}
