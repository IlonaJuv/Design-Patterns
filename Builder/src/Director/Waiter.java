package Director;
import Builder.HamburgerBuilder;

public class Waiter {

    private HamburgerBuilder hamburgerBuilder;

    public void setBurgerBuilder(HamburgerBuilder hb) {
        hamburgerBuilder = hb;
    }

    public void constructHamburger() {
        hamburgerBuilder.createNewBurgerProduct();
        hamburgerBuilder.buildSalad();
        hamburgerBuilder.buildSauce();
        hamburgerBuilder.buildTopping();
    }

    public Object serveHamburger() {
        return hamburgerBuilder.getBurger();
    }

}
