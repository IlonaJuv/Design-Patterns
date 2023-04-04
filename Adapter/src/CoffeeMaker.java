public class CoffeeMaker implements ICoffeeMachine{
	
    private CoffeeMachineAdapter coffeeAdapter = new CoffeeMachineAdapter();

    @Override
    public void makeCoffee(String temperature, String description) {
    	switch(temperature) {
    		case "warm":
    			System.out.println("Making warm temperature coffee called " + description);
    			break;
    		case "cold":
    		case "hot":
                coffeeAdapter.makeCoffee(temperature, description);
                break;
            default: 
                System.out.println("Invalid temperature. Can't make " + temperature + " coffee");
    	}
    }
}
