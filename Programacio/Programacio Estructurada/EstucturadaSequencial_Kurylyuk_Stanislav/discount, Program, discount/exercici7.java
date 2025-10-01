/*
 * exercici7.java 1.0 30/09/25
 *
 * Calcula el percentatge descomptat en una compra a partir
del preu de la tarifa i del preu pagat (suposarem que no s'aplica IVA).
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

public class exercici7 {
    /**
     * Calculates the final price of a product after applying a discount.
     *
     * @param a the original price of the product
     * @param b the discount percentage to be applied
     * @return f the price after applying the discount
     */
    public static double price(double a, double b) {
        // Calculate the price after applying the discount
        double f = a * (1 - b / 100);
        return f;
    }
    public static void main(String[] args) {
        double a = 130.0; 
        double b = 10.0; 
        exercici7 p = new exercici7();
        double f = p.price(a, b);
        System.out.println("Price: " + f);
    }
}
