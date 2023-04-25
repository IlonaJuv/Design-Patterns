public class SeinaNappi {
    Komento komento;

    public SeinaNappi(Komento komento) {
        this.komento = komento;
    }

    public void paina() {
        komento.toteuta();
    }
}
