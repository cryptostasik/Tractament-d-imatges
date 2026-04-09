/*
 * Clock.java 1.0 13/2/2026
 *
 * Copyright 2026 Kurylyuk Stanislav
 */
package clock;

public class ClockTUI {

    public static void main(String[] args) {
    	
    	Clock t = new Clock();
    	Clock t2 = new Clock();
        
    	System.out.println(t.getDataTime());
        
    	for (int i = 0;i < 5000;i++) {
    		for (int j = 0;j < 5000;j++) {
    			for (int z = 0; z < 300; z++) {}
    		}
    	}
    	
    	System.out.println(t2.getDataTime());
    }
}