/*
Created by Colten Coffman 3/26/2019
COSC 2436.WW1
This program will use recursion to find the square root of
a number that is inputted by the user.
 */
package com.coffman;
import java.util.*;

public class Main {

    public static void main(String args[]) {

        double number, lowGuess = 0,highGuess, tolerance = .0005;
        Scanner in = new Scanner(System.in);

        System.out.print("What number do you want the square root of? ");
        number = in.nextDouble();
        highGuess = number;
        System.out.println("The square root of " + number +" is "+ squareRoot(number, lowGuess, highGuess, tolerance));
    }
    public static double squareRoot(double number, double lowGuess, double highGuess, double tolerance) {

        double newGuess=(lowGuess + highGuess) / 2;

        if ((highGuess - newGuess) / newGuess < tolerance)
            return newGuess;

        else if (newGuess * newGuess > number)
            return squareRoot (number, lowGuess, newGuess, tolerance);

        else if (newGuess * newGuess < number)
            return squareRoot (number, newGuess, highGuess , tolerance);

        else
            return newGuess;
    }
}