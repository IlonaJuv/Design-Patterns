public class ColdCoffeeMachine implements IAdvancedCoffeeMachine {
	
    @Override
    public void makeHotCoffee(String description) {
        throw new RuntimeException("In cold coffee maker can't make hot coffee");

    }

    @Override
    public void makeColdCoffee(String description) {
        System.out.println("making cold coffee called " + description);
    }
}
