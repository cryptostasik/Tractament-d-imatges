package Areas;

public abstract class Area {

    private String code;
    private double surfaceArea;
    private boolean naturalLight;
    protected double consumption;

    public Area() {
    }

    public Area(String code, double surfaceArea, boolean naturalLight, double consumption) {
        this.code = code;
        this.surfaceArea = surfaceArea;
        this.naturalLight = naturalLight;
        this.consumption = consumption;
    }
    
    public double consumptionM2() {
    	return this.consumption / this.surfaceArea;
    }
    
    public String getCode() {
        return code;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public boolean isNaturalLight() {
        return naturalLight;
    }

    public double getConsumption() {
        return consumption;
    }
}