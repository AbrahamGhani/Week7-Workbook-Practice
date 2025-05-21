package com.pluralsight.interfaces;

public interface IFlyable {
    void Fly();
    public static void launchIntoSky(IFlyable flyer) {
        flyer.Fly();
    }
}
