/*
 * exercici19.java 1.0 29/09/25
 *
 * Donats quatre nombres enters, determina si poden ser una adreça IP.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class exercici19 {
    /**
     * Determines if a given year is a leap year.
     *
     * @param a the year to check
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isIP(int byte1, int byte2, int byte3, int byte4) {
		boolean IP;
		IP = ((byte1 >= 0) && (byte1 <= 255)) && ((byte2 >= 0) && (byte2 <= 255)) && ((byte3 >= 0) && (byte3 <= 255)) && ((byte4 >= 0) && (byte4 <= 255));	
		return IP;
}
    public static void main(String[] args) {
        int byte1 = 255;
        int byte2 = 0;
        int byte3 = 128;
        int byte4 = 100;
		exercici19 p = new exercici19();
        boolean isIP = p.isIP(byte1,byte2,byte3,byte4);
        System.out.println(isIP ? "correct IP" : "incorrect IP");
}
}
