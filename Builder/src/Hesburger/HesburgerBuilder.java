package Hesburger;

import Builder.HamburgerBuilder;

public class HesburgerBuilder implements HamburgerBuilder {

    private HBurger hamburger;
    @Override
    public void createNewBurgerProduct() {
        hamburger = new HBurger();
    }

    @Override
    public void buildSalad() {
        hamburger.addBurgerPart(new Salad("Ice Salad"));
    }

    @Override
    public void buildSauce() {
        hamburger.addBurgerPart(new Sauce("pepper majo"));
    }

    @Override
    public void buildTopping() {
        hamburger.addBurgerPart(new Topping("Chicken + ananas"));
    }

    @Override
    public HBurger getBurger() {
        return hamburger;
    }
}
