package Classes;

public class ContextPlayer {
    private Pokemon pokState;
    private int points;
    private boolean playing = true;

    public ContextPlayer() {
        pokState = PokemonCharmander.getInstance();
    }

    public void fight() {
        pokState.fight(this);
    }

    public void run() {
        pokState.run(this);
    }
    
    public void rest() {
        pokState.rest(this);
    }

    protected void changeState (Pokemon p) {
        pokState = p;
    }

    public void endGame() {
        this.playing = false;
    }

    public boolean getIsGameOn(){
        return playing;
    }



    public void setPoints(int points) {
        this.points += points;
        if(this.points <= 10){
            pokState = PokemonCharmander.getInstance();
        } else if (this.points > 10 && this.points <=30 ) {
            pokState = PokemonCharizard.getInstance();
        } else if (this.points > 30 && this.points <= 50) {
            pokState = PokemonCharmeleon.getInstance();
        } else {
            endGame();
        }
    
    }
    
}
