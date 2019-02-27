/************************************************************
 * Created by Colten Coffman on 12/6/2018                   *
 * COSC 1337.WW1                Grimes 2018                 *
 * person class                                             *
 ************************************************************/
package com.coffman;

public class Person
{

    String person;

    public Person()
    {
        System.out.println("Person constructor");
    }

    public String getName()
    {
        return person;
    }

    public void setName(String personName)
    {
        this.person = personName;
    }

    public Person(String personName)
    {
        this.person = personName;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "personName ='" + person + '\'' +
                '}';
    }
    public void finalize()
    {

    }
}