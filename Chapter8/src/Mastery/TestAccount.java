
/*
Program: TestAccount .java         

Purpose: 

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

import java.util.Scanner;

public class TestAccount
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String fName, lName, street, city, province, postalCode;
		double balance;

		// Personal Account
		System.out.println("Create Personal Account");

		System.out.print("First Name: ");
		fName = input.nextLine();

		System.out.print("Last Name: ");
		lName = input.nextLine();

		System.out.print("Street: ");
		street = input.nextLine();

		System.out.print("City: ");
		city = input.nextLine();

		System.out.print("Province: ");
		province = input.nextLine();

		System.out.print("Postal Code: ");
		postalCode = input.nextLine();

		System.out.print("Starting Balance: ");
		balance = input.nextDouble();
		input.nextLine();

		PersonalAcct p1 = new PersonalAcct(
				balance, fName, lName,
				street, city, province, postalCode);

		// Business Account
		System.out.println("\nCreate Business Account");

		System.out.print("First Name: ");
		fName = input.nextLine();

		System.out.print("Last Name: ");
		lName = input.nextLine();

		System.out.print("Street: ");
		street = input.nextLine();

		System.out.print("City: ");
		city = input.nextLine();

		System.out.print("Province: ");
		province = input.nextLine();

		System.out.print("Postal Code: ");
		postalCode = input.nextLine();

		System.out.print("Starting Balance: ");
		balance = input.nextDouble();

		BusinessAcct b1 = new BusinessAcct(
				balance, fName, lName,
				street, city, province, postalCode);

		// Apply fees
		p1.checkBalance();
		b1.checkBalance();

		// Output
		System.out.println("\n--- Account Information ---");
		System.out.println(p1);
		System.out.println();
		System.out.println(b1);
	}
}


