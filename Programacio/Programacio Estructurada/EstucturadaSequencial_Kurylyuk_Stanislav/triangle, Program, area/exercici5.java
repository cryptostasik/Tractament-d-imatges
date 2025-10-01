/*
 * exercici5.java 1.0 29/09/25
 *
 * Calcula l'àrea d'un triangle a partir de la seva base i la seva
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

public class exercici5 {
    /**
     * Calculates the area of a triangle given its base and height.
     *
     * @param base the base length of the triangle
     * @param height the height of the triangle
     * @return the area of the triangle
     */
    public static double calculateArea(double base, double height) {
        // Calculate the area using the formula (base * height) / 2
        double area = (base * height) / 2;
        return area;
    }
    public static void main(String[] args) {
        double base = 3.0;
        double height = 1.5; 
        double area;
        exercici5 p = new exercici5();
        area = p.calculateArea(base, height);
        System.out.println("Area = " + area);
    }
}
