package com.jamilxt;

public class Main {
    // state machine

    // interpreter (each statement will be processed/converted one by one)
    // compiler (statements will be processed/converted to machine language at once)

    // JVM = Java Virtual Machine
    // JRE = Java Runtime Environment
    // JDK = Java Development Kit

    // LTS = Long Term Support
    // Industry Popular: 8 (popular), 11 (second-popular)
    // Latest Java (LTS) Version: 17

    // Java is a statically-typed programming language. (Python, Javascript is dynamically programming language)
    // But, since Java 10, we can declare "var" to use dynamic typing which is called "Type Inference"

    // keyword: new, static

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

    public static void main(String[] args) {
        Product tomato;                             // variable declare
        tomato = new Product(1, "Tomato");  // first create object from "Product",
        // then initialize the object in "tomato" variable which type is "Product"
        Product potato;
        potato = new Product(2, "Potato");

        new Product(3, "Egg");              // object created using new keyword along with class's constructor

        System.out.println("-----------------");
        System.out.println("id: " + tomato.getId());
        System.out.println("name: " + tomato.getName());
        System.out.println("description: " + tomato.getDescription());
        System.out.println("-----------------");
        System.out.println("id: " + potato.getId());
        System.out.println("name: " + potato.getName());
        System.out.println("description: " + potato.getDescription());
        System.out.println("-----------------");

        // to replicate product app we used infinite loop
        while (true) {

        }
    }

    // javac Main.java --generate byte code--> Main.class -->
}