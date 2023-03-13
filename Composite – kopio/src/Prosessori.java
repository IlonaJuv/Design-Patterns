
public class Prosessori implements ILaiteosa {

	private int hinta = 10;
	
	@Override
	public int naytaHinta() {
		// TODO Auto-generated method stub
		return hinta;
	}

	@Override
	public void lisaaOsa(ILaiteosa laiteosa) {
		// TODO Auto-generated method stub
		throw new RuntimeException
		("Peruskomponenttiin ei voi lisätä osaa ...");
		
	}


}
