package chronometer;
import java.util.Scanner;
public class ChronometerTUI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Chronometer chronometer = new Chronometer();
		boolean running = true;
		while (running) {
			System.out.println("1 - Start");
			System.out.println("2 - Stop");
			System.out.println("3 - Reset");
			System.out.println("4 - Show time");
			System.out.print("Choose option: ");
			int i = s.nextInt();
			switch (i) {
				case 1:
					chronometer.start();
					System.out.println("Started!");
					break;
				case 2:
					chronometer.stop();
					System.out.println("Stopped!");
					break;
				case 3:
					chronometer.reset();
					System.out.println("Reset!");
					break;
				case 4:
					System.out.println("Time: " + chronometer.getInterval());
					break;
			}
		}
	}
}
