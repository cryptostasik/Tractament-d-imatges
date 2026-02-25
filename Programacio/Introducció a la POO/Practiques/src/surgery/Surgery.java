package surgery;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;


public class Surgery {

	private String doctorName;
	private String speciality;
	private HashSet<Visit> visits;
	
	public Surgery() {
		this.doctorName = "Rosa Pi";
		this.speciality = "Cardiologia";
		this.visits = new HashSet<Visit>();
	}
	
	public Surgery(String doctorName,String speciality) {
		this.doctorName = doctorName;
		this.speciality = speciality;
	}
	
	public boolean isProgrammable(Visit visit) {
		return !this.visits.contains(visit);
	}
	
	public boolean program(Visit visit) {
	    if(isProgrammable(visit)) {
	    	this.visits.add(visit);
	    }
	    return false;
	}
	public int countVisits() {
		return this.visits.size();
	}
	public int countVisits(String date1, String date2) {
		int count = 0;
		LocalDateTime dt1 = JodaDT.parseDDMMYYYYhhmm(date1);
		LocalDateTime dt2 = JodaDT.parseDDMMYYYYhhmm(date2);
		for (Visit visit : this.visits) {
			String HoraVista = visit.getVisitDataTime();
			LocalDateTime HoraVistasLocalDateTime = JodaDT.parseDDMMYYYYhhmm(HoraVista);
			if (JodaDT.isInInterval(HoraVistasLocalDateTime, dt1,dt2)) {
				count++;
			};
		}
		return count;
	}
	public boolean cancel(Visit visit) {
        return this.visits.remove(visit);
    }
	public void cancelAll() {
        this.visits.clear();
    }

	@Override
	public int hashCode() {
		return Objects.hash(doctorName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Surgery other = (Surgery) obj;
		if(this.doctorName == null) return false;
		if(this.doctorName.equals(other.getDoctorName())) {
			return true;
		} else {
			return false;
		}
	}

	public String getDoctorName() {
		return doctorName;
	}
}
