package Alarm;

import java.time.LocalDateTime;

public class Alarm {

	private LocalDateTime alarmTime;
	public Alarm(LocalDateTime alarmTime) {
		this.alarmTime = alarmTime;
	}

    // Returns the number of seconds remaining (or -1 if already elapsed)
	public long secondsLeft() {
		if (alarmTime == null) {
			return -1;
		}
		LocalDateTime now = LocalDateTime.now();
		
		if (!now.isBefore(alarmTime)) {
			return -1;
		}
		return JodaDT.durationInSeconds(now, alarmTime);
	}
	
	// Just a string to output (hh:mm:ss)
	public String getTimeLeftFormatted() {
		long seconds,h,m,s;
		seconds = secondsLeft();
		
		h = seconds / 3600;
		m = (seconds % 3600) / 60;
		s = seconds % 60;

		return String.format("%02d:%02d:%02d", h, m, s);
	}
	// Time ring!
	public boolean shouldRing() {
		return secondsLeft() <= 0;
	}
}