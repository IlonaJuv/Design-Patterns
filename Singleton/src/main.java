
public class main {

	public static void main(String[] args) {
		CompanyBussCardSingleton bd = CompanyBussCardSingleton.getInstance();
		CEO ceo = new CEO();
		Developer dev = new Developer();
		Designer dsgn = new Designer();
		
		//Check that only one value
		System.out.println(dev.checkTimeLeft());
		
		dev.loadBusscard();
		System.out.println(dev.checkTimeLeft());
		System.out.println(ceo.checkTimeLeft());
		ceo.useBussCard();
		System.out.println(ceo.checkTimeLeft());
		System.out.println(dev.checkTimeLeft());
		
		dev.useBussCard();
		dsgn.useBussCard();
		ceo.useBussCard();
		
		System.out.println("Time left on the card: " + bd.getTime() + " days");
		
	}

}
