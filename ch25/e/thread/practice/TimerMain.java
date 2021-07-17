package e.thread.practice;

public class TimerMain {
	public static void main(String[] args) {
		TimerThread timerThread = new TimerThread();
		timerThread.run();
	}
}
