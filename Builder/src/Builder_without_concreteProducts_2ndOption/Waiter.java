package Builder_without_concreteProducts_2ndOption;


public class Waiter {

    private HamburgerBuilder hamburgerBuilder;

    public void setBurgerBuilder(HamburgerBuilder hb) {
        hamburgerBuilder = hb;
    }

    public void constructHamburger() {
        hamburgerBuilder.buildSalad();
        hamburgerBuilder.buildSauce();
        hamburgerBuilder.buildTopping();
    }

    public Object serveHamburger() {
        return hamburgerBuilder.getBurger();
    }

}
