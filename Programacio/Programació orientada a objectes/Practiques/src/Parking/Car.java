package Parking;

public class Car extends Vehicle {
	private int nSeats;

	public Car(String regPlate, int power, int nSeats) {
		super(regPlate, power);
		this.nSeats = nSeats;
	}
	
	@Override
	public double calculateFee() {
		return this.nSeats * this.getPower();
	}
}
