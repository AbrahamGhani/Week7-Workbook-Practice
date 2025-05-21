package com.pluralsight;
import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    String name;
    String owner;
    private List<Valuable> valuables = new ArrayList<>();

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void addValuable(Valuable valuable) {
        valuables.add(valuable);
    }

    public Valuable getMostValuable() {
        if (valuables.isEmpty()) return null;

        Valuable mostValuable = valuables.get(0);
        for (Valuable valuable : valuables) {
            if (valuable.getValue() > mostValuable.getValue()) {
                mostValuable = valuable;
            }
        }
        return mostValuable;
    }

    public Valuable getLeastValuable() {
        if (valuables.isEmpty()) return null;

        Valuable leastValuable = valuables.get(0);
        for (Valuable valuable : valuables) {
            if (valuable.getValue() < leastValuable.getValue()) {
                leastValuable = valuable;
            }
        }
        return leastValuable;
    }

    public double getValue() {
        double total = 0;
        for (Valuable valuable : valuables) {
            total += valuable.getValue();
        }
        return total;
    }


}
