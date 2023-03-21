import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;


public class ClockTimer extends Observable implements Runnable  {

	public String time;
	private Boolean isOn = true;
	private int rounds;

	public void setTime(String time1) {
		time = time1;
	}
	
	public String getTime() {
		return time;
	}
	
	private void tick() {
		java.util.Date d = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
		setTime(sdf.format(d));
		setChanged();
		notifyObservers();
		rounds++;
	}
	
	public void stopTimer() {
		isOn = false;
	}
	
	@Override
	public void run() {
		try {
			while (isOn) {
				tick();
				Thread.sleep(1000);
				if(rounds == 15)
					stopTimer();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	

