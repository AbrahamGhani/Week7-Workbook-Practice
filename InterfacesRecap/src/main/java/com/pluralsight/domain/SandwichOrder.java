package com.pluralsight.domain;

import java.util.Arrays;
import java.util.List;

public class SandwichOrder {
    public static void main(String[] args) {

        List<Integer> sandwichPrices = Arrays.asList(3, 2, 2, 3, 7, 3, 5);


        int totalPrice = sandwichPrices.stream()
                .reduce(
                        0,
                        (sum, price) -> sum + price
                );

        System.out.println("Total orderprice: €" + totalPrice);
    }
}
