package com.pluralsight;

import com.pluralsight.domain.Bird;
import com.pluralsight.domain.Eagle;
import com.pluralsight.interfaces.IAnimal;
import com.pluralsight.interfaces.IFlyable;
import java.util.*;
public class Main {
    public static void main(String[] args) {

Bird bird = new Bird();

IFlyable.launchIntoSky(bird);
bird.makeSound();


IAnimal america = new Eagle();
america.makeSound();
        List<IFlyable> flyers = new ArrayList<>();
        flyers.add(new Bird());
        flyers.add(new Eagle());


        for (IFlyable f : flyers) {
            f.Fly();  // all fly differently, but we treat them the same!
        }

        LinkedList<String> printJobs = new LinkedList<>();
        printJobs.addLast("doc1");
        printJobs.removeFirst(); // process next print job

    }
}