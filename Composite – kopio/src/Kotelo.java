
public class Kotelo implements ILaiteosa {
	//tee lista/taulukko
	ILaiteosa[] koteloOsat = {new Emolevy(), new Muistipiiri()};
	private int hinta = 10;
	private int kokonaisHinta;
	@Override
	public int naytaHinta() {
		// TODO Auto-generated method stub
		for (ILaiteosa l : koteloOsat) {
			kokonaisHinta += l.naytaHinta();
		}
		kokonaisHinta += hinta;
		return kokonaisHinta;
	}

	@Override
	public void lisaaOsa(ILaiteosa laiteosa) {
		// TODO Auto-generated method stub
		throw new RuntimeException
		("Peruskomponenttiin ei voi lisätä osaa ...");
		
	}

}
