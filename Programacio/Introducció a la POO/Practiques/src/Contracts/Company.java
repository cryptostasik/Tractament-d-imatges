package Contracts;

import java.util.Objects;

public class Company {
	
	private int cif;
	private String name;
	private String sector;
	
	public Company() {
		this.cif = 12345678;
		this.name = "Cola";
		this.sector = "Bisnes";
	}
	public Company(int cif) {
		this.cif = cif;
	}
	public Company(int cif,String name,String sector) {
		this.cif = cif;
		this.name = name.trim();
		this.sector = sector.trim();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (this.cif == other.getCif()) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(cif);
	}
	public int getCif() {
		return cif;
	}
}
