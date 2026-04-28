
/*
Program:PersonalAcct .java         

Purpose: 

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

public class PersonalAcct extends Account
{
	private double MIN_BAL = 100;

	public PersonalAcct(double bal, String fName, String lName, String street, String city, String province, String postalCode)
	{
		super(bal, fName, lName, street, city, province, postalCode);
	}

	public void checkBalance()
	{
		if(getBalance() < MIN_BAL)
		{
			withdrawal(2);
		}
	}

	public String toString()
	{
		return "Personal Account\n" + super.toString();
	}
}


