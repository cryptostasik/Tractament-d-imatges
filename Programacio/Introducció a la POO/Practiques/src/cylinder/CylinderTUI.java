package cylinder;

public class CylinderTUI {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(2.0, 10.0);
        Cylinder c2 = new Cylinder(5.0, 4.0);

        System.out.println("Cilindre 1: " + c1);
        System.out.println("Cilindre 2: " + c2);

        System.out.println("\nVolum del cilindre 1: " + c1.getVolume());
        System.out.println("Àrea superficial del cilindre 1: " + c1.getTotalSurfaceArea());

        System.out.println("\nVolum del cilindre 2: " + c2.getVolume());
        System.out.println("Àrea superficial del cilindre 2: " + c2.getTotalSurfaceArea());

        // Comparació
        System.out.println("\nComparació per volum:");
        if (c1.isLargerThan(c2)) {
            System.out.println("El cilindre 1 té un volum més gran");
        } else {
            System.out.println("El cilindre 2 té un volum més gran");
        }

        Cylinder bigger = c1.getLarger(c2);
        System.out.println("Cilindre amb volum més gran: " + bigger);
    }
}