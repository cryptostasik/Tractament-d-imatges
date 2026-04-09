/*
 * exercici32.java 1.0 10/10/25
 *
 * Llegeix un nombre enter que designa un període de temps expressats en segons, escriu l'equivalent en 
 * dies, hores, minuts i segons escrivint la següent frase “s segons seran d dies, h hores, m minuts i s segons.”
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Converts a number of seconds into days, hours, minutes, and seconds.
     * 
     * @param sec_a the total number of seconds
     * @return an array containing days, hours, minutes, and seconds
     */
    public static int[] s2dhms(int sec_a) {
		int s, m, h, d;
        d = sec_a / 86400;
        h = (sec_a % 86400) / 3600;
        m = (sec_a % 3600) / 60;
        s = (sec_a % 3600) % 60;
        
        // Return an array with days, hours, minutes, and seconds
        return new int[] { d, h, m, s };
    }

    public static void main(String[] args) {
		Program p = new Program();
        Scanner b = new Scanner(System.in);
        int sec_a;
        
        System.out.println("Introduïu el nombre de segons: ");
        sec_a = b.nextInt();
        
        // Convert seconds to days, hours, minutes, and seconds by calling s2hms
        int[] result = p.s2dhms(sec_a);
        
        // Extract days, hours, minutes, and seconds from the result array
        int d = result[0];
        int h = result[1];
        int m = result[2];
        int s = result[3];
        
        System.out.printf("%d segons seran %d dies, %d hores, %d minuts i %d segons.\n", 
                          sec_a, d, h, m, s);
        b.close();
    }
}

