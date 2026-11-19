package com.pluralsight;

import java.math.BigDecimal;

public class Gold extends FixedAsset {

    private double weight;

    public Gold(String name, double weight) {
        super(name);
        this.weight = weight;
    }
    public BigDecimal getValue() {
        return BigDecimal.ZERO;
    }
}
