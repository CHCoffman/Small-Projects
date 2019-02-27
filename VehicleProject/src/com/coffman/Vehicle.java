/************************************************************
 * Created by Colten Coffman on 12/6/2018                   *
 * COSC 1337.WW1                Grimes 2018                 *
 * Original vehicle class                                   *
 ************************************************************/
package com.coffman;

public class Vehicle implements Cloneable
{
     String vehicleName;
     int noOfCylinders;
     Person owner;

    public String getVehicleName()
    {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName)
    {
        this.vehicleName = vehicleName;
    }

    public int getNoOfCylinders()
    {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders)
    {
        this.noOfCylinders = noOfCylinders;
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }
    public Vehicle()
    {

    }
    public Vehicle(String vehicleName, int noOfCylinders, Person owner)
    {
        this.vehicleName = vehicleName;
        this.noOfCylinders = noOfCylinders;
        this.owner = owner;
        System.out.println("Default constructor called");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName = '" + vehicleName + '\'' +
                ", noOfCylinders = " + noOfCylinders +
                ", owner = " + owner +
                '}';
    }

    public void finalize()
    {

    }
}
