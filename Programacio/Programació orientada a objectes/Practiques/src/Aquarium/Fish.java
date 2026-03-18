package Aquarium;

public class Fish extends Organism {

	private String origin;
	private char diet;
	private double length;

	public Fish(String name, String family, char light, double maxTemp, double minTemp, 
			double maxPH, double minPH) {
		super(name, family, light, maxTemp, minTemp, maxPH, minPH);
	}
	
	public String dietType() {
		return "" + this.diet;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public char getDiet() {
		return diet;
	}
	public void setDiet(char diet) {
		this.diet = diet;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
}
