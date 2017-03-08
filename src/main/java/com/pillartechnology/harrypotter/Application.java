package com.pillartechnology.harrypotter;

import java.util.HashMap;

public class Application {

    public double checkout(HashMap<String, Integer> booksToPurchase) {
        final Integer numberOfBooks1 = booksToPurchase.get("book1");
        final Integer numberOfBooks2 = booksToPurchase.get("book2");

        if (booksToPurchase.size() == 2) {
            return ((numberOfBooks1 + numberOfBooks2) * 8) * .95;
        }
        return numberOfBooks1 * 8.00;
    }
}
