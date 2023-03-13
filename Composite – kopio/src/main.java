
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ILaiteosa kone = new Tietokone();
		
		ILaiteosa kotelo = new Kotelo();

		//Lisää koneeseen kotelon joka sisältää suoraan tai välillisesti muut tietokoneen osat
		kone.lisaaOsa(kotelo);
	
		ILaiteosa tuuletin = new LisaTuuletin();
		kone.lisaaOsa(tuuletin);

		System.out.println("Koneen hinta yhteensä " + kone.naytaHinta() + " euroa." );
	}
}
