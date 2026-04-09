/*
 * exercici1.java 1.0 10/10/25
 *
 * Escriu "Hola món!" per pantalla un nombre de vegades determinat per l'usuari.
 * Copyright 2025 Kurylyuk Stanislav
 */
import java.util.Scanner;

public class Program {
    /**
     * Reads the number of times to print "Hola món!" from the user and prints it to the console.
     * 
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
		String count;
		
        Scanner s = new Scanner(System.in);
        
        // Prompt user to enter the number of times to print "Hola món!"
        System.out.print("Introduïu el nombre de vegades per imprimir 'Hola món!': ");
        count = s.nextLine();

        System.out.println(count + "!");
   

        s.close();
    }
}
