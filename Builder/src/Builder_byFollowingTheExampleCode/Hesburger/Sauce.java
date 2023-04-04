package Builder_byFollowingTheExampleCode.Hesburger;

import Builder_byFollowingTheExampleCode.Parts.Part;

public class Sauce implements Part {
    String ingredient;
    public Sauce(String str) {
        this.ingredient = str;
    }

    @Override
    public String toString() {
        return "Sauce: " + ingredient ;
    }
}
