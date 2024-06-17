package com.jad.parallelchange.field;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart2 {
    private List<Integer> prices;

    public ShoppingCart2() {
        this.prices = new ArrayList<>();
    }

    public void add(int price) {
        prices.add(price);
    }

    public int calculateTotalPrice() {
        return this.prices.stream().mapToInt(Integer::intValue).sum();
    }

    public boolean hasDiscount() {
        return this.prices.stream().anyMatch(price -> price >= 100);
    }

    public int numberOfProducts() {
        return this.prices.size();
    }
}