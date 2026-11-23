package com.pluralsight;

public class Gold extends Asset {
    private double weight;

    public Gold(double weight) {
        super("gold", weight * 3500);
        this.weight = weight;
    }
}
