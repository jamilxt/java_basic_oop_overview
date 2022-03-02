package com.jamilxt;

// OOP: Inheritance
// 1) Multiple Class can't be extended

// Subclass of Product
public class VegetableProduct extends Product { // is-a relationship: "VegetableProduct" is a "Product"
    private Color color;

    public VegetableProduct(int id, String name, Color color) {
        super(id, name);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

//    as the method of the parent class is declared final, child can't invoke the method
//    @Override // an annotation
//    public void setName(String name) {
//        // modern logic
//        super.setName(name);
//    }

    // OOP: polymorphism: overriding
    @Override // an annotation: In object-oriented terms, overriding means to override the functionality of an existing method
    public void setDescription(String description) {
        String myDescription = "[Overriding] (Vegetable): ";
        // apply more business logic
        super.setDescription(myDescription + description);
    }

    // OOP: polymorphism: overloading
    public void setDescription(String description, String secondDescription) {
        String myDescription = "[Overloading] (Vegetable): ";
        super.setDescription(myDescription + description);
    }
}
