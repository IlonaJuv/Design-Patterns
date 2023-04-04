public class CoffeeMachineAdapter implements ICoffeeMachine {
    //Object adapter
    IAdvancedCoffeeMachine advancedCoffeeMaker;

    public CoffeeMachineAdapter() {}

    @Override
    public void makeCoffee(String temperature, String description) {
        if (temperature.equalsIgnoreCase("hot")) {
            advancedCoffeeMaker = new HotCoffeeMachine();
            advancedCoffeeMaker.makeHotCoffee(description);
        } else if (temperature.equalsIgnoreCase("cold")) {
            advancedCoffeeMaker = new ColdCoffeeMachine();
            advancedCoffeeMaker.makeColdCoffee(description);
        }
    }
}
