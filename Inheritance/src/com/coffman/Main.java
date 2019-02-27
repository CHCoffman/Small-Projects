package com.coffman;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
        dog.eat();
        //extending means inheriting from another class, the super
        //dog.walk();
        dog.run();
        // Run was executed in the dog file and from there JAva
        // found move, looked for whatever move method was avail
        // and executed everything in there (move, movelegs supermove)
        dog.walk();
    }
}
