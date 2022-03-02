package com.jamilxt;

public class VegetableProduct extends Product {
    private String color;

    public VegetableProduct(int id, String name, String color) {
        super(id, name);
        this.color = color;
    }
}
