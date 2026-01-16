/*
 * Program.java 1.0 16/1/2026
 *
 * exercicis9
 *
 * Donada una cadena, crea una altra cadena amb els caràcters de la cadena donada invertits.
 *
 * Copyright 2026 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given a string, creates another string with the characters of the given string reversed.
     *
     * @param s a string
     * @return the reversed string
     */
    public String reverse(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Program p = new Program();
        String original = "banana";
        String reversed = p.reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
