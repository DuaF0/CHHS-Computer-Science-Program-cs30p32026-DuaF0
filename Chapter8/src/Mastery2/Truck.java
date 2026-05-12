/*
Program: Truck.java       
Purpose: This program creates a Truck class that extends the Vehicle class with towing capacity information.
Author: Dua Fatima,
School: CHHS
Course: CSE3130
*/

package Mastery2;

public class Truck extends Vehicle
{
	// Stores towing capacity
	private double towingCapacity;

	// Constructor
	public Truck(double city, double hwy, int seats, double cargo, double tow)
	{

		// Calls Vehicle constructor
		super(city, hwy, seats, cargo);

		// Assigns towing capacity
		towingCapacity = tow;
	}

	// Returns vehicle type
	public String vehicleType()
	{
		return "Truck";
	}

	// Returns truck details
	public String toString()
	{
		return vehicleType() + "\nTowing Capacity: " + towingCapacity + "\n" + super.toString();
	}
}

