package com.jamilxt;

// OOP: Inheritance
// 1) Multiple Class can't be extended

public class VegetableProduct extends Product {
    private Color color;

    public VegetableProduct(int id, String name, Color color) {
        super(id, name);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
