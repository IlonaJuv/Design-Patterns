
public class Rehtori extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		// TODO Auto-generated method stub
		return new Vichy();
	}

	@Override
	public Ruoka createRuoka() {
		// TODO Auto-generated method stub
		return new Pasta();
	}

}
