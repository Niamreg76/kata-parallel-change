package com.jad.parallelchange.field;

public class LocalClient {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(10);
        System.out.println("shoppingCart.numberOfProducts() = " + shoppingCart.numberOfProducts());
        System.out.println("shoppingCart.calculateTotalPrice() = " + shoppingCart.calculateTotalPrice());
        System.out.println("shoppingCart.hasDiscount() = " + shoppingCart.hasDiscount());

        ShoppingCart2 shoppingCart2 = new ShoppingCart2();
        shoppingCart2.add(10);
        shoppingCart2.add(130);
        System.out.println("shoppingCart.numberOfProducts() = " + shoppingCart2.numberOfProducts());
        System.out.println("shoppingCart.calculateTotalPrice() = " + shoppingCart2.calculateTotalPrice());
        System.out.println("shoppingCart.hasDiscount() = " + shoppingCart2.hasDiscount());
    }
}