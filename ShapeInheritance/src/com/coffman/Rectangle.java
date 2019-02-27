/*****************************************************
 *  Created by: Colten Coffman on 12/3/2018          *
 *  COSC 1337.WW1              Grimes Fall '18       *
 *  Rectangle File, which the square class inherits  *
 *****************************************************/
package com.coffman;

public class Rectangle extends Shape
{

    public Rectangle()
    {
        System.out.println("Rectangle - default constructor");
    }
    @Override
    public void draw()
    {
        System.out.println("Rectangle - draw method");
    }

    @Override
    public void erase()
    {
        System.out.println("Rectangle - erase method");
    }

    @Override
    public void move()
    {
        System.out.println("Rectangle - move method");
    }
}
