/*

Program: Vehicle.java         

Purpose: creates an abstract Vehicle class that stores common vehicle information and provides a base structure for specific vehicle types like Car, Truck, and Minivan.

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

//Abstract Vehicle class used as the parent class for different vehicle types
public abstract class Vehicle
{
	 // Instance variables to store vehicle details
    private double fuelEconomyCity;
    private double fuelEconomyHwy;
    private int seatingCapacity;
    private double cargoVolume;

    // Constructor initializes all vehicle information
    public Vehicle(double city, double hwy, int seats, double cargo)
    {
        fuelEconomyCity = city;
        fuelEconomyHwy = hwy;
        seatingCapacity = seats;
        cargoVolume = cargo;
    }

    // Returns fuel economy for city driving
    public double getFuelEconomyCity()
    {
        return fuelEconomyCity;
    }

    // Returns fuel economy for highway driving
    public double getFuelEconomyHwy()
    {
        return fuelEconomyHwy;
    }

    // Returns number of seats in the vehicle
    public int getSeatingCapacity()
    {
        return seatingCapacity;
    }

    // Returns cargo volume of the vehicle
    public double getCargoVolume()
    {
        return cargoVolume;
    }

    // Abstract method that must be defined in child classes
    // Used to identify the type of vehicle
    public abstract String vehicleType();

    // Returns vehicle information as a formatted string
    public String toString()
    {
        return "City MPG: " + fuelEconomyCity + "\nHighway MPG: " + fuelEconomyHwy + "\nSeating Capacity: " + seatingCapacity + "\nCargo Volume: " + cargoVolume  + " cubic feet.";
    }
}


