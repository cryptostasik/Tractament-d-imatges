/*
 * exercici24.java 1.0 06/10/25
 *
 * A partir de dos nombres reals, calcula la seva suma, resta, producte i quocient.
 *
 * Copyright 2025 Kurylyuk Stanislav
 */
public class exercici24 {
    /**
     * Divide two numbers.
     * @param a first number
     * @param b second number
     * @return result of a / b
     */
	public double dividir(double a, double b) {
		return a / b;
	}
	  /**
     * Sum two numbers.
     * @param a first number
     * @param b second number
     * @return result of a + b
     */
	public double sumar (double a, double b) {
		return a + b;
	}
	 /**
     * Subtract two numbers.
     * @param a first number
     * @param b second number
     * @return result of a - b
     */
	public double restar(double a, double b) {
		return a - b;
	}
	  /**
     * Multiply two numbers.
     * @param a first number
     * @param b second number
     * @return result of a * b
     */
	public double multiplicar(double a, double b) {     
		return a * b;
	}

    public static void main(String[] args) {
		exercici24 p = new exercici24();
        double sumar, multiplicar, restar, dividir;
        sumar = p.sumar(1.0,2.0);
        multiplicar = p.multiplicar(1.0,2.0);
        restar = p.restar(1.0,2.0);
        dividir = p.dividir(1.0,2.0);
        System.out.println("Suma = " + sumar + " " + "Resta = " + restar + " " + "Multiplicacio = " + multiplicar + " " + "Dividir = " + dividir);
    }
}
