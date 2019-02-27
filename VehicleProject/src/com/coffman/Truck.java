/************************************************************
 * Created by Colten Coffman on 12/6/2018                   *
 * COSC 1337.WW1                Grimes 2018                 *
 * Truck class, from the vehicle class                      *
 ************************************************************/
package com.coffman;

public class Truck extends Vehicle
{
   public double loadCapacity;
   public double towingCapacity;

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public Truck(String vehicleName, int noOfCylinders, Person owner, double loadCapacity, double towingCapacity)
    {
        super(vehicleName, noOfCylinders, owner);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
        System.out.println("Truck Constructor called");
    }

    @Override
    public String toString()
    {
        return "Truck{" +
                "loadCapacity= " + loadCapacity +
                ", towingCapacity= " + towingCapacity +
                ", vehicleName= '" + vehicleName + '\'' +
                ", noOfCylinders= " + noOfCylinders +
                ", owner= " + owner +
                '}';
    }

    public void finalize()
    {

    }
}
