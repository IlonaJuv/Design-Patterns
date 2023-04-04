package Hesburger;

import Parts.Part;

import java.util.ArrayList;

public class HBurger {

    private ArrayList<Part> brgr = new ArrayList<>();

    public void addBurgerPart (Part part) {
        brgr.add(part);
    }

    @Override
    public String toString() {
        return "Hesburger hamburger: " +  brgr.toString();
    }
}
