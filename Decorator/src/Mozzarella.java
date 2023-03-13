public class Mozzarella extends Tayte {

    private double mozzarellaHinta = 3.5;
    private double kokHinta;
    public Mozzarella(Pizza koristeltavaPizza) {
        super(koristeltavaPizza);
    }

    @Override
    public double getHinta() {
        super.getHinta();
        return getMozzarellaHinta();
    }

    public double getMozzarellaHinta() {
        return kokHinta = (this.mozzarellaHinta + super.getHinta());

    }

    @Override
    public String getKuvaus() {
        return super.getKuvaus() + ", mozzarellaa";
    }
}
