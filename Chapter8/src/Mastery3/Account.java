/*
Program: Account.java
Purpose: Stores general account information and banking actions.
Author: Dua Fatima
School: CHHS
Course: CSE3130
*/

package Mastery3;

import java.text.NumberFormat;

public class Account
{
	private double balance;
	private Customer cust;
	private String acctID;

	// Constructor
	public Account(double bal, String fName, String lName,String street, String city,String province, String postalCode)
	{
		balance = bal;
		cust = new Customer(fName, lName, street,city, province, postalCode);
		acctID = fName.substring(0,1) + lName;
	}

	// Blank account constructor
	public Account(String ID)
	{
		balance = 0;
		cust = new Customer("", "", "","", "", "");
		acctID = ID;
	}

	// Returns account ID
	public String getID()
	{
		return acctID;
	}

	// Returns current balance
	public double getBalance()
	{
		return balance;
	}

	// Deposits money into account
	public void deposit(double amt)
	{
		if (amt > 0)
		{
			balance += amt;
			System.out.println("Deposit successful.");
		}
		
		else
		{
			System.out.println("Invalid deposit amount.");
		}
	}

	// Withdraws money from account
	public void withdrawal(double amt)
	{
		if (amt <= balance)
		{
			balance -= amt;
			System.out.println("Withdrawal successful.");
		}
		
		else
		{
			System.out.println("Not enough money in account.");
		}
	}

	// Change customer address information
	public void changeStreet()
	{
		cust.changeStreet();
	}

	public void changeCity()
	{
		cust.changeCity();
	}

	public void changeProvince()
	{
		cust.changeProvince();
	}

	public void changePostalCode()
	{
		cust.changePostalCode();
	}

	// Checks if two account IDs are the same
	public boolean equals(Object acct)
	{
		Account testAcct = (Account)acct;
		if (acctID.equals(testAcct.acctID))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}

	// Displays account information
	public String toString()
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();

		String accountString;

		accountString = "Account ID: " + acctID + "\n";
		accountString += cust.toString();
		accountString += "Current Balance: " + money.format(balance);

		return accountString;
	}
}



