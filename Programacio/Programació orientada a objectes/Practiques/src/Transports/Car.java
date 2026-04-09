package Transports;

public class Car extends Transport{
	private String fuelType;
	private double IterPrice;
	private double ItersKm;
	
	public Car(String identificador, double speed) {
		super(identificador, speed);
	}

	public Car(String identificador, double speed, String fuelType, double iterPrice, double itersKm) {
		super(identificador, speed);
		this.fuelType = fuelType;
		IterPrice = iterPrice;
		ItersKm = itersKm;
	}

	public double cost(double distance) {
		return distance * IterPrice * ItersKm;
	}

	public double getIterPrice() {
		return IterPrice;
	}

	public double getItersKm() {
		return ItersKm;
	}

	public String getFuelType() {
		return fuelType;
	}
}
