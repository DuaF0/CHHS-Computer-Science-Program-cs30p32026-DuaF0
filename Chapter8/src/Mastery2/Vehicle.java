/*
Program: Vehicle.java       
Purpose:This program creates an abstract Vehicle class with common vehicle properties and methods.
Author: Dua Fatima,
School: CHHS
Course: CSE3130
*/

package Mastery2;

public abstract class Vehicle
{
   // Stores city fuel economy
   private double fuelEconomyCity;
   // Stores highway fuel economy
   private double fuelEconomyHwy;
   // Stores seating capacity
   private int seatingCapacity;
   // Stores cargo volume
   private double cargoVolume;
   
   // Constructor
   public Vehicle(double city, double hwy, int seats, double cargo)
   {
       // Assign highway, city fuel economy, seating capacity, and cargo volume
       fuelEconomyCity = city;
       fuelEconomyHwy = hwy;
       seatingCapacity = seats;
       cargoVolume = cargo;
   }
   
   // Returns city fuel economy
   public double getFuelEconomyCity()
   {
       return fuelEconomyCity;
   }

  // Returns highway fuel economy
   public double getFuelEconomyHwy()
   {
       return fuelEconomyHwy;
   }

   // Returns seating capacity
   public int getSeatingCapacity()
   {
       return seatingCapacity;
   }

   // Returns cargo volume
   public double getCargoVolume()
   {
       return cargoVolume;
   }
   
   // Abstract method for vehicle type
   public abstract String vehicleType();
   
   public String toString()
   {
       // Returns vehicle details
       return "City MPG: " + fuelEconomyCity + "\nHighway MPG: " + fuelEconomyHwy + "\nSeating Capacity: " + seatingCapacity + "\nCargo Volume: " + cargoVolume;
   }
}


