/*
 * Program.java 1.0 19/1/2026
 *
 * exercicis15
 *
 * Donades dues cadenes, comprova si la segona és subcadena de la primera i si és així,
 * crea una tercera cadena igual a la primera sense l'aparició de la segona. 
 * Si apareix més d'un cop, només es suprimirà la primera aparició.
 *
 * Copyright 2026 Kurylyuk Stanislav
 */
public class Program {

    /**
	 * Given two strings, check if the second is a substring of the first and if so,
	 * create a third string equal to the first without the second occurrence. 
	 * If it appears more than once, only the first occurrence will be deleted.
     *
     * @param s1 a string (text)
     * @param s2 a string (sub)
     * @return the int how many times the second appears in the first.
     */
    public String withoutString(String s1 , String s2) {
		int pos = s1.indexOf(s2);
		String s3 = "";
		if (pos != -1) {
			s3 = s1.substring(0, pos) +  s1.substring((pos + s2.length()), s1.length());
		}		
		return s3;
	}

    public static void main(String[] args) {
        Program p = new Program();
        String s1 = "portal";
        String s2 = "rt";
        String without = p.withoutString(s1,s2);
        System.out.print(without);
    }
}
