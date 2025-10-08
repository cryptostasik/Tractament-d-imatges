/*
 * exercici31.java 1.0 08/10/25
 *
 * Llegeix un nombre enter de segons i escriu 
 * el nombre d’hores, minuts i segons equivalents en format h:m:s.
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class exercici30 {

    /**
     *
     * Calculates the x-coordinate of the midpoint of the segment between two points.
     * 
     * @param cordix1 coordinate of the first point
     * @param cordix2 coordinate of the second point
     * @return x coordinate of the midpoint of the segment
     */
    public double mig_x(double cordix1, double cordix2) {
        return  (cordix1 + cordix2)/2;
    }
	 /**
     *
     * Calculates the y-coordinate of the midpoint of the segment between two points.
     * 
     * @param cordiy1 coordinate of the first point
     * @param cordiy2 coordinate of the second point
     * @return y coordinate of the midpoint of the segment
     */
    public double mig_y(double cordiy1, double cordiy2) {
        return  (cordiy1 + cordiy2)/2;
    }
    
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		exercici30 point = new exercici30();
		double cordix1;
        double cordiy1;
        double cordix2;
        double cordiy2;
        
		System.out.print("Introduïu la coordenada x del primer punt: ");
        cordix1 = s.nextDouble();
        System.out.print("Introduïu la coordenada y del primer punt: ");
        cordiy1 = s.nextDouble();
        System.out.print("Introduïu la coordenada x del segon punt: ");
        cordix2 = s.nextDouble();
        System.out.print("Introduïu la coordenada y del segon punt: ");
        cordiy2 = s.nextDouble();

        double mig_x = point.mig_x(cordix1, cordix2);
        double mig_y = point.mig_y(cordiy1, cordiy2);
        
        System.out.println("Primer coordenada: " + cordix1 + "," + cordiy1);
        System.out.println("Segon coordenada: " + cordix2 + "," + cordiy2);
        System.out.println("Punt mig del segment: " + mig_x + "," + mig_y);
		s.close();
    }
}

