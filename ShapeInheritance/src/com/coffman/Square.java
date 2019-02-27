
/*****************************************************
 *  Created by: Colten Coffman on 12/3/2018          *
 *  COSC 1337.WW1              Grimes Fall '18       *
 *  Square File, which inherits from rectangle       *
 *****************************************************/
package com.coffman;

public class Square extends Rectangle
{

    public Square()
    {
        System.out.println("Square - default constructor");
    }

    @Override
    public void move()
    {
        System.out.println("Square - move method");
    }

    @Override
    public void draw()
    {
        System.out.println("Square - draw method");
    }

    @Override
    public void erase()
    {
        System.out.println("Square - erase method");
    }
}
