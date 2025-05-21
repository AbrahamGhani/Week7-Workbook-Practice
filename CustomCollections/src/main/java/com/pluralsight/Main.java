package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43); // this line should fail
        System.out.println(numbers.getItems().size());
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
//dates.add(15); // this line should fail also will give error regardless since now it wants LocalDate type it wont accept and int

    }
}