package com.jamilxt;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements CheckoutFeature, Printer {
    List<Product> products; // by default: null

    public void addProduct(Product product) {
        if (products == null) { // first product
            products = new ArrayList<>();
            products.add(product);
        } else {
            products.add(product);
        }
    }

    public void removeProduct(Product product) {
        if (products == null) { // first product
            products = new ArrayList<>();
        } else {
            products.remove(product);
        }
    }

    @Override
    public void checkout() {
        System.out.println("Checkout successful");
    }

    @Override
    public void print() {
        System.out.println("Printing Receipt... Please wait");
    }
}
