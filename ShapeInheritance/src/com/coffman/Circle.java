/*****************************************************
 *  Created by: Colten Coffman on 12/3/2018          *
 *  COSC 1337.WW1              Grimes Fall '18       *
 *  Circle File, which inherits the ellipse file     *
 *****************************************************/
package com.coffman;

public class Circle extends Ellipse
{

    public Circle()
    {
        System.out.println("Circle - default constructor");
    }

    @Override
    public void move()
    {
        System.out.println("Circle - move method ");
    }

    @Override
    public void draw()
    {
        System.out.println("Circle - draw method");
    }

    @Override
    public void erase()
    {
        System.out.println("Circle - erase method");
    }
}
