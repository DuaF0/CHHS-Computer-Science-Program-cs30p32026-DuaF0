/*

Program: BusinessAcct.java         

Purpose: 

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

public class BusinessAcct extends Account
{
	private double MIN_BAL = 500;

	public BusinessAcct(double bal, String fName, String lName, String street, String city, String province, String postalCode)
	{
		super(bal, fName, lName, street, city, province, postalCode);
	}

	public void checkBalance()
	{
		if(getBalance() < MIN_BAL)
		{
			withdrawal(10);
		}
	}

	public String toString()
	{
		return "Business Account\n" + super.toString();
	}
}
