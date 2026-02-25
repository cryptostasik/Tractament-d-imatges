package Contracts;

import java.util.HashSet;
import java.util.Objects;

import surgery.Visit;

public class Person {
	private int dni;
	private String name;
	private HashSet<Contract> contracts;
	
	public Person() {
		this.dni = 12345678;
		this.name = "Stas";
		this.contracts = new HashSet<Contract>();
	}
	public Person(int dni) {
		this.dni = 12345678;
	}
	public Person (int dni,String name) {
		this.dni = dni;
		this.name = name.trim();
	}
	public int workedTime() {
		int totalworkdays = 0;
		for (Contract c : this.contract) {
			totalworkdays += c.duration();
		}
	}
	public int nCompanies() {
		int nCompanies = 0;
		
	}
	public boolean singContact(Contract contract) {
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (this.dni == other.dni) {
			return true;
		} else  {
			return false;
		}
	}
}

 