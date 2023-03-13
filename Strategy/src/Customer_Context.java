public class Customer_Context {
    private ISortingStrategy strategy;

    public Customer_Context(ISortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ISortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] data) {
        strategy.sort(data);
    }
}
