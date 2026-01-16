/*
 * Program.java 1.0 16/1/2026
 *
 * exercicis5
 *
 * Donade una cadena,determina si nomes conte digits.
 *
 * Copyright 2026 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Given a string, determine if it only counts digits.
     *
     * @param s a string
     * @return boolean the true or false in the String
     */
    /*public boolean onlyDigits(String s) {
		boolean found = false;
		for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i))) {
					found = true;
				} else if (!Character.isDigit(s.charAt(i))) {
					found = false;
				} 
		}
		return found;
	}
	*/
	public boolean onlyDigits(String s) {
		int i = 0;
		boolean found = false;
		while (i < s.length() && !found) {
			if (Character.isDigit(s.charAt(i))) {
				found = true;
			} else if (!Character.isDigit(s.charAt(i))) {
				found = false;
			}
			i++; 
		}
		return found;
	}
    public static void main(String[] args) {
        Program p = new Program();
        String s = "9100qa";
        boolean result = p.onlyDigits(s);
        System.out.println(result);
    }
}

