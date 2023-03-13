public class Pesto extends Tayte {
    private double pestoHinta = 2.4;
    private double kokHinta;
    public Pesto(Pizza koristeltavaPizza) {
        super(koristeltavaPizza);
    }

    @Override
    public double getHinta() {
         super.getHinta();
        return naytaPestonHinta();
    }

    private double naytaPestonHinta() {
        return kokHinta = (pestoHinta + super.getHinta());
    }

    @Override
    public String getKuvaus() {
        return super.getKuvaus() + ", pestoa";
    }
}
