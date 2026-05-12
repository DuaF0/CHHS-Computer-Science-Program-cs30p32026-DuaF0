/*
Program: TestAccount.java
Purpose: Tests the banking account system using user input.
Author: Dua Fatima
School: CHHS
Course: CSE3130
*/

package Mastery3;

import java.util.Scanner;

public class TestAccount
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int choice;
		
		// Controls program loop
		boolean running = true;
		// Stores current account
		Account account = null;
		
		System.out.println("\n     ---- BANKING LOG ----");
		while (running)
		{
			// Main menu
			System.out.println("\n1. Create Personal Account");
			System.out.println("2. Create Business Account");
			System.out.println("3. Deposit Money");
			System.out.println("4. Withdraw Money");
			System.out.println("5. View Account");
			System.out.println("6. Exit\n");
			System.out.print("Please Enter choice: ");
			
			// Clears scanner buffer
			choice = input.nextInt();
			input.nextLine();
			
			// MENU OPTIONS
			if (choice == 1)
			{
				account = createAccount(input, "personal");
			}
			
			// Create business account
			else if (choice == 2)
			{
				account = createAccount(input, "business");
			}
			
			// Deposit money into account
			else if (choice == 3)
			{
				if (account != null)
				{
					System.out.print("Enter deposit amount: ");
					double amt = input.nextDouble();
					input.nextLine();
					account.deposit(amt);
				}
				else
				{
					System.out.println("No account created yet.");
				}
			}
			
			// Withdraw money from account
			else if (choice == 4)
			{
				if (account != null)
				{
					System.out.print("Enter withdrawal amount: ");
					double amt = input.nextDouble();
					input.nextLine();
					account.withdrawal(amt);
				}
				else
				{
					System.out.println("No account created yet.");
				}
			}
			
			// Displays account information
			else if (choice == 5)
			{
				if (account != null)
				{
					System.out.println("\n--- ACCOUNT INFO ---");
					System.out.println(account);
				}
				else
				{
					System.out.println("No account created yet.");
				}
			}
			
			// Ends program
			else if (choice == 6)
			{
				System.out.println("Exiting Log!");
				running = false;
			}
			
			// Handles invalid menu options
			else
			{
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
	
	// Helper method to create accounts
	public static Account createAccount(Scanner input, String type)
	{
		String fName, lName, street, city, province, postalCode;
		double balance;
		System.out.println("\n|| Creating " + type + " account ||\n ");
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
		
		// Clears scanner buffer
		input.nextLine();
		
		// Creates personal account object
		if (type.equals("personal"))
		{
			return new PersonalAcct(balance, fName, lName, street, city, province, postalCode);
		}
		
		// Creates business account object
		else
		{
			return new BusinessAcct(balance, fName, lName, street, city, province, postalCode);
		}
	}
}

/*
     ---- BANKING LOG ----

1. Create Personal Account
2. Create Business Account
3. Deposit Money
4. Withdraw Money
5. View Account
6. Exit

Please Enter choice: 1

|| Creating personal account ||
 
First Name: Dua
Last Name: Fatima
Street: 54 Skyview Point Link NE
City: Calgary
Province: Alberta
Postal Code: T3N 0G5
Starting Balance: 1123

1. Create Personal Account
2. Create Business Account
3. Deposit Money
4. Withdraw Money
5. View Account
6. Exit

Please Enter choice: 4
Enter withdrawal amount: 12
Withdrawal successful.

1. Create Personal Account
2. Create Business Account
3. Deposit Money
4. Withdraw Money
5. View Account
6. Exit

Please Enter choice: 5

--- ACCOUNT INFO ---
Personal Account
Account ID: DFatima
Dua Fatima
54 Skyview Point Link NE
Calgary, Alberta
T3N 0G5
Current Balance: $1,111.00

*/
