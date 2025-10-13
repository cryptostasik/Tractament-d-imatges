/*
 * exercici44.java 1.0 13/10/25
 *
 * A partir de la mida d'un cargol en centímetres, retorna la seva mida textual, segons la següent informació:
 * 
 * De 1 cm (inclòs) fins 3 cm (no inclòs) -> Petit
 * De 3 cm (inclòs) fins 5 cm (no inclòs) -> Mitjà
 * De 5 cm (inclòs) fins 6.5 cm (no inclòs) -> Gran
 * De 6.5 cm (inclòs) fins 8.5 cm (no inclòs) -> Molt gran
 */
import java.util.Scanner;

public class Program {
    /**
     * Determines the textual size category of a screw based on its length in centimeters.
     * 
     * @param size the length of the screw in centimeters
     * @return the textual size category ("Petit", "Mitjà", "Gran", "Molt gran", or "Mida no vàlida")
     */
     public static String screwSize(double size) {
        if (size >= 1 && size < 3) {
            return "Petit";
        } else if (size >= 3 && size < 5) {
            return "Mitjà";
        } else if (size >= 5 && size < 6.5) {
            return "Gran";
        } else if (size >= 6.5 && size < 8.5) {
            return "Molt gran";
        } else {
            return "Mida no vàlida";
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double size;

        System.out.println("Introduïu el cm de cargol: ");
        size = s.nextDouble();

        // Find the size
        String result = screwSize(size);
        
        System.out.printf("La mida del cargol de %.2f cm és: %s\n", size, result);

        s.close();
    }
}

