/*
Program: Car.java       
Purpose: This program creates a Car class that extends the Vehicle class with a model name.
Author: Dua Fatima,
School: CHHS
Course: CSE3130
*/

package Mastery2;

public class Car extends Vehicle
{
   // Stores model name
   private String modelName;

   // Constructor
   public Car(double city, double hwy, int seats, double cargo, String model)
   {
       // Calls Vehicle constructor
       super(city, hwy, seats, cargo);

       // Assigns model name
       modelName = model;
   }

   // Returns vehicle type
   public String vehicleType()
   {
       return "Car";
   }

   // Returns car details
   public String toString()
   {
       return vehicleType() + "\nModel: " + modelName + "\n" + super.toString();
   }
}



