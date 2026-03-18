package Aquarium;

public class Plant extends Organism {
	
	private char type;

	
	
	public Plant(String name, String family, char light, double maxTemp, double minTemp, 
			double maxPH, double minPH) {
		super(name, family, light, maxTemp, minTemp, maxPH, minPH);
	}
	
	public String plantType() {
		return "" + this.type;
	}
	
	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
}
