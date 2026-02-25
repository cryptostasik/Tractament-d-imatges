package chronometer;

import java.time.LocalDateTime;

public class Chronometer {
	// start time
	private LocalDateTime t1;
    // final time 
	private LocalDateTime t2;
	
    public void start() {
    	this.t1 = LocalDateTime.now();
    	this.t2 = null;
    }

    public void stop() {
    	this.t2 = LocalDateTime.now();
    }

    public void reset() {
    	this.t1 = null;
    	this.t2 = null;

    }
    // return time in format hh:mm:ss 
    public String getInterval() {
    	long hours,minutes,seconds,totalSeconds;
    	
    	if (this.t1 == null || this.t2 == null) {
    		return "";
    	}
    	
    	totalSeconds = JodaDT.durationInSeconds(this.t1, this.t2);
    	
    	if (totalSeconds < 0) {
    		totalSeconds = 0;
    	}

    	hours   = totalSeconds / 3600;
    	minutes = (totalSeconds % 3600) / 60;
    	seconds = totalSeconds % 60;

    	return hours + ":" + minutes + ":" + seconds;
    }
}