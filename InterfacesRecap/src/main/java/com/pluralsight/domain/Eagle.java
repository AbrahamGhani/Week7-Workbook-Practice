package com.pluralsight.domain;

import com.pluralsight.interfaces.IAnimal;
import com.pluralsight.interfaces.IFlyable;

public class Eagle implements IFlyable, IAnimal {
    @Override
    public void makeSound() {
        System.out.println("AMERICAAAAAAAAAA" + "\uD83E\uDD85\uD83E\uDD85\uD83E\uDD85\uD83D\uDD2B\uD83D\uDD2B\uD83D\uDD2B");
    }

    @Override
    public void Fly() {
        System.out.println("\uD83E\uDD85\uD83E\uDD85\uD83E\uDD85\uD83E\uDD85");
    }
}
