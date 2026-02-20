package Alarm;

import java.time.LocalDateTime;

public class Alarm {
	/* Current datetime  */
	private LocalDateTime now;
	/* Alarm´s datetime  */
	private LocalDateTime alarm;
	
	public Alarm() {
		this.now = LocalDateTime.now()
		this.alarm = this.now.minusDays(2);
	}
}
