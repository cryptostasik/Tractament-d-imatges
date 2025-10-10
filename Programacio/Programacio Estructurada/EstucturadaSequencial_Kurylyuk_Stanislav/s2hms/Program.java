/*
 * exercici32.java 1.0 10/10/25
 *
 * Llegeix un nombre enter de segons i escriу el nombre d’hores, minuts i segons equivalents en format h:m:s.
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Converts a number of seconds into hours, minutes, and seconds.
     * 
     * @param sec_a the total number of seconds
     * @return an array containing hours, minutes, and seconds
     */
    public static int[] s2hms(int sec_a) {
		int h ,m ,s;
        h = (sec_a % 86400) / 3600;
        m = (sec_a % 3600) / 60;
        s = (sec_a % 3600) % 60;
        
        // Return an array with hours, minutes, and seconds
        return new int[] { h, m, s };
    }
    
    public static void main(String[] args) {
		Program p = new Program();
        Scanner b = new Scanner(System.in);
        int sec_a ,h ,m ,s;
        
        System.out.println("Introduïu el nombre de segons: ");
        sec_a = b.nextInt();
        
        // Convert seconds to hours, minutes, and seconds by calling s2hms
        int[] result = p.s2hms(sec_a);
        
        // Extract hours, minutes, and seconds from the result array
        h = result[0];
        m = result[1];
        s = result[2];

        System.out.printf("%d:%d:%d\n", h, m, s);

        b.close();
    }
}
