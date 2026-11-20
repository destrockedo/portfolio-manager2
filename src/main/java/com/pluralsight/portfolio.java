package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class portfolio {
    private String name;
    private String owner;
    // Stores references to all objects that implement Valuable, allowing different asset types in one list.
    private List<Valuable> assets;

    public portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }
    public void add(Valuable asset){
        assets.add(asset);
    }
    public BigDecimal getValue(double value){
        BigDecimal total = BigDecimal.ZERO;

        for (Valuable asset: assets){
            total =  total.add(asset.getValue());
        }
        return total;
    }

        public Valuable getMostValuable() {
            if (assets.isEmpty()) {
                return null;
            }

            // Start with the first item as the best one seen so far
            Valuable mostValuable = assets.get(0);

            for (Valuable asset : assets) {
                // BigDecimal has no > operator, .compareTo(b) returns a
                // positive number when a is bigger than b, 0 when they are
                // equal and a negative number when a is smaller
                if (asset.getValue().compareTo(mostValuable.getValue()) > 0) {
                    mostValuable = asset;
                }
            }

            return mostValuable;
        }

        public Valuable getLeastValuable() {
            if (assets.isEmpty()) {
                return null;
            }

            // Start with the first item as the least valuable one seen so far
            Valuable leastValuable = assets.get(0);

            for (Valuable asset : assets) {
                // BigDecimal has no < operator, .compareTo(b) returns a
                // positive number when a is bigger than b, 0 when they are
                // equal and a negative number when a is smaller
                if (asset.getValue().compareTo(leastValuable.getValue()) < 0) {
                    leastValuable = asset;
                }
            }

            return leastValuable;
        }


}
