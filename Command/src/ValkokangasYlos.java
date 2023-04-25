public class ValkokangasYlos implements Komento {
    private Valkokangas valkokangas;

    public ValkokangasYlos(Valkokangas kangas) {
        valkokangas = kangas;
    }

    @Override
    public void toteuta() {
        valkokangas.nostaYlos();
    }
}
