package surgery;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Surgery {

	private String doctorName;
	private String speciality;
	private HashSet<Visit> visits;
	
	
	public Surgery(String doctorName,String speciality) {
		this.doctorName = doctorName;
		this.speciality = speciality;
	}
	public boolean isProgrammable(Visit visit) {
		return !visits.contains(visit);
	}
	public boolean program(Visit visit) {
	    if(isProgrammable(visit)) {
	    	return visits.add(visit);
	    }
	    return false;
	}
	public int 
}
