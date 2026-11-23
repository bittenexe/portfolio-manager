package com.pluralsight;

public class Jewelry extends Asset {
   private double karat;
   public static double pricePerKarat = 10_000;

    public Jewelry(String name, double karat) {
        super(name, karat * pricePerKarat);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return this.karat * Jewelry.pricePerKarat;
    }

}
