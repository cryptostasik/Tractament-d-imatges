/*
 * Harbour  25/03/2026
 * 
 * Copyright 2026 Kurylyuk Stanislav <a253022sk@correu.escoladeltreball.org>
 *
 */
package Harbour;

public class Main {
    public static void main(String[] args) {
        Harbour harbour = new Harbour("Barcelona", "Spain");

        Boat sail = new SallBoat("ABC123", 12.5, 2018, 2);
        Boat yacht = new LuxuryYacht("LUX001", 25.0, 2022, 450, 5);


        Rent r1 = new Rent("12345678A", "Joan Garcia", "01/03/2026", "10/03/2026", "W01");
        Rent r2 = new Rent("87654321B", "Maria Lopez", "05/03/2026", "15/03/2026", "W02");

        r1.setBoat(sail);
        r2.setBoat(yacht);

        harbour.add(r1);
        harbour.add(r2);

        System.out.println(harbour);
        harbour.reportRents("report.txt");

        System.out.printf("Total import març 2026: %.2f €%n", 
                          harbour.calculateAmountMonth(3, 2026));
    }
}