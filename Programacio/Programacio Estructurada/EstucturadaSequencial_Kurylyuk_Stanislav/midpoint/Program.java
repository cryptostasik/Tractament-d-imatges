/*
 * exercici30.java 1.0 08/10/25
 *
 * Llegeix les coordenades de dos punts introduïts per teclat i troba 
 * les coordenades del seu punt mig, segons la següent fórmula:
 * ((a  + b ) / 2) | ((c  + d ) / 2)
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {

    /**
     *
     * Calculates the x and y coordinate of the midpoint of the segment between two points.
     * 
     * @param cordix1 coordinate of the first point
     * @param cordix2 coordinate of the second point
     * @param cordiy1 coordinate of the first point
     * @param cordiy2 coordinate of the second point
     * @return m1 and m2 coordinate of the midpoint of the segment
     */
    public double[] average(double cordix1, double cordiy1, double cordix2, double cordiy2) {
        // Calculate the x-coordinate of the midpoint: average of x-coordinates
        double m1 = (cordix1 + cordix2) / 2;
        // Calculate the y-coordinate of the midpoint: average of y-coordinates
        double m2 = (cordiy1 + cordiy2) / 2;
        // Return the midpoint coordinates as an array
        return new double[] { m1, m2 };
    }
    
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Program point = new Program();
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

		
		// Calculate the midpoint coordinates by calling the average method
        double[] migpoint = point.average(cordix1, cordiy1, cordix2, cordiy2);
        // Extract the x-coordinate of the midpoint
        double m1 = migpoint[0];
        // Extract the y-coordinate of the midpoint
        double m2 = migpoint[1];
        
        System.out.println("-----------------------------");
		System.out.printf("Punt mig entre: (%.2f, %.2f) i (%.2f, %.2f) = (%.2f, %.2f)%n",
                          cordix1, cordiy1, cordix2, cordiy2, m1, m2);
        
		s.close();
    }
}
