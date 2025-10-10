/*
 * exercici9.java 1.0 29/09/25
 *
 * A partir d'una temperatura en graus
Celsius, calcula el valor equivalent en graus Fahrenheit. L'escala Celsius assigna al punt de
fusió del gel el valor 0 i al punt d'ebullició de l'aigua el valor 100, mentre que l'escala
Fahrenheit assigna a aquest punts els valors 32 i 212. D'aquí es dedueix la fórmula:
 *
 * Copyright 2025 Kurylyuk Stanislav
 */

public class Program { 
    /**
     * Converts a temperature from Celsius to Fahrenheit.
     *
     * @param a the temperature in Celsius
     * @return b the temperature in Fahrenheit
     */
    public static double celsius2fahrenheit(double a) {
		// Convert Celsius to Fahrenheit using the formula (C * 9/5) + 32
        double b = (a*9/5)+32;
        return b;
    }

    public static void main(String[] args) {
        double a = 23.5; 
        Program p = new Program();
        double b = p.celsius2fahrenheit(a);
        System.out.println("Fahrenheit: " + b);
    }
}

