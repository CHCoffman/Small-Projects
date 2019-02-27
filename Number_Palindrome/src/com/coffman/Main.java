package com.coffman;

public class Main {
    public static void main(String[] args) {
        String numberAsString= "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        // parseInt will convert the string into an integer
        // use the . to show what you are parsing. It is a static method (parseInt
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("Number = " + number);
    }
}
