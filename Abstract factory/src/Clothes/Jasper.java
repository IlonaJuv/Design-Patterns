package Clothes;

public class Jasper {
	
	private Cap cap;
	private Pants pants;
	private Shirt shirt;
	private Shoes shoes;

	public void setCap(Cap cap) {
		this.cap = cap;
	}

	public void setPants(Pants pants) {
		this.pants = pants;
	}
	
	public void setShirt(Shirt shirt) {
		this.shirt = shirt;
	}

	public void setShoes(Shoes shoes) {
		this.shoes = shoes;
	}
	
	@Override
	public String toString() {
		return  "I'm having " + cap + ", " + pants + ", " + shirt + ", " + shoes + ".";
	}
	
}
