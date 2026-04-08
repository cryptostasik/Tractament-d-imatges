package Shop;

public class HardDisk extends Product {
    private float capacity;

    public HardDisk(String code, String description, int units, float basePrice, float capacity) {
        super(code, description, units, basePrice);
        this.capacity = capacity;
    }

    @Override
    public float price() {
        return this.getBasePricepreuBase() * capacity * (float)0.9;
    }

    @Override
    public String toString() {
        return this.getCode() + "\t" + this.getDescription() + "\t" +
        	   this.getUnits() + "\t" + this.capacity + "GB\t\t" +
        	   this.getBasePricepreuBase() + "\t\t" +this.price();
    }
    
    public float getCapacity() { 
    	return capacity; 
    }
}