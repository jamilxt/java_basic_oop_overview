package com.jamilxt;

public class Main {
    // programming language concepts: state machine

    // interpreter: each statement can be executed one by one
    // compiler: to run a program, all statements need to be executed at once

    // JVM = Java Virtual Machine
    // JRE = Java Runtime Environment
    // JDK = Java Development Kit

    // LTS = Long Term Support
    // Industry Popular: 8 (popular), 11 (second-popular)
    // Latest Java (LTS) Version: 17

    // Java is a statically-typed programming language. (Python, Javascript is dynamically programming language)
    // But, since Java 10, we can declare "var" to use dynamic typing which is called "Type Inference"

    // keyword: new, static, var, while, enum, extends

    // Primitive Type (8): int, byte, short, long, float, double, boolean, and char
    // Primitive Wrapper Class (8): Integer, Byte, Short, Long, Float, Double, Boolean and Character
    // Reference Type (Class): String,

    // Access Modifiers: public, private, protected

    // Encapsulation: to protect the object's attributes

    // Class's constructor: A class's special method to create an object
    // If we don't declare any constructor, the default constructor will be used
    // If we declare constructor with a/some parameter(s), the default constructor will be removed,
    // if we want default constructor, we will have to declare it explicitly

    // object create = instantiation (using new keyword)

    // difference between method's parameter (value type) & argument (actual value)

    // Super: Product, SubClass: VegetableProduct

    public static void main(String[] args) {
        Product tomato;
        tomato = new VegetableProduct(1, "Tomat", Color.RED);      // OOP: polymorphism
        tomato.setName("Tomato");
        tomato.setDescription("This is good");

        VegetableProduct potato;                                            // variable declare
        potato = new VegetableProduct(2, "Potato", Color.GRAY);     // first create object from "Product", then initialize the object in "potato" variable which type is "Product"
        potato.setDescription("This is good", "this is also good");

        new Product(3, "Egg");                                      // object created using new keyword along with class's constructor

        System.out.println("-----------------");
        System.out.println("id: " + tomato.getId());
        System.out.println("name: " + tomato.getName());
        System.out.println("description: " + tomato.getDescription());
//      System.out.println("color: " + tomato.getColor()); // unable to call getColor(), as the variable type is Product.
        System.out.println("-----------------");
        System.out.println("id: " + potato.getId());
        System.out.println("name: " + potato.getName());
        System.out.println("description: " + potato.getDescription());
        System.out.println("color: " + potato.getColor());
        System.out.println("-----------------");

        // to replicate product app we used infinite loop
        while (true) {

        }
    }

    // javac Main.java --generate byte code--> Main.class -->
}
