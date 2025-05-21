package com.pluralsight.domain;

import com.pluralsight.interfaces.IAnimal;
import com.pluralsight.interfaces.ISwimmable;

public class Dog implements IAnimal, ISwimmable {
    @Override
    public void swim() {
        System.out.println("The doogey is swimmin");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
