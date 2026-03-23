package Parking;


public abstract class Vehicle {
    private String regPlate;
    private int power;

    public Vehicle(String regPlate, int power) {
        this.regPlate = regPlate;
        this.power = power;
    }
    
    public abstract double calculateFee();
    
    public String getRegPlate() {
        return regPlate;
    }

	public int getPower() {
		return power;
	}
}
