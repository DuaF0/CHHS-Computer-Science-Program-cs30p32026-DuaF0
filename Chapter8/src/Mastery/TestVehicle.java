/*

Program: TestVehicle.java         

Purpose: tests the Vehicle classes by creating Car, Truck, and Minivan objects and displaying their information using the toString() method.

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/


package Mastery;

//TestVehicle class is used to create and display different vehicle objects
public class TestVehicle 
{
	    public static void main(String[] args)	    {
	    	// Creates a Car object with city MPG, highway MPG,
	        // seating capacity, cargo volume, and model
	        Car c1 = new Car(16, 23, 4, 8.8, " Nissan GT-R");

	        // Creates a Truck object with city MPG, highway MPG,
	        // seating capacity, cargo volume, and towing capacity
	        Truck t1 = new Truck(23, 26, 5, 45.5, 6000);

	        // Creates a Minivan object with city MPG, highway MPG,
	        // seating capacity, cargo volume, and sliding door feature
	        MiniVan m1 = new MiniVan(9.5, 38, 7, 66, false );

	        // Prints the Car object information
	        System.out.println(c1);
	        System.out.println();

	        // Prints the Truck object information
	        System.out.println(t1);
	        System.out.println();

	        // Prints the Minivan object information
	        System.out.println(m1);
	        System.out.println();
	    }
	}

/*



*/

