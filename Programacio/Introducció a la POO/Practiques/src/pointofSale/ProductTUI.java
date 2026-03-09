package pointofSale;

import java.util.Scanner;

public class ProductTUI {

    public static void main(String[] args) {
    	int opcio;
        Scanner sc = new Scanner(System.in);
        Catalog catalog = new Catalog("Botiga");
        Sale sale = new Sale(1, "2026-03-09");
        
        do {
            System.out.println("\n1.Afegir producte  2.Cercar producte  3.Nombre productes");
            System.out.println("4.Afegir linia venda  5.Import total  0.Sortir");
            System.out.print("Opcio: ");
            opcio = sc.nextInt();

            switch (opcio) {

                case 1:
                    System.out.print("EAN: ");
                    int ean = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Descripcio: ");
                    String desc = sc.nextLine();
                    System.out.print("Marca: ");
                    String brand = sc.nextLine();
                    System.out.print("Preu: ");
                    double price = sc.nextDouble();

                    if (catalog.add(new Product(ean, desc, brand, price)))
                        System.out.println("Producte afegit");
                    else
                        System.out.println("Ja existeix");
                    break;

                case 2:
                    System.out.print("EAN: ");
                    if (catalog.search(sc.nextInt()) != null)
                        System.out.println("Producte trobat");
                    else
                        System.out.println("No trobat");
                    break;

                case 3:
                    System.out.println("Total productes: " + catalog.productsNumber());
                    break;

                case 4:
                    System.out.print("EAN producte: ");
                    Product prod = catalog.search(sc.nextInt());
                    
                    System.out.print("Quantitat: ");
                    if (sale.add(new SaleLine(sc.nextInt(), prod)))
                        System.out.println("Linia afegida");
                    break;

                case 5:
                    System.out.println("Import total: " + sale.totalAmount());
                    break;
            }
        } while (opcio != 0);
    }
}