public class HotCoffeeMachine implements IAdvancedCoffeeMachine {
    @Override
    public void makeHotCoffee(String description) {
        System.out.println("Making hot coffee called " + description);
    }

    @Override
    public void makeColdCoffee(String description) {
        throw new RuntimeException("In hot coffee maker can't make cold coffee");

    }
}
