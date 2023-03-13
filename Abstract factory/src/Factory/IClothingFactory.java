package Factory;

public interface IClothingFactory {
	
	public abstract void createNewClothes();
	public abstract void buildPants();
	public abstract void buildShirt();
	public abstract void buildShoes();
	public abstract void buildCap();
	public abstract Object getClothes();
	
}
