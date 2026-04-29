/*

Program: car.java         

Purpose: creates a Car class that inherits common vehicle features from the Vehicle class and adds model information specific to cars.

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/


package Mastery;

//Car class extends the Vehicle class and adds model information
public class Car extends Vehicle
{
    private String model;

    // Constructor
    public Car(double city, double hwy, int seats, double cargo, String m, double color)
    {
        super(city, hwy, seats, cargo);
        model = m;
    }

    // Returns the type of vehicle
    public String vehicleType()
    {
        return "Car";
    }

    // Returns car information as a formatted string
    // including model details and inherited vehicle details
    public String toString()
    {
        return vehicleType() + "\nModel: " + model + "\n" + super.toString();
    }
}

