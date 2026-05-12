/*
Program: Customer.java
Purpose: Stores customer personal and address information.
Author: Dua Fatima
School: CHHS
Course: CSE3130
*/

package Mastery3;

import java.util.Scanner;

public class Customer
{
	//first/last name variables
	private String firstName;
	private String lastName;

	//home street etc.
	private String street;
	private String city;
	private String province;
	private String postalCode;

	// Constructor
	public Customer(String fName, String lName,String st, String c,String p, String pc)
	{
		firstName = fName;
		lastName = lName;

		street = st;
		city = c;
		province = p;
		postalCode = pc;
	}

	// Changes street
	public void changeStreet()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter new street: ");
		street = input.nextLine();
	}

	// Changes city
	public void changeCity()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter new city: ");
		city = input.nextLine();
	}

	// Changes province
	public void changeProvince()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter new province: ");
		province = input.nextLine();
	}

	// Changes postal code
	public void changePostalCode()
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter new postal code: ");
		postalCode = input.nextLine();
	}

	// Returns customer information
	public String toString()
	{
		String custString;

		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + province + "\n";
		custString += postalCode + "\n";

		return custString;
	}
}


