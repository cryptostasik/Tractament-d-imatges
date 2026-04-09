package counter1digit;

public class Counter1Digit {
    
    private int counter;
    
    public Counter1Digit() {
        this.counter = 0;
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
    
    @Override
    public String toString() {
        return "Digit: " + counter;
    }
}