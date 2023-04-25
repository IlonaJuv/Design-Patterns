public class ValkokangasAlas implements Komento{
    private Valkokangas valkokangas;
    public ValkokangasAlas(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }
    @Override
    public void toteuta() {
        valkokangas.laskeAlas();
    }
}
