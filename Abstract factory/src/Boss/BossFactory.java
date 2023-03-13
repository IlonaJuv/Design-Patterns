package Boss;

import Clothes.Jasper;
import Clothes.Cap;
import Clothes.Pants;
import Clothes.Shirt;
import Clothes.Shoes;
import Factory.IClothingFactory;

public class BossFactory implements IClothingFactory{
	
	private Jasper jasper;
	
	@Override
	public void createNewClothes() {
		// TODO Auto-generated method stub
		jasper = new Jasper();
	}
	@Override
	public Jasper getClothes() {
		return jasper;
	}

	@Override
	public void buildPants() {
		// TODO Auto-generated method stub
		jasper.setPants(new Pants("Boss pants"));
		
	}

	@Override
	public void buildShirt() {
		jasper.setShirt(new Shirt("Boss shirt"));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildShoes() {
		// TODO Auto-generated method stub
		jasper.setShoes(new Shoes("Boss shoes"));
	}

	@Override
	public void buildCap() {
		// TODO Auto-generated method stub
		jasper.setCap(new Cap("Boss cap"));
		
	}
	
	

}
