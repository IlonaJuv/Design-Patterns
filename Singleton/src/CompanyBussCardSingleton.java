
public class CompanyBussCardSingleton {

	
	
	private static CompanyBussCardSingleton INSTANCE = null;
	private static final int ADD_MONTH = 30;
	private int days;
	
	private CompanyBussCardSingleton(){} 
	
	public static CompanyBussCardSingleton getInstance(){
		if (INSTANCE == null){
			INSTANCE = new CompanyBussCardSingleton();
		}
		return INSTANCE;
	}
	
	public int getTime() {
		return days;
	}
	
	public void addTime() {
		days += ADD_MONTH;
	}
	
	public void deductTime() {
		days--;
	}
	
}
