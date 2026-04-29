/*

Program: TestVehicle.java         

Purpose: tests the Vehicle classes by creating Car, Truck, and Minivan objects and displaying their information using the toString() method.

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/


package Mastery;

import java.util.Scanner;

public class TestVehicle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double city, hwy, cargo, color;
        int seats;

        // Car info
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
        
        System.out.print("Color: ");
        color = input.nextDouble();

        Car c1 = new Car(city, hwy, seats, cargo, model, color);

        // Truck info
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
        

        Truck t1 = new Truck(city, hwy, seats, cargo, towing);

        // Minivan info
        System.out.println("\nCreate a Minivan");

        System.out.print("City MPG: ");
        city = input.nextDouble();

        System.out.print("Highway MPG: ");
        hwy = input.nextDouble();

        System.out.print("Seating Capacity: ");
        seats = input.nextInt();

        System.out.print("Cargo Volume: ");
        cargo = input.nextDouble();

        System.out.print("Sliding Doors? (true/false): ");
        boolean doors = input.nextBoolean();

        MiniVan m1 = new MiniVan(city, hwy, seats, cargo, doors);

        // Output
        System.out.println("\n--- Vehicle Information ---");

        System.out.println(c1);
        System.out.println();

        System.out.println(t1);
        System.out.println();

        System.out.println(m1);
    }
}


