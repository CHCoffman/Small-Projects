/************************************************************
 * Created by Colten Coffman on 12/6/2018                   *
 * COSC 1337.WW1                Grimes 2018                 *
 * This program sets vehicle stats through several classes  *
 * such as automobile and truck, each with different        *
 * parameters in each.                                      *
 ************************************************************/
package com.coffman;

public class VehicleDriver
{

    public static void main(String[] args)
    {
        Person person = new Person("John");
        Person personTwo = new Person("Bob");
        Person personThree = new Person("Tony");

        Vehicle vehicle = new Vehicle("Honda", 4, person);
        Truck truck = new Truck("Ford", 8, personThree, 5.5, 10.5);
        Automobile automobile = new Automobile("Toyota", 6, personTwo, 4, 2.5);

        System.out.println(vehicle);
        System.out.println(truck);
        System.out.println(automobile);
    }
    public void finalize()
    {

    }
}
