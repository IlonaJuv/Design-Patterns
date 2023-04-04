
public class Arvaaja implements Runnable{

	private Object obj; 
	private final Arvuuttaja arvuuttaja;
	private final int id;
	private boolean arvattuOikein = false;

	
	public Arvaaja (int id, Arvuuttaja arvuuttaja) {
		this.id = id;
		this.arvuuttaja = arvuuttaja;
		this.obj = arvuuttaja.liityPeliin();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!arvattuOikein) {
			int arvaus = (int) (Math.random()*50);
			if (arvuuttaja.onkoArvausOikein(arvaus, obj)) {
				System.out.print("Arvaaja " + id + " ARVASI OIKEIN!");
				arvattuOikein = true;
			} else {
				System.out.println("Arvaaja " + id + " arvasi väärin. ");
				arvuuttaja.peruViimeisinArvaus(obj);
			}
			try {
				Thread.sleep(10); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
		 
	}
}
