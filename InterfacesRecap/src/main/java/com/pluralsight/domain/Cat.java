package com.pluralsight.domain;

import com.pluralsight.interfaces.IAnimal;
import com.pluralsight.interfaces.IRunnable;

public class Cat implements IAnimal, IRunnable {

    @Override
    public void run() {
        System.out.println("The cat is running away");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
