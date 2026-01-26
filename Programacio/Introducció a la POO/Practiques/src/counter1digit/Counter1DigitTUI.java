package counter1digit;

public class Counter1DigitTUI {
	public static void main(String[] args) {
		 Counter1Digit c = new Counter1Digit();

	     System.out.println(c);
	     
	     c.uppcounter();
	     System.out.println(c);
	     

	     c.resetCounter();
	     System.out.println(c); 

	     c.setCounter(123);
	     System.out.println(c);
	}
}
