package Builder_without_concreteProducts_2ndOption;


public class McBurgerBuilder implements HamburgerBuilder {
    private StringBuilder mcBurger = new StringBuilder();
    @Override
    public void buildSalad() {
        mcBurger.append(" Carrot salad ");
    }

    @Override
    public void buildSauce() {
        mcBurger.append(" Carlig majo ");
    }

    @Override
    public void buildTopping() {
        mcBurger.append(" Chicken + blue cheese ");
    }

    @Override
    public StringBuilder getBurger() {
        return mcBurger;
    }
}
