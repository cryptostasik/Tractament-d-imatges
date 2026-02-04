package counter2Digits;

public class Counter2DigitsTUI {

	public static void main(String[] args) {
		 Counter2Digits c = new Counter2Digits();
		 
		 Counter1Digit u1 = new Counter1Digit(1);
		 Counter1Digit u2 = new Counter1Digit(2);
		 Counter2Digits c1 = new Counter2Digits();
		 Counter2Digits c2 = new Counter2Digits(1,2);
		 Counter2Digits c3 = new Counter2Digits(u1,u2);
		 
		 System.out.println("c1 =" + c1.toString());
		 System.out.println("c2 =" + c2.toString());
		 System.out.println("c3 =" + c3.toString());
		 
		 for (int i = 0; i <= 100;i++) {
			 System.out.println("" + c.toString());
			 c.increment();
		 }
	}
}
