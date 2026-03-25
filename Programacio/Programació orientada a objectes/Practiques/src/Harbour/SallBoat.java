package Harbour;

public class SallBoat extends SportsBoatWithoutMotor {
	private int nMasts;

	public SallBoat(String regPlate, double length, int year, int nMasts) {
		super(regPlate, length, year);
		this.nMasts = nMasts;
	}
	
	public double amountAccordingToBoat() {
		return super.amountAccordingToBoat() + this.nMasts;
	}
}
