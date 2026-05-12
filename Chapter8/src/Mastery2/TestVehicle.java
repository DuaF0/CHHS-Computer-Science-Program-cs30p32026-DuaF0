/*
Program: TestVehicle.java       
Purpose: This program allows users to create, store, and display different types of vehicles using a menu system.
Author: Dua Fatima,
School: CHHS
Course: CSE3130
*/

package Mastery2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestVehicle
{
    // Main method
	public static void main(String[] args)
	{
		// Creates Scanner object
		Scanner input = new Scanner(System.in);

		// Stores vehicle objects
		ArrayList<Vehicle> vehicles = new ArrayList<>();

		// Stores user menu choice
		int choice = 0;

		// Runs menu until user exits
		while (choice != 5)
		{
			// Displays menu
			System.out.println("\n ------ Vehicle Menu ------\n");
			System.out.println("1. Add Car");
			System.out.println("2. Add Truck");
			System.out.println("3. Add Minivan");
			System.out.println("4. View All Vehicles");
			System.out.println("5. Exit\n");

			// Prompts for choice
			System.out.print("Enter your choice: ");
			choice = input.nextInt();

			// Adds a car
			if (choice == 1)
			{
				// Displays heading
				System.out.println("\n ||Create a Car|| \n");

				// Gets city MPG
				System.out.print("City MPG: ");
				double city = input.nextDouble();

				// Gets highway MPG
				System.out.print("Highway MPG: ");
				double hwy = input.nextDouble();

				// Gets seating capacity
				System.out.print("Seating Capacity: ");
				int seats = input.nextInt();

				// Gets cargo volume
				System.out.print("Cargo Volume: ");
				double cargo = input.nextDouble();

				// Clears input buffer
				input.nextLine();

				// Gets model name
				System.out.print("Model Name: ");
				String model = input.nextLine();

				// Creates Car object
				Car c = new Car(city, hwy, seats, cargo, model);
	
				// Adds car to list
				vehicles.add(c);

				// Confirmation message
				System.out.println("Car added successfully!");
			}

			// Adds a truck
			else if (choice == 2)
			{
				// Displays heading
				System.out.println("\n {Create a Truck} \n");

				// Gets city MPG
				System.out.print("City MPG: ");
				double city = input.nextDouble();

				// Gets highway MPG
				System.out.print("Highway MPG: ");
				double hwy = input.nextDouble();

				// Gets seating capacity
				System.out.print("Seating Capacity: ");
				int seats = input.nextInt();

				// Gets cargo volume
				System.out.print("Cargo Volume: ");
				double cargo = input.nextDouble();

				// Gets towing capacity
				System.out.print("Towing Capacity: ");
				double towing = input.nextDouble();

				// Creates Truck object
				Truck t = new Truck(city, hwy, seats, cargo, towing);

				// Adds truck to list
				vehicles.add(t);

				// Confirmation message
				System.out.println("Truck added successfully!");
			}


			// Adds a minivan
			else if (choice == 3)
			{
				// Displays heading
				System.out.println("\n +Create a Minivan+ \n");

				// Gets city MPG
				System.out.print("City MPG: ");
				double city = input.nextDouble();

				// Gets highway MPG
				System.out.print("Highway MPG: ");
				double hwy = input.nextDouble();

				// Gets seating capacity
				System.out.print("Seating Capacity: ");
				int seats = input.nextInt();

				// Gets cargo volume
				System.out.print("Cargo Volume: ");
				double cargo = input.nextDouble();

				// Gets sliding door value
				System.out.print("Sliding Doors? (true/false): ");
				boolean doors = input.nextBoolean();

				// Creates MiniVan object
				MiniVan m = new MiniVan(city, hwy, seats, cargo, doors);

				// Adds minivan to list
				vehicles.add(m);

				// Confirmation message
				System.out.println("Minivan added successfully!");
			}

			// Displays all vehicles
			else if (choice == 4)
			{
				// Displays heading
				System.out.println("\n ------ Vehicle List ------");


				// Checks if list is empty
				if (vehicles.size() == 0)
				{
					System.out.println("\n No vehicles added yet.");
				}
				
				else
				{
					// Loops through vehicle list
					for (Vehicle v : vehicles)
					{
						// Displays vehicle type
						System.out.println("\n" + v.vehicleType());

						// Displays vehicle details
						System.out.println(v);
					}
				}
			}

			// Exits program
			else if (choice == 5)
			{
				System.out.println("Closing Menu!");
			}

			// Handles invalid input
			else
			{
				System.out.println("Invalid choice. Try again.");
			}
		}


// Closes Scanner
input.close();
}
}


/*
------ Vehicle Menu ------
1. Add Car
2. Add Truck
3. Add Minivan
4. View All Vehicles
5. Exit
Enter your choice: 1
    ||Create a Car||
City MPG: 3.0
Highway MPG: 23
Seating Capacity: 3
Cargo Volume: 3456
Model Name: civic
Car added successfully!
------ Vehicle Menu ------
1. Add Car
2. Add Truck
3. Add Minivan
4. View All Vehicles
5. Exit
Enter your choice: 4
---- Vehicle List ----
Car
Car
Model: civic
City MPG: 3.0
Highway MPG: 23.0
Seating Capacity: 3
Cargo Volume: 3456.0
------ Vehicle Menu ------
1. Add Car
2. Add Truck
3. Add Minivan
4. View All Vehicles
5. Exit
Enter your choice: 5
Closing Menu!
*/


