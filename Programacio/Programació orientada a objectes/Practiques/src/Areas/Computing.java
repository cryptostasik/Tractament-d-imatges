package Areas;

public class Computing extends Classroom {

	private int nPrinters;
	
	public Computing(String code, double surfaceArea, boolean naturalLight, double consumption, int capacity) {
		super(code, surfaceArea, naturalLight, consumption, capacity);
	}

	public int getnPrinters() {
		return nPrinters;
	}

	public void setnPrinters(int nPrinters) {
		this.nPrinters = nPrinters;
	}
	
}
