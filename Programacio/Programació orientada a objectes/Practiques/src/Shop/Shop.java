package Shop;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> stock;

    public Shop() {
        stock = new ArrayList<>();
    }

    public boolean addProduct(Product p) {
        return stock.add(p);
    }

    public boolean removeProduct(Product p) {
        return stock.remove(p);
    }
    
    
    public void listStock() {
    	System.out.println("CODE\tDESCRIPTION\tUNITS\tSPEC\t\tBASE PRICE\tPRICE");
        int HD = 0;
        int CPU = 0;
        float total = 0;

        for (Product p : stock) {
            System.out.println(p);
            total += p.price();
            if (p instanceof HardDisk)
                HD += p.getUnits();
            else if (p instanceof Cpu)
                CPU += p.getUnits();
        }

        System.out.println("Nombre total de discs durs en estoc: " + HD);
        System.out.println("Nombre total de CPUs en estoc: " + CPU);
        System.out.println("Valor total de l'estoc: " + total);
    }

    public float stockValue() {
        float total = 0;
        for (Product p : stock) {
            total += p.getUnits() * p.price();
        }
        return total;
    }

}