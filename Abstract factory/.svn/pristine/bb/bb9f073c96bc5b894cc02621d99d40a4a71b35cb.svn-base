package Adidas;

import Clothes.Jasper;
import Clothes.Cap;
import Clothes.Pants;
import Clothes.Shirt;
import Clothes.Shoes;
import Factory.IClothingFactory;

public class AdidasFactory implements IClothingFactory{
	
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
		jasper.setPants(new Pants("Adidas pants"));
		
	}

	@Override
	public void buildShirt() {
		jasper.setShirt(new Shirt("Adidas shirt"));
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildShoes() {
		// TODO Auto-generated method stub
		jasper.setShoes(new Shoes("Adidas shoes"));
	}

	@Override
	public void buildCap() {
		// TODO Auto-generated method stub
		jasper.setCap(new Cap("Adidas cap"));
		
	}
	
	

}
