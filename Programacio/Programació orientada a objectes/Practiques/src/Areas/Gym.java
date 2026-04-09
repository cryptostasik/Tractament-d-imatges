package Areas;

public class Gym extends Classroom {
	
	private boolean showers;
	private int nStands;
	
	public Gym(String code, double surfaceArea, boolean naturalLight, double consumption, int capacity) {
		super(code, surfaceArea, naturalLight, consumption, capacity);
	}

	@Override
	public double surfaceAreaStudent(){
	    return this.getSurfaceArea() + this.getnStands() / this.getCapacity();
	}
	
	public boolean isShowers() {
		return showers;
	}

	public void setShowers(boolean showers) {
		this.showers = showers;
	}

	public int getnStands() {
		return nStands;
	}

	public void setnStands(int nStands) {
		this.nStands = nStands;
	}
}
