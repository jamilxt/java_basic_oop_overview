package com.jamilxt;

public class Product {
    // attribute
    private int id; // by default: 0
    private String name; // by default: null
    private String description; // by default: null

    // default constructor

    // constructor with parameters
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // method: getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // method: setter
    public void setDescription(String description) {
        this.description = description;
    }
}
