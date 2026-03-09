package Ferry;

import java.util.Objects;

public class Lorry {
	private String regNumber;
	private double weight;
	private int nAxles;
	
	public Lorry() {
		this.regNumber = "MAX1";
		this.weight  = 50.0;
		this.nAxles = 1;
	}
	public Lorry(String regNumber){
		this.regNumber = regNumber;
	}
	public Lorry(String regNumber,double weight,int nAxles) {
		this.regNumber = regNumber;
		this.weight = weight;
		this.nAxles = nAxles;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lorry other = (Lorry) obj;
		if (this.regNumber == null) return false;
		if (this.regNumber.equals(other.getRegNumber())){
			return true;
		} else {
			return false;
		}
	}
	public String getRegNumber() {
		return regNumber;
	}
	public double getWeight() {
		return weight;
	}
	public int getnAxles() {
		return nAxles;
	}
}
