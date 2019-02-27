/*****************************************************
 *  Created by: Colten Coffman on 12/3/2018          *
 *  COSC 1337.WW1              Grimes Fall '18       *
 *  Shape File, which all other classes inherit from *
 *****************************************************/
package com.coffman;

public class Shape
{

    public Shape()
    {
        System.out.println("Shape - default constructor");
    }

    public void draw()
    {
        System.out.println("Shape - draw method");
    }
    public void move()
    {
        System.out.println("Shape - move method");
    }
    public void erase()
    {
        System.out.println("Shape - erase method");
    }
}
