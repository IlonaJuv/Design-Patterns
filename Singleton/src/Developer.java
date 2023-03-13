
public class Developer implements Company {
	CompanyBussCardSingleton bd = CompanyBussCardSingleton.getInstance();

	@Override
	public void loadBusscard() {
		// TODO Auto-generated method stub
		bd.addTime();
	}

	@Override
	public void useBussCard() {
		// TODO Auto-generated method stub
		bd.deductTime();
	}

	@Override
	public String checkTimeLeft() {
		// TODO Auto-generated method stub
		return "Time left on the card: " + bd.getTime() + " days";
	}

}
