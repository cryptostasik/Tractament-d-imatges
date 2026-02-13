package chronometer;

import java.time.LocalDateTime;

public class Chronometer {
	private LocalDateTime t1;
	private LocalDateTime t2;
	private boolean running;
	
	public Chronometer() {
		this.t1 = LocalDateTime.now();
		this.t2 = LocalDateTime.now(); 
		boolean running = false;
	}
	
	public void start() {
		this.t1 = LocalDateTime.now();
		this.running = true;
	}
	
	public void reset() {
		this.t1 = LocalDateTime.now();
		this.t2 = LocalDateTime.now(); 
		boolean running = false;
	}
	
	public void stop() {
		if (running) {
			this.t2 = LocalDateTime.now();
			this.running = false;
		}
	}
	
	public long getSeconds() {
        LocalDateTime end = running ? LocalDateTime.now() : t2;
        return java.time.temporal.ChronoUnit.SECONDS.between(t1, end);
    }
}











/*
package chronometer;

public class Chronometer {

    private long startTime = 0;      // коли почався поточний відлік
    private long elapsedTime = 0;    // загальний пройдений час (у мілісекундах)
    private boolean isRunning = false;

    // Конструктор
    public Chronometer() {
        // все вже ініціалізовано вище
    }

    // ── ФУНКЦІЇ ЗАВДАННЯ ──

    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
        }
    }

    public void stop() {
        if (isRunning) {
            elapsedTime += System.currentTimeMillis() - startTime;
            isRunning = false;
        }
    }

    public void reset() {
        stop();           // спочатку зупиняємо, якщо йшов
        elapsedTime = 0;  // обнуляємо час
    }

    // Повертає поточний час у форматі hh:mm:ss
    public String getTime() {
        long total = elapsedTime;

        if (isRunning) {
            total += System.currentTimeMillis() - startTime;
        }

        long hours   = (total / 3600000) % 24;   // максимум 23:59:59
        long minutes = (total / 60000) % 60;
        long seconds = (total / 1000) % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    // Додатково: чи працює хронометр зараз
    public boolean isRunning() {
        return isRunning;
    }
}
*/