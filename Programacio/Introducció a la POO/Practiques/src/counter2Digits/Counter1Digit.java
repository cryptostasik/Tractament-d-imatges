package counter2Digits;

public class Counter1Digit {
	
    private int counter;
    
    public Counter1Digit() {
        this.counter = 0;
    }
    
    public Counter1Digit(int counter) {
    	if (counter >= 10 || counter < 0) {
            this.counter = 0;
        } else {
            this.counter = counter;
        }
    }
    
    public int getCounter() {
        return this.counter;
    }
    
    public void resetCounter() {
        this.counter = 0;
    }
    
    public void uppcounter() {
        this.counter++;
        if (this.counter > 9) {
            this.resetCounter();
        }
    }
    
    public void setCounter(int value) {
        if (value >= 0 && value <= 9) {
            this.counter = value;
        } else {
            this.counter = 0;
        }
    }
    
    public int increment() {
        this.counter++;
        if (this.counter > 9) {
            this.counter = 0;
            return this.counter; 
        }
        return this.counter;
    }
    
    @Override
    public String toString() {
        return "Digit: " + counter;
    }
}