package Builder_byFollowingTheExampleCode.Hesburger;

import Builder_byFollowingTheExampleCode.Parts.Part;

public class Topping implements Part {
    private String ingredient;
    public Topping(String str) {
        this.ingredient = str;
    }

    @Override
    public String toString() {
        return "Topping: " + ingredient ;
    }
}
