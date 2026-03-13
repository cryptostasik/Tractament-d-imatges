package Transports;

public class Bicycle extends Transport{
	private int nGears;
	
	public Bicycle(String identificador, double speed) {
		super(identificador, speed);
	}

	public Bicycle(String identificador, double speed, int nGears) {
		super(identificador, speed);
		this.nGears = nGears;
	}




	public double cost(double distance) {
		return distance * speed * nGears;
	}
	
}
