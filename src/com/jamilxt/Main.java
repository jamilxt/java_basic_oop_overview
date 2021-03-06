package com.jamilxt;

import com.jamilxt.enums.Color;
import com.jamilxt.model.Product;
import com.jamilxt.model.ShoppingCart;
import com.jamilxt.model.VegetableProduct;

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

    // In Java, Every class's parent class is Object.class. Class Object is the root of the class hierarchy.
    // - Every class has Object as a superclass.
    // - All objects, including arrays, implement the methods of this class


    public static void main(String[] args) {
        Product tomato;
        tomato = new VegetableProduct(1, "Tomat", Color.RED);      // OOP: polymorphism
        tomato.setName("Tomato");
        tomato.setDescription("This is good");

        VegetableProduct potato;                                            // variable declare
        potato = new VegetableProduct(2, "Potato", Color.GRAY);     // first create object from "Product", then initialize the object in "potato" variable which type is "Product"
        potato.setDescription("This is good", "this is also good");

        System.out.println("-----------------");
        System.out.println(tomato);
        System.out.println("-----------------");
        System.out.println(potato);
        System.out.println("-----------------");


        ShoppingCart myShoppingCart = new ShoppingCart();
        myShoppingCart.addProduct(tomato);
        myShoppingCart.addProduct(potato);
        myShoppingCart.checkout();
        myShoppingCart.print();

        // to replicate product app we used infinite loop
        while (true) {

        }
    }

    // javac Main.java --generate byte code--> Main.class -->
}
