/*****************************************************
 *  Created by: Colten Coffman on 12/3/2018          *
 *  COSC 1337.WW1              Grimes Fall '18       *
 *  Triangle File, which the no class inherits       *
 *****************************************************/
package com.coffman;

public class Triangle extends Shape
{

    public Triangle()
    {
        System.out.println("Triangle - default constructor");
    }

    @Override
    public void draw()
    {
        System.out.println("Triangle - draw method");
    }

    @Override
    public void erase()
    {
        System.out.println("Triangle - erase method");
    }

    @Override
    public void move()
    {
        System.out.println("Triangle - move method");
    }
}
