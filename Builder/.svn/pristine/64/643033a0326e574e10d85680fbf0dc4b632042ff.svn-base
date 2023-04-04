import Builder.HamburgerBuilder;
import Director.Waiter;
import Hesburger.HBurger;
import Hesburger.HesburgerBuilder;
import McDonalds.McBurger;
import McDonalds.McBurgerBuilder;

public class Main {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();
        HamburgerBuilder  hamburgerBuilder = new HesburgerBuilder();

        waiter.setBurgerBuilder(hamburgerBuilder);
        waiter.constructHamburger();

       // HeHamburger hamburger = (HeHamburger) hamburgerBuilder.getHamburger();
        HBurger hamburger = (HBurger) waiter.serveHamburger();
        System.out.println(hamburger);

        HamburgerBuilder mcBuilder = new McBurgerBuilder();
        waiter.setBurgerBuilder(mcBuilder);
        waiter.constructHamburger();

        McBurger mcBurger = (McBurger) waiter.serveHamburger();
        System.out.println(mcBurger);

    }
}
