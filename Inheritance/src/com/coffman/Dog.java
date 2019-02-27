package com.coffman;

public class Dog extends Animal {

    //dogs have the following characteristics and the default animal
    //has all of those other characteristics
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //we deleted brain and body in the param list and used 1 because they all have
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        //initialize the other variables that are only related to dog
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat()called");
        chew(); //dog.chew
        super.eat(); // animal eat (super = animal)
    }//Overriding a method that is a part of the super (animal) class
    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5); //only execute move in super class
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

