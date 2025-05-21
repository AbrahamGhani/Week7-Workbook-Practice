package com.pluralsight.assets;

import com.pluralsight.FixedAsset;

public class Property extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int numBedrooms;

    public Property(String name, double marketValue, int yearBuilt, int squareFeet, int numBedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.numBedrooms = numBedrooms;
    }

    @Override
    public double getValue() {
        return getMarketValue();
    }


    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }
}
