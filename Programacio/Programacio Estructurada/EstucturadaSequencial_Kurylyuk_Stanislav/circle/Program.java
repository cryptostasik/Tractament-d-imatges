/*
 * exercici25.java 1.0 06/10/25
 *
 * Calcula l'àrea lateral i el volum d'un cilindre recte, a partir del seu radi i la seva alçada.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Calculates the area of a circle
     * 
     * @param radius radius of the circle
     * @return area of the circle
     */
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter (circumference) of a circle
     * 
     * @param radius radius of the circle
     * @return perimeter of the circle
     */
    public double perimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    
    public static void main(String[] args) {
        Program cercle = new Program();
        double radius = 3.0;

        double area = cercle.area(radius);
        double perimeter = cercle.perimeter(radius);

        System.out.println("Radi = " + radius);
        System.out.println("Àrea = " + area);
        System.out.println("Perímetre = " + perimeter);
    }
}
