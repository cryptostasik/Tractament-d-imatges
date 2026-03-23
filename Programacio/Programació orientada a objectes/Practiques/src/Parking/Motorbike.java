package Parking;

public class Motorbike extends Vehicle {
	
	public Motorbike(String regPlate, int power) {
		super(regPlate, power);
	}
	@Override
	public double calculateFee() {
		return this.getPower() * 2;
	}
}
