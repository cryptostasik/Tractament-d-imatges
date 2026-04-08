package Shop;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(new HardDisk("dd1", "Disc Dur 1", 40, 135, 100));
        shop.addProduct(new Cpu("cpu1", "Processador 1", 35, 125, 2500));
        shop.addProduct(new HardDisk("dd2", "Disc Dur 2", 22, 135, 150));
        shop.addProduct(new HardDisk("dd3", "Disc Dur 3", 11, 180, 100));
        shop.addProduct(new Cpu("cpu2", "Processador 2", 10, 196, 2800));

        shop.listStock();
    }
}