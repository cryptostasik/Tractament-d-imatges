package Harbour;

public class SportsBoatWithMotor extends Boat {
	
	private int power;

	public SportsBoatWithMotor(String regPlate, double length, int year, int power) {
		super(regPlate, length, year);
		this.power = power;
	}
	
	@Override
	public double amountAccordingToBoat() {
		return this.power + this.baseAmount();
	}
}
