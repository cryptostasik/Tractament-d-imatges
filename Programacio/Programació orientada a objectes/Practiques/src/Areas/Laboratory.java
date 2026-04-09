package Areas;

public class Laboratory extends Classroom {
	private int nBunsen;
	
	public Laboratory(String code, double surfaceArea, boolean naturalLight, double consumption, int capacity) {
		super(code, surfaceArea, naturalLight, consumption, capacity);	
	}

	public int getnBunsen() {
		return nBunsen;
	}

	public void setnBunsen(int nBunsen) {
		this.nBunsen = nBunsen;
	}
}
