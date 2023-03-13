public class Pohja implements Pizza {
    private double pohjanHinta = 5;
    private String kuvaus = "";
    public Pohja (String kuvaus ) {
        this.kuvaus = kuvaus;
    }
    @Override
    public double getHinta() {
        return this.pohjanHinta;
    }

    @Override
    public String getKuvaus() {
        return kuvaus;
    }
}
