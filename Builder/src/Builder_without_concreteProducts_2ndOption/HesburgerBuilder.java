package Builder_without_concreteProducts_2ndOption;


import Parts.Part;

import java.util.ArrayList;

public class HesburgerBuilder implements HamburgerBuilder {
    private ArrayList<Part> brgr = new ArrayList<>();
    @Override
    public void buildSalad() {
        brgr.add(new Salad("Ice Salad"));
    }

    @Override
    public void buildSauce() {
        brgr.add(new Sauce("pepper majo"));
    }

    @Override
    public void buildTopping() {
        brgr.add(new Topping("Chicken + ananas"));
    }

    @Override
    public ArrayList getBurger() {
        return brgr;
    }
}
