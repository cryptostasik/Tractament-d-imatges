package counter1digit;

public class Counter1DigitTUI {

    public static void main(String[] args) {

        Counter1Digit digit = new Counter1Digit();

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.println(digit);
            digit.uppcounter();
        }
        System.out.println(digit);
    }
}