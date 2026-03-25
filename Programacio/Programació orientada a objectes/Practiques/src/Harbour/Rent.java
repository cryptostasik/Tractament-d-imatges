package Harbour;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rent {
	
	private String dni;
	private String name;
	private String iniDate;
	private String endDate;
	private String wharfageCode;
	
	private static final double FIXED_VALUE = 2;
	private Boat boat;
	
	public Rent(String dni, String name, String iniDate, String endDate, String wharfageCode) {
		super();
		this.dni = dni;
		this.name = name;
		this.iniDate = iniDate;
		this.endDate = endDate;
		this.wharfageCode = wharfageCode;
	}
	
	public void setBoat(Boat boat) {
		this.boat = boat;
	}

	public String getDni() {
		return dni;
	}
	public String getName() {
		return name;
	}
	public String getIniDate() {
		return iniDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public String getWharfageCode() {
		return wharfageCode;
	}
	public Boat getBoat() {
		return boat;
	}
	
	public long days() {
		LocalDateTime iniDateT = JodaDT.parseDDMMYYYY(this.iniDate);
		LocalDateTime endDateT = JodaDT.parseDDMMYYYY(this.endDate);
		return JodaDT.durationInSeconds(iniDateT, endDateT) / 3600 / 24;
	}
	
	public double amount() {
		return this.days() * Rent.FIXED_VALUE * this.boat.amountAccordingToBoat();
	}
	
	public double amountPerDays() {
		return this.amount() / this.days();
	}
}
