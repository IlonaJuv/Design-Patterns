import java.util.Timer;
import java.util.TimerTask;

public class main {

	public static void main(String[] args) {
		
		ClockTimer timer = new ClockTimer();

		Thread thread = new Thread(timer);
		DigitalClock digitalClock = new DigitalClock(timer);
		thread.start();

	}
}
