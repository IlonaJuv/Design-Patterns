public class Main {
    public static void main(String[] args) {

        Valkokangas kangas = new Valkokangas();
        Komento nostaYlos = new ValkokangasYlos(kangas);
        Komento laskeAlas = new ValkokangasAlas(kangas);

        SeinaNappi nappi1 = new SeinaNappi(nostaYlos);
        SeinaNappi nappi2 = new SeinaNappi(laskeAlas);

        nappi1.paina();
        nappi2.paina();
    }
}
