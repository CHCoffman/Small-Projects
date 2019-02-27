/*****************************************************
 *  Created by: Colten Coffman on 12/4/2018          *
 *  COSC 1337.WW1              Grimes Fall '18       *
 *  This program will demonstrate polymorphism       *
 *  through the use of an array and for loop to      *
 *  call 3 that were methods previously created.     *
 *****************************************************/
package com.coffman;

public class ShapeTest
{

    public static void main(String[] args)
    {

        Shape s1 = new Shape();
        Rectangle r1 = new Rectangle();
        Ellipse e1 = new Ellipse();
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();
        Square sQ1 = new Square();

        System.out.println("\nShape Methods Array: \n");

        Shape[] shapeArray = {s1, r1, e1, t1, c1, sQ1};

        for (Shape methodArray : shapeArray)
        {
            methodArray.draw();
            methodArray.erase();
            methodArray.move();
        }
    }
}
