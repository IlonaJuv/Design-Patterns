package creator;
import Factory.IClothingFactory;

public class Creator {
	private IClothingFactory cFactory;
	
	public void setClothingFactory(IClothingFactory cf) {
		cFactory = cf;
	}
	
	public void constructClothes() {
		cFactory.createNewClothes();
		cFactory.buildPants();
		cFactory.buildShirt();
		cFactory.buildShoes();
		cFactory.buildCap();
	}
}
