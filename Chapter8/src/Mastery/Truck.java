/*

Program: Truck.java         

Purpose: creates a Truck class that inherits common vehicle features from the Vehicle class and adds towing capacity specific to trucks.

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

//Truck class extends the Vehicle class and adds towing capacity
public class Truck extends Vehicle
{
	// Instance variable to store towing capacity
    private double towingCapacity;

    // Constructor initializes inherited Vehicle values
    // and the truck's towing capacity
    public Truck(double city, double hwy, int seats, double cargo, double tow)
    {
        super(city, hwy, seats, cargo);
        towingCapacity = tow;
    }

    // Returns the type of vehicle
    public String vehicleType()
    {
        return "Truck";
    }

    // Returns truck information as a formatted string
    // including towing capacity and inherited vehicle details
    public String toString()
    {
        return vehicleType() + "\nTowing Capacity: " + towingCapacity + "\n" + super.toString();
    }
}

