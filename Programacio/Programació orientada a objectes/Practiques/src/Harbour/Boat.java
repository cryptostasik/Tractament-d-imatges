package Harbour;

public abstract class Boat {
	private String regPlate;
	private double length;
	private int year;
	
	public Boat(String regPlate, double length, int year) {
		super();
		this.regPlate = regPlate;
		this.length = length;
		this.year = year;
	}
	
	public String getRegPlate() {
		return regPlate;
	}
	public double getLength() {
		return length;
	}
	public int getYear() {
		return year;
	}
	
	public abstract double amountAccordingToBoat();
	
	public double baseAmount()	{
		return this.length * 10;
	}
	
}
