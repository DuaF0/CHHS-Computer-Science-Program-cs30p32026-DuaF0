/*
Program: MiniVan.java       
Purpose: This program creates a MiniVan class that extends the Vehicle class with sliding door information.
Author: Dua Fatima,
School: CHHS
Course: CSE3130
*/
package Mastery2;

public class MiniVan extends Vehicle
{
	// Stores sliding door value
	private boolean slidingDoors;
	
	// Constructor
	public MiniVan(double city, double hwy, int seats, double cargo, boolean doors)
	{
		// Calls Vehicle constructor
		super(city, hwy, seats, cargo);

		// Assigns sliding door value
		slidingDoors = doors;
	}

	// Returns vehicle type
	public String vehicleType()
	{
		return "Minivan";
	}

	// Returns minivan details
	public String toString()
	{
		return vehicleType() + "\nSliding Doors: " + slidingDoors + "\n" + super.toString();
	}
}
