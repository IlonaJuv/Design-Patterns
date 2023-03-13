
public class CEO implements Company{

	CompanyBussCardSingleton bd = CompanyBussCardSingleton.getInstance();
	
	public void loadBusscard() {
		bd.addTime();
	}

	public void useBussCard() {
		bd.deductTime();
	}
	
	public String checkTimeLeft() {

		return "Time left on the card: " + bd.getTime() + " days";
	}
}
