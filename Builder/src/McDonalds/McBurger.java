package McDonalds;

public class McBurger {
    private String sauce;
    private String salad;
    private String topping;

    private StringBuilder mcBrgr = new StringBuilder();

    public void addPart(String part) {
        mcBrgr.append(part);
    }

    @Override
    public String toString() {
        return "McDonald's Burger includes: " + mcBrgr.toString();
    }
}
