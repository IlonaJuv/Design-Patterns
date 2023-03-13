public class Salami extends Tayte{
    private double salaminHinta = 2;
    public Salami(Pizza koristeltavaPizza) {
        super(koristeltavaPizza);
    }

    @Override
    public double getHinta() {
         super.getHinta();
        return naytaSalaminHinta();
    }

    private double naytaSalaminHinta() {
        return (salaminHinta + super.getHinta());
    }

    @Override
    public String getKuvaus() {
        return super.getKuvaus() + ", salamia";
    }
}
