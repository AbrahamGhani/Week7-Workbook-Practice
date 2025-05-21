package com.pluralsight.assets;

import com.pluralsight.FixedAsset;

public class Jewelry extends FixedAsset {
double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return getMarketValue() * getKarat();
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }


}
