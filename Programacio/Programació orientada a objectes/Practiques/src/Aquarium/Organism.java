package Aquarium;

public abstract class Organism {
	private String name;
	private String family;
	private char light;
	private double maxTemp;
	private double minTemp;
	private double maxPH;
	private double minPH;
	
	public Organism(String name, String family, char light, double maxTemp, 
			double minTemp, double maxPH,double minPH) {
		super();
		this.name = name;
		this.family = family;
		this.light = light;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.maxPH = maxPH;
		this.minPH = minPH;
	}
	public String acidity() {
		return this.minPH + "-" + this.maxPH;
	}
	
	public String temperature() {
		return this.minTemp + "-" + this.maxTemp;
	}
	
	public String lightType() {
		return "" + this.light;
	}
	public String getName() {
		return name;
	}
	public String getFamily() {
		return family;
	}
	public char getLight() {
		return light;
	}
	public double getMaxTemp() {
		return maxTemp;
	}
	public double getMinTemp() {
		return minTemp;
	}
	public double getMaxPH() {
		return maxPH;
	}
	public double getMinPH() {
		return minPH;
	}
}
