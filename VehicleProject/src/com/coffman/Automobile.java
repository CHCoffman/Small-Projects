/************************************************************
 * Created by Colten Coffman on 12/6/2018                   *
 * COSC 1337.WW1                Grimes 2018                 *
 * Automobile class, from the vehicle class                 *
 ************************************************************/
package com.coffman;

public class Automobile extends Vehicle{
    public int noOfPassengers;
    public double weightInTons;

    public Automobile(String vehicleName, int noOfCylinders, Person owner, int noOfPassengers, double weightInTons)
    {
        super(vehicleName, noOfCylinders, owner);
        this.noOfPassengers = noOfPassengers;
        this.weightInTons = weightInTons;
        System.out.println("Automobile Constructor called");
    }

    public int getNoOfPassengers()
    {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers)
    {
        this.noOfPassengers = noOfPassengers;
    }

    public double getWeightInTons()
    {
        return weightInTons;
    }

    public void setWeightInTons(double weightInTons)
    {
        this.weightInTons = weightInTons;
    }

    @Override
    public String toString()
    {
        return "Automobile{" +
                "noOfPassengers = " + noOfPassengers +
                ", weightInTons = " + weightInTons +
                ", vehicleName = '" + vehicleName + '\'' +
                ", noOfCylinders = " + noOfCylinders +
                ", owner = " + owner +
                '}';
    }

    public void finalize()
    {

    }
}
