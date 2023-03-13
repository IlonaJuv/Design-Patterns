package Classes;
public class PokemonCharmander extends Pokemon{

	 // Huom! Kommenteissa muistissa toinen tapa, millä voi vaihtaa tilan näissä state-olioissa, eikä kontekstissa (silloin setPoints() otetaan pois käytöstä).  

    private static PokemonCharmander INSTANCE = null;
    //private int points = 0;
    private PokemonCharmander(){}

    public static PokemonCharmander getInstance() {
        if (INSTANCE == null)
        INSTANCE = new PokemonCharmander();

        return INSTANCE;
    }
   
/*
   @Override
    void changeState(ContextPlayer cp, IPokemon ip){
			cp.changeState(ip);
		}
    */
    
    @Override
    void run(ContextPlayer cp) {
      // TODO Auto-generated method stub
      System.out.println("Charmander running, 1 point");
      setPoints(cp, 1);
      
    /*  this.points +=1;
      if (points >= 10) {
  		  changeState(cp, PokemonCharizard.getInstance());
  		}*/
    }
    
    @Override
    void fight(ContextPlayer cp) {
	  System.out.println("Charmander fighting, 3 points");
	  setPoints(cp, 3);
	  
	/*  this.points +=3;
	  if (points >= 10) {
	  		changeState(cp, PokemonCharizard.getInstance());
	  	}  */
    }
    
    @Override
    void rest(ContextPlayer cp) {
	  System.out.println("Charmander resting, 2 points");
	  setPoints(cp, 2);
	  
	 /*this.points += 2;
	  if (points >= 10) {
	  		changeState(cp, PokemonCharizard.getInstance());
	  	}*/
    }

}