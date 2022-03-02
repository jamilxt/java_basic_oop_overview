package com.jamilxt.model;

// OOP: Encapsulation
// Abstraction class doesn't provide full abstraction, as we can implement the method body
// If we want abstraction of a method, we need to declare it as "abstract" keyword"
public abstract class Product {
    // attribute/instance field
    private int id; // by default: 0
    private String name; // by default: null
    private String description; // by default: null
    // default constructor

    // constructor with parameters
    protected Product(int id, String name) {
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

    public final void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    // method: setter
    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void verifyHealthiness();

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
