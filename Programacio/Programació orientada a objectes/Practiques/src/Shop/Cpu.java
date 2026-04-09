package Shop;

public class Cpu extends Product {
    private float speed;

    public Cpu(String code, String description, int units, float basePrice, float speed) {
        super(code, description, units, basePrice);
        this.speed = speed;
    }

    @Override
    public float price() {
        return this.getBasePricepreuBase() * this.speed;
    }

    @Override
    public String toString() {
        return this.getCode() + "\t" + this.getDescription() + "\t" +
        	   this.getUnits() + "\t" + this.speed + "MHz\t" +
        	   this.getBasePricepreuBase() + "\t\t" +this.price();
    }

    public float getSpeed() { 
        return speed; 
    }
}