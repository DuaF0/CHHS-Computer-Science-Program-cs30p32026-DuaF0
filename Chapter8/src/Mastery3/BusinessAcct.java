/*
Program: BusinessAcct.java
Purpose: Creates a business account with minimum balance rules.
Author: Dua Fatima
School: CHHS
Course: CSE3130
*/

package Mastery3;

public class BusinessAcct extends Account
{
	private final double MIN_BAL = 500;

	// Constructor
	public BusinessAcct(double bal, String fName, String lName,String street, String city,String province, String postalCode)
	{
		super(bal, fName, lName, street, city, province, postalCode);
	}

	// Applies service fee if balance is low
	public void checkBalance()
	{
		if(getBalance() < MIN_BAL)
		{
			System.out.println("Business account below minimum balance.");
			withdrawal(10);
		}
	}

	// Displays business account information
	public String toString()
	{
		return "Business Account\n" + super.toString();
	}
}


