package Builder;

public interface HamburgerBuilder {

    public abstract void createNewBurgerProduct();
    public abstract void buildSalad();
    public abstract void buildSauce();
    public abstract void buildTopping();

    public abstract Object getHamburger();
}
