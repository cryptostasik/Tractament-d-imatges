/*
 * Program.java 1.0 19/1/2026
 *
 * exercicis13
 *
 * Donades dues cadenes, determina si la primera és una subcadena de la segona. 
 * Fes dues versions del programa: una usant el mètodeindexOf(s) i una altra versió sense usar aquest mètode.
 *
 * Copyright 2026 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given two strings, determine whether the first is a substring of the second.
	 * Make two versions of the program: one using the indexOf(s) method and another version without using this method.
     *
     * @param s1 a string (text)
     * @param s2 a string (sub)
     * @return the boolan if determine whether the first is a substring of the second
     */
    //public boolean isSubstring(String s1, String s2) {
	//	return s1.indexOf(s2) != -1;
    //}
    
    public boolean isSubstring(String s1, String s2) {
		boolean esSubsting = false;
		int i = 0;
		String sub;
		while (i < s1.length() - s2.length()) {
			sub = s1.substring(i, s2.length() + i);
			if (s2.equals(sub)) esSubsting = true;
			i++;
		}
		return esSubsting;
	}
    

    public static void main(String[] args) {
        Program p = new Program();
        String s1 = "banana";
        String s2 = "nan";
        boolean substring = p.isSubstring(s1,s2);
        System.out.println(substring);
    }
}
