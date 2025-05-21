package com.pluralsight.domain;

import com.pluralsight.interfaces.IAnimal;
import com.pluralsight.interfaces.IFlyable;

public class Bird implements IFlyable, IAnimal {


    @Override
    public void Fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }


}
