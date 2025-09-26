// Calcula el preu final d'un producte, tenint en compte l'IVA (en %) i el descompte (en %) aplicats.

    /**
     * Adds two reals numbers.
     * 
     * @param p reals number to de added:
     * @param Iva
     * @return the 
     */
public class Program5 {
    // Calculate final price with discount and VAT
    public static double price(double a, double b, double c) {
        // Apply discount
        double price_discount = a * (1 - b / 100);
        // Apply VAT
        double f = price_discount * (1 + c / 100);
        return f;
    }

    public static void main(String[] args) {
        double a = 130.0; 
        double b = 10.0; 
        double c = 21.0; 
        double f = Program5.price(a, b, c);
        System.out.print("Price" + f);
    }
}

