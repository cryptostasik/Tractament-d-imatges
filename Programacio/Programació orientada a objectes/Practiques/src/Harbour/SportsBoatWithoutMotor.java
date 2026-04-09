package Harbour;

public class SportsBoatWithoutMotor extends Boat {
	
	public SportsBoatWithoutMotor(String regPlate, double length, int year) {
		super(regPlate, length, year);
	}
	
	@Override
	public double amountAccordingToBoat() {
		return this.baseAmount();
	}
}
