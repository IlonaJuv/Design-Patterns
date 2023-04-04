package Builder_byFollowingTheExampleCode.McDonalds;

import Builder_byFollowingTheExampleCode.Builder.HamburgerBuilder;

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
    public McBurger getBurger() {
        return mcBurger;
    }
}
