package Harbour;

public class LuxuryYacht extends SportsBoatWithMotor {
	
	private int nCabins;

	public LuxuryYacht(String regPlate, double length, int year, int power, int nCabins) {
		super(regPlate, length, year, power);
		this.nCabins = nCabins;
	}
	
	@Override
	public double amountAccordingToBoat() {
		// return this.nCabins +  this.baseAmount() + this.power;
		return super.amountAccordingToBoat() + this.nCabins;
	}
}
