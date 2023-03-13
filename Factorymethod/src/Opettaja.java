

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    }

	@Override
	public Ruoka createRuoka() {
		return new Pasta();
	};

}
