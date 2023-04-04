package Builder_without_concreteProducts_2ndOption;

public interface HamburgerBuilder {

    public void buildSalad();
    public  void buildSauce();
    public void buildTopping();

    public Object getBurger();
}
