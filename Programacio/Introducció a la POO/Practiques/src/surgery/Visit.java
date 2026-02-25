package surgery;

import java.util.Objects;

public class Visit {

	private String visitDataTime;
	private String patientName;
	
	
	public Visit()  {
		this.visitDataTime = "12/04/2009-17:30";
		this.patientName = "Joan Camps";
	}
	
	public Visit(String visitDateTime) {
		this.visitDataTime = visitDateTime.trim();
	}
	
	public Visit(String visitDateTime,String patientName) {
		this.visitDataTime = visitDateTime.trim();
		this.patientName = patientName.trim();
	}
	
	
	
	public String getVisitDataTime() {
		return visitDataTime;
	}

	public void setVisitDataTime(String visitDataTime) {
		this.visitDataTime = visitDataTime;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(visitDataTime); //1
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Visit other = (Visit) obj;
		if (this.visitDataTime == null) return false;
		if (this.visitDataTime == null) {
		    return other.getVisitDataTime() == null;
		}
		return this.visitDataTime.equals(other.getVisitDataTime());
	}
}
