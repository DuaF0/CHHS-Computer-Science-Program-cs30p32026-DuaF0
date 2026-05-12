/*
Program: PersonalAcct.java
Purpose: Creates a personal account with minimum balance rules.
Author: Dua Fatima
School: CHHS
Course: CSE3130
*/

package Mastery3;

public class PersonalAcct extends Account
{
	private final double MIN_BAL = 100;

	// Constructor
	public PersonalAcct(double bal, String fName, String lName, String street, String city, String province, String postalCode)
	{
		super(bal, fName, lName, street, city, province, postalCode);
	}

	// Applies fee if balance is below minimum
	public void checkBalance()
	{
		if(getBalance() < MIN_BAL)
		{
			System.out.println("Personal account below minimum balance.");
			withdrawal(2);
		}
	}

	// Displays personal account information
	public String toString()
	{
		return "Personal Account\n" + super.toString();
	}
}


