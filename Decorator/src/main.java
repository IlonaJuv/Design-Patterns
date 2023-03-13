public class main {
    public static void main(String[] args) {

        Pizza taytettyPizza =
                new Tomaatti (
                        new Mozzarella (new Pesto(
                                new Pohja("Valkoinen pohja"))));
        System.out.println("Herkkupizza: " + taytettyPizza.getKuvaus() + ", ja maksaa " + taytettyPizza.getHinta() + " euroa");


        Pizza delicious =
                new Pesto(
                        new Tomaatti (new Salami(
                                new Pohja("Punainen pohja"))));
        System.out.println("Delicious-pizza: " + delicious.getKuvaus() + ", ja maksaa " + delicious.getHinta() + " euroa");

        Pizza allIn =
                new Mozzarella(
                        new Pesto(new Salami(
                                new Tomaatti(new Pohja("Punaninen pohja")))));
        System.out.println("All In-pizza: " + allIn.getKuvaus() + ", ja maksaa " + allIn.getHinta() + " euroa");

    }
}
