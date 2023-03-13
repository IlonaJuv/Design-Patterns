import java.util.ArrayList;
import java.util.List;

public class Tietokone implements ILaiteosa {
	
	List<ILaiteosa> osaLista = new ArrayList<ILaiteosa>();
	public int kokonaisHinta;

	@Override
	public void lisaaOsa(ILaiteosa laiteosa) {
		osaLista.add(laiteosa);
	}
	
	@Override
	public int naytaHinta() {
		for(ILaiteosa l : osaLista) {
			kokonaisHinta += l.naytaHinta();
		}
		return kokonaisHinta;
	}
}
