package Areas;

public class Classroom extends Area {
	private int capacity;
	private boolean chairTable;
	private int nComputers;
	private boolean networkConn;
	
	public Classroom(String code, double surfaceArea, boolean naturalLight, double consumption,
            int capacity) {
	super(code, surfaceArea, naturalLight, consumption);
	this.capacity = capacity;
	}

	public double surfaceAreaStudent(){
	    return this.getSurfaceArea() / this.capacity;
	}

	public boolean isChairTable() {
		return chairTable;
	}

	public void setChairTable(boolean chairTable) {
		this.chairTable = chairTable;
	}
	
	public boolean isNetworkConn() {
		return networkConn;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getnComputers() {
		return nComputers;
	}

	public void setnComputers(int nComputers) {
		this.nComputers = nComputers;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
