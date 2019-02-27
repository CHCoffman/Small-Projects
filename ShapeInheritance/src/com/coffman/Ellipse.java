/*****************************************************
 *  Created by: Colten Coffman on 12/3/2018          *
 *  COSC 1337.WW1              Grimes Fall '18       *
 *  Ellipse File, which the circle class inherits    *
 *****************************************************/
package com.coffman;

public class Ellipse extends Shape
{

    public Ellipse()
    {
        System.out.println("Ellipse - default constructor");
    }

    @Override
    public void draw()
    {
        System.out.println("Ellipse - draw method");
    }

    @Override
    public void erase()
    {
        System.out.println("Ellipse - erase method");
    }

    @Override
    public void move()
    {
        System.out.println("Ellipse - move method");
    }
}
