
public interface Company {

	CompanyBussCardSingleton bd = CompanyBussCardSingleton.getInstance();

	void loadBusscard();

	
	void useBussCard();
	
	
	public String checkTimeLeft();
}
