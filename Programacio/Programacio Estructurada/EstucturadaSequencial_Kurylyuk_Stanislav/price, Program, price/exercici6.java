/*
 * Program.java 6.0 29/09/25
 * 
 * Calcula el preu final d'un producte, tenint en compte l'IVA (en %)i el descompte (en %) aplicats.
 * 
 * Copyrigt 2025 Kurylyuk Stanislav
 */

public class exercici6 {
	
	 /**
     * Calculates the final price of a product after applying a discount and VAT.
     *
     * @param a original price of the product
     * @param b  discount percentage to be applied 
     * @param c  VAT percentage to be applied
     * @return f  final price after applying the discount and VAT
     */
	
    public static double price(double a, double b, double c) {
        // Apply discount to the original price
        double price_discount = a * (1 - b / 100);
        // Apply VAT to the discounted price
        double f = price_discount * (1 + c / 100);
        return f;
    }

    public static void main(String[] args) {
        double a = 66.0;
        double b = 10.0; 
        double c = 21.0; 
        double f = exercici6.price(a, b, c);
        System.out.print("Price :" + f);
    }
}

