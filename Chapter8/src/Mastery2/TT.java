package Mastery2;

import java.util.Scanner;

public class TT
{
	public static void main(String[] args)
	{
	// Specs info
	Scanner input = new Scanner(System.in); double city, hwy, cargo; int seats;
	
	System.out.println("Create a Car");
	
	System.out.print("City MPG: ");
	city = input.nextDouble();
	
	System.out.print("Highway MPG: ");
	hwy = input.nextDouble();
	
	System.out.print("Seating Capacity: ");
	seats = input.nextInt();
	
	System.out.print("Cargo Volume: ");
	cargo = input.nextDouble();
	input.nextLine();
	
	System.out.print("Model Name: ");
	String model = input.nextLine();
	
	// Car info
	Car c1 = new Car(city, hwy, seats, cargo, model); 
	System.out.println("\nCreate a Truck");
	
	System.out.print("City MPG: ");
	city = input.nextDouble();
	
	System.out.print("Highway MPG: ");
	hwy = input.nextDouble();
	
	System.out.print("Seating Capacity: ");
	seats = input.nextInt();
	
	System.out.print("Cargo Volume: ");
	cargo = input.nextDouble();
	
	System.out.print("Towing Capacity: ");
	double towing = input.nextDouble();
	
	// Truck info
	Truck t1 = new Truck(city, hwy, seats, cargo, towing); // Minivan info
	System.out.println("\nCreate a Minivan");
	
	System.out.print("City MPG: ");
	city = input.nextDouble();
	
	System.out.print("Highway MPG: ");
	hwy = input.nextDouble();
	
	System.out.print("Seating Capacity: ");
	seats = input .nextInt();
	
	System.out.print("Cargo Volume: ");
	cargo = input.nextDouble();
	
	System.out.print("Sliding Doors? (true/false): ");
	
	boolean doors = input.nextBoolean();
	MiniVan m1 = new MiniVan(city, hwy, seats, cargo, doors); // Output
	
	System.out.println("\n--- Vehicle Information ---");
	System.out.println(c1);
	System.out.println();
	System.out.println(t1);
	System.out.println();
	System.out.println(m1);
	}
}

/*
 Create a Car
City MPG: 2
Highway MPG: 3
Seating Capacity: 4
Cargo Volume: 5
Model Name: civic

Create a Truck
City MPG: 3
Highway MPG: 4
Seating Capacity: 5
Cargo Volume: 654
Towing Capacity: 1234

Create a Minivan
City MPG: 2
Highway MPG: 3
Seating Capacity: 4
Cargo Volume: 5
Sliding Doors? (true/false): true

--- Vehicle Information ---
Car
Model: civic
City MPG: 2.0
Highway MPG: 3.0
Seating Capacity: 4
Cargo Volume: 5.0

Truck
Towing Capacity: 1234.0
City MPG: 3.0
Highway MPG: 4.0
Seating Capacity: 5
Cargo Volume: 654.0

Minivan
Sliding Doors: true
City MPG: 2.0
Highway MPG: 3.0
Seating Capacity: 4
Cargo Volume: 5.0


 */
