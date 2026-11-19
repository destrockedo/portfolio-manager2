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
    public BigDecimal getMostValuable(List<Valuable> assets){

    }
    public BigDecimal getLeastValuable(List<Valuable> assets){

    }
}
