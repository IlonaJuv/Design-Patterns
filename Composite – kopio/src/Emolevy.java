
public class Emolevy implements ILaiteosa {

	public int hinta = 10;
	public int kokonaisHinta;
	ILaiteosa [] emolevyOsat = {new Naytonohjain(), new Verkkokortti(), new Prosessori()};

	@Override
	public int naytaHinta() {
		for (ILaiteosa l : emolevyOsat) {
			kokonaisHinta += l.naytaHinta();
		}
		kokonaisHinta += hinta;
		return kokonaisHinta;
	}

	@Override
	public void lisaaOsa(ILaiteosa laiteosa) {
		throw new RuntimeException
		("Peruskomponenttiin ei voi lisätä osaa ...");
		
	}

}
