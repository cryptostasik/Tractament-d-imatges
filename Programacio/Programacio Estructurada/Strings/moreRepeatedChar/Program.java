/*
 * Program.java 1.0 21/1/2026
 *
 * exercicis18
 *
 * Donada una cadena, determina quin és el caràcter que apareix més cops. 
 * Retornarem un array de dues cel·les on la primera cel·la contindrà el 
 * codi ASCII del caràcter més repetit i en la segona cel·la quants cops apareix.
 *
 * Copyright 2026 Kurylyuk Stanislav
 */
public class Program {

    /**
	 * Given a string, determine which character appears the most times. 
	 * We will return a two-cell array where the first cell will contain the ASCII 
	 * code of the most repeated character and in the second cell how many times it appears.
     *
     * @param s a string 
     * @return the most repeated characte and  how many times it appears.
     */
    public int [] moreRepeatedChar(String s) {
		char mesRepetit = s.charAt(0);
		int max = 0;
		int [] res = new int[2];
		 
		for (int i = 0; i < s.length(); i++) {
			char actual =  s.charAt(i);
			int rep = 0;
			
			for (int j = 0; j < s.length(); j++){
				if (s.charAt(j) == actual) {
					rep++;
				}

			}
			if (rep > max){
				max = rep;
				mesRepetit = actual;
			}
        }
        res[0] = mesRepetit;
        res[1] = max;
        return res;
	}

    public static void main(String[] args) {
        Program p = new Program();
        String s = "banana";
        int [] repeated = p.moreRepeatedChar(s);
		System.out.print("ASCII: " + repeated[0] + " i repetit:" + repeated[1] + " en " + s);
    }
}
