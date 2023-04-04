import java.util.Random;

public class Arvuuttaja {
	
	private int arvattava; 
	
	public Arvuuttaja() {
		this.arvattava = 0;
	}

	public Memento liityPeliin() {
		Random rand = new Random();
		this.arvattava = rand.nextInt(50);
	    return new Memento(this.arvattava);
	}
	
	public int getArvattava() {
		return this.arvattava;
	}
	
	
	public void peruViimeisinArvaus(Object obj) {
		Memento memento = (Memento) obj;
		this.arvattava = memento.arvattava;
	}

	public synchronized boolean onkoArvausOikein(int arvaus, Object mem) {
		Memento memento = (Memento) mem;
		return arvaus == memento.arvattava;
	}
	
	
	private class Memento  {
		private int arvattava; 
		
		public Memento(int arvaus) {
		    this.arvattava = arvaus;
		}
		
	}
	
		
}
