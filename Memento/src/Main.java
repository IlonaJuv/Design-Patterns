import java.util.ArrayList;
import java.util.List;

public class Main 
{
	public static void main(String[] args) {
	    int arvaajaMaara = 5;
	    Arvuuttaja arvuuttaja = new Arvuuttaja();

	    List<Thread> arvaajaThreads = new ArrayList<>();

	    for (int i = 1; i <= arvaajaMaara; i++) {
	        Arvaaja arvaaja = new Arvaaja(i, arvuuttaja);
	        Thread arvaajaThread = new Thread(arvaaja);
	        arvaajaThreads.add(arvaajaThread);
	        arvaajaThread.start();
	    }

	    for (Thread arvaajaThread : arvaajaThreads) {
	        try {
	            arvaajaThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    System.out.println("Kaikki saivat arvattua oikein!");
	}
}