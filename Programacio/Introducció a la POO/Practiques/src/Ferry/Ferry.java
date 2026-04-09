package Ferry;

import java.util.ArrayList;
import java.util.Objects;

public class Ferry {
	private String regNumber;
	private String name;
	private String harbourName;
	private double pricePerAxle;
	private double pricePerTon;
	double maxWeight;
	private ArrayList<Lorry> boardedLorries;
	
	public Ferry() {
		this.regNumber = "12";
		this.name = "Titanic";
		this.harbourName = "Gogol";
		this.pricePerAxle = 20.0;
		this.pricePerTon = 10.0;
		this.maxWeight = 100.0;
		this.boardedLorries = new ArrayList<Lorry>();
	}
	
	public Ferry(String regNumber) {
		this.regNumber = regNumber.trim();
		this.boardedLorries = new ArrayList<Lorry>();
	}
	public Ferry(String regNumber,String name,String harbourName,double pricePerAxle,
			double pricePerTon,double maxWeight) {
		this.regNumber = regNumber.trim();
		this.name = name;
		this.harbourName = name;
		this.pricePerAxle = pricePerAxle;
		this.pricePerTon = pricePerTon;
		this.maxWeight = maxWeight;
		this.boardedLorries = new ArrayList<Lorry>();
	}
	
	public double totalWeight() {
		double total = 0;
		for(Lorry lorry : this.boardedLorries) {
			total += lorry.getWeight();
		}
		
		//for(int i = 0;i < this.boardedLorries.size();i++) {
		//	total = total + this.boardedLorries.get(i);
		//}
		
		return total;
	}
	
	public boolean isBoarded(Lorry lorry) {
		return this.boardedLorries.contains(lorry);
	}
	
	public boolean canBoard(Lorry lorry) {
        return (this.totalWeight() + lorry.getWeight()) < maxWeight;
    }
	
	public boolean board(Lorry lorry) {
		if (this.canBoard(lorry)) {
			 return this.boardedLorries.add(lorry);
		}
		return false;
	}
	
	public Lorry lorryInPosition(int n) {
		return this.boardedLorries.get(n);
	}
	
	public double tollPrice(Lorry lorry) {
		return (lorry.getWeight() * this.pricePerTon) + (lorry.getnAxles() * pricePerAxle);
	}
	
	public double collectedTolls() {
		double total = 0.0;
		for (Lorry lorry : this.boardedLorries) {
			total += this.tollPrice(lorry);
		}
        return total;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ferry other = (Ferry) obj;
		if (this.regNumber == null) return false;
		if (this.regNumber.equals(other.getRegNumber())){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return 1;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public ArrayList<Lorry> getBoardedLorries() {
		return boardedLorries;
	}
	
}
