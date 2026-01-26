package counter1digit;

public class Counter1Digit {
	private int counter;
	
	public Counter1Digit() {
        this.counter = 0;
    }
	
	public double getCounter() {
        return this.counter;
    }
	
	
	public void uppcounter() {
		if (this.counter < 9) {
			this.counter;
		} else {
			this.resetCounter();
		}

	}
	public void resetCounter() {
		this.counter = 0;
	}
	
	public void setCounter(int i) {
		if (i >= 10 || i < 0) {
			this.counter = i;
		} else {
			this.counter = 0;
		}
	}
	
	public String toString() {
		return "Digit: " + counter;
    }
}
