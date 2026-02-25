package Contracts;

import java.time.LocalDateTime;
import java.util.Objects;

public class Contract {
	private int code;
	private String initialDate;
	private String endDate;
	private Company company;
	
	public Contract() {
		this.code = 123;
		this.initialDate = "25/02/2026";
		this.endDate = null;
	}
	public Contract(int code) {
		this.code = 123;
	}
	public Contract (int code,String initialDate,String endDate,Company company) {
		this.code = code;
		this.initialDate = initialDate;
		this.endDate = endDate;
	}
	public int duration() {
		int days;
		LocalDateTime dtEnd = null;
		LocalDateTime dtInit = JodaDT.parseDDMMYYYY(this.initialDate);
		if(this.endDate == null) {
			dtEnd = LocalDateTime.now();
		} else {
			dtEnd = JodaDT.parseDDMMYYYY(this.endDate);
		}
		days = (int)JodaDT.durationInSeconds(dtInit, dtEnd);
		days = days / 60 / 60 / 24; //Dies
		return days;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contract other = (Contract) obj;
		if (this.code == other.getCode()) {
			return true;
		} else {
			return false;
		}
	}
	public int getCode() {
		return this.code;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
