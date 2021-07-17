package e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread {
	public void run() {
		printCurrentTIme();
	}

	public void printCurrentTIme() {
		try {
			int count = 0;
			while (count < 10) {
				long current = System.currentTimeMillis();
				System.out.println(new Date(current) + " " + current);
				Thread.sleep(1000);
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
