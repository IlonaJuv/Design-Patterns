package src;
public class Tomaatti extends Tayte {
    private double tomaatinHinta = 1.5;

    public Tomaatti(Pizza koristeltavaPizza) {
        super(koristeltavaPizza);
    }

    @Override
    public double getHinta() {
        super.getHinta();
        return naytaTomaatinHinta();
    }

    private double naytaTomaatinHinta() {
        return (tomaatinHinta + super.getHinta());
    }

    @Override
    public String getKuvaus() {
        return super.getKuvaus() + ", tomaattia";
    }
}


