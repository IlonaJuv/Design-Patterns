package src;
public abstract class Tayte implements Pizza {
    protected Pizza koristeltavaPizza;

    public Tayte (Pizza koristeltavaPizza) {
        this.koristeltavaPizza = koristeltavaPizza;
    }
    public double getHinta(){
       return this.koristeltavaPizza.getHinta();
    }

    public String getKuvaus(){
        return this.koristeltavaPizza.getKuvaus();
    }
}
