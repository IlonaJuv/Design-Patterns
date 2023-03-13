
public class Oppilas extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		return new Maito();
	}

	@Override
	public Ruoka createRuoka() {
		// TODO Auto-generated method stub
		return new Pasta();
	}

}
