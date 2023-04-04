package McDonalds;

import Builder.HamburgerBuilder;

public class McBurgerBuilder implements HamburgerBuilder {
    private McBurger mcBurger;
    @Override
    public void createNewBurgerProduct() {
            mcBurger = new McBurger();
    }

    @Override
    public void buildSalad() {
        mcBurger.addPart(" Carrot salad ");
    }

    @Override
    public void buildSauce() {
        mcBurger.addPart(" Carlig majo ");

    }

    @Override
    public void buildTopping() {
        mcBurger.addPart(" Chicken + blue cheese ");
    }

    @Override
    public Object getHamburger() {
        return mcBurger;
    }
}
