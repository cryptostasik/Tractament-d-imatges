/*
 * exercici26.java 1.0 06/10/25
 *
 * Calcula l'àrea lateral i el volum d'un cilindre recte, a partir del seu radi i la seva alçada.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class Program {

    /**
     * Calculates the volume of a cylinder
     *
     * @param radius radius of the cylinder
     * @param height height of the cylinder
     * @return volume of the cylinder
     */
    public double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    /**
     * Calculates the lateral (side) area of a cylinder
     *
     * @param radius radius of the cylinder
     * @param height height of the cylinder
     * @return lateral area of the cylinder
     */
    public double areaLateral(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    public static void main(String[] args) {
        Program cylinder = new Program();
        double radius = 3.0;
        double height = 10.0;

        double volume = cylinder.volume(radius, height);
        double areaLateral = cylinder.areaLateral(radius, height);

        System.out.println("Radius = " + radius);
        System.out.println("Height = " + height);
        System.out.println("Volume = " + volume);
        System.out.println("Lateral area = " + areaLateral);
    }
}

