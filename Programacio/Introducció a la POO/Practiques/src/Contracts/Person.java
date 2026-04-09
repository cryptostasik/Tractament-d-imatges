package Contracts;

import java.time.LocalDateTime;
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
		this.contracts = new HashSet<Contract>();
	}
	public Person (int dni,String name) {
		this.dni = dni;
		this.name = name.trim();
		this.contracts = new HashSet<Contract>();
	}
	public int workedTime() {
        int count = 0;
        for (Contract contract : this.contracts) {
            count += contract.duration(); // duration transform for int
        }
        return count;
    }
	public int nCompanies() {
        HashSet<Company> companies = new HashSet<Company>();
        for (Contract contract : this.contracts) {
            companies.add(contract.getCompany());
        }
        return companies.size(); // return int size for have many componies
    }
	
	public boolean signContract(Contract contract) {
	    LocalDateTime contractInitialDate = JodaDT.parseDDMMYYYY(contract.getInitialDate());
	    LocalDateTime contractEndDate     = JodaDT.parseDDMMYYYY(contract.getEndDate());

	    for (Contract SignContract : this.contracts) {
	        LocalDateTime initialDateSignedContract = JodaDT.parseDDMMYYYY(SignContract.getInitialDate());
	        LocalDateTime endDateSignedContract     = JodaDT.parseDDMMYYYY(SignContract.getEndDate());

	        boolean sameCompany = contract.getCompany().equals(SignContract.getCompany());

	        boolean sameInitialDate = contractInitialDate.isBefore(endDateSignedContract);

	        boolean contractInsideCurrrent = initialDateSignedContract.isBefore(contractEndDate);

	        boolean currentInsideContract = false;

	        boolean cantSing = sameCompany && (sameInitialDate || contractInsideCurrrent);

	        if (cantSing) {
	            return false;
	        }
	    }
	    this.contracts.add(contract);
	    return true;
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

 