package clock;

import java.time.LocalDateTime;

public class Clock {
	
	public Clock() {
	}
	/*
	 * Obte i mostra la data i hora del sistema. 
	 * return : dd/MM/aaaa-hh:mm:ss
	*/
	public String getDataTime() {
		LocalDateTime ara = LocalDateTime.now();
		String araS = JodaDT.formatDDMMYYYY(ara);
		return araS;
	}
}