package Alarm;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Alarm_TUI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introdueix l'hora de l'alarma (dd/MM/yyyy-HH:mm): ");
		String time = sc.nextLine().trim();
		
		LocalDateTime alarmTime = JodaDT.parseDDMMYYYYhhmm(time);
		System.out.println("L'alarma està configurada per a: " + JodaDT.formatDDMMYYYYhhmm(alarmTime));
		System.out.println("Comencem el compte enrere...\n");
		
		while (true) {
			long secondsLeft,h,m,s;
			LocalDateTime now = LocalDateTime.now();
			
			secondsLeft = JodaDT.durationInSeconds(now, alarmTime);
            
			if (secondsLeft <= 0) {
				System.out.println("RING ! RING ! RING !");
				break;
			}
			h = secondsLeft / 3600;
			m = (secondsLeft % 3600) / 60;
			s = secondsLeft % 60;
			
            System.out.printf("Queda: %02d:%02d:%02d\n", h, m, s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}