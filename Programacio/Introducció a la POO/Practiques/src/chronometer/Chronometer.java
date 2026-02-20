package chronometer;

import java.time.LocalDateTime;

public class Chronometer {

	/*start time */
    private LocalDateTime t1;
    /*final time */
    private LocalDateTime t2;

    /*Start chronometer */
    public void start() {
    	this.t1 = LocalDateTime.now();
    }
    /*Stop chronometer */
    public void stop() {
    	this.t2 = LocalDateTime.now();
    }
    /*Restart chronometer */
    public void reset() {
    	this.t1 = LocalDateTime.now();
    	this.t2 = null;
    	
    }
    /* return time in format hh:mm:ss*/
    public String getInterval() {
        if (this.t1 != null && this.t2 != null) {
        	long seconds = JodaDT.durationInSeconds(this.t1, this.t2);
        	long hours = (seconds % 3600) / 60;
        	seconds = seconds - (hours * 3600);
        	long minutes = seconds / 60;
        	seconds = seconds - (minutes * 3600);
        	 return hours + ":" + minutes + ":" + seconds;
        } 
        return "";
    }
}