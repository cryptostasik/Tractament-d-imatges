package counter2Digits;

public class Counter2Digits {

    private Counter1Digit counterUnits;
    private Counter1Digit counterTens;

    public Counter2Digits() {
        this.counterUnits = new Counter1Digit();
        this.counterTens = new Counter1Digit();
    }
    
    public Counter2Digits( int tens, int units) {
    	this.counterTens = new Counter1Digit(tens);
    	this.counterUnits = new Counter1Digit(units);
    }
    public Counter2Digits( Counter1Digit tens,Counter1Digit units) {
    	this.counterTens = tens;
    	this.counterUnits = units;
    }
    
    public void increment() {
        int newUnits = this.counterUnits.increment();
        if (newUnits == 0) {
            this.counterTens.increment();
        }
    }
    
    public String toString() {
    	return "" + this.counterTens.getCounter() + this.counterUnits.getCounter();
    }
}