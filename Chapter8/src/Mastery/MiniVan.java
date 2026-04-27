/*

Program: MiniVan.java         

Purpose: creates a Minivan class that inherits common vehicle features from the Vehicle class and adds sliding door information specific to minivans.

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/



package Mastery;

//Minivan class extends the Vehicle class and adds sliding door information
public class MiniVan extends Vehicle
{
	 // Instance variable to store whether the minivan has sliding doors
    private boolean slidingDoors;

    // Constructor initializes inherited Vehicle values
    // and the minivan's sliding door feature
    public MiniVan(double city, double hwy, int seats, double cargo, boolean doors)
    {
        super(city, hwy, seats, cargo);
        slidingDoors = doors;
    }

    // Returns the type of vehicle
    public String vehicleType()
    {
        return "Minivan";
    }

    // Returns minivan information as a formatted string
    // including sliding door details and inherited vehicle details
    public String toString()
    {
        return vehicleType() + "\nSliding Doors: " + slidingDoors + "\n" + super.toString();
    }
}
