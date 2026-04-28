
/*

Program: Customer.java         

Purpose: 

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

	//Customer class.
	import java.util.Scanner;

	public class Customer 
	{
		private String firstName, lastName;
		private String street, city, province, postalCode;

		// constructor pre: none post: A Customer object has been created.
		public Customer(String fName, String lName, String st, String c, String p, String pc)
		{
			firstName = fName;
			lastName = lName;
			street = st;
			city = c;
			province = p;
			postalCode = pc;
		}

		// change city
		public void changeCity()
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter new city: ");
			city = input.nextLine();
		}

		// change street
		public void changeStreet()
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter new street: ");
			street = input.nextLine();
		}

		// change province
		public void changeProvince()
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter new province: ");
			province = input.nextLine();
		}

		// change postal code
		public void changePostalCode()
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter new postal code: ");
			postalCode = input.nextLine();
		}

		public String toString()
		{
			String custString;

			custString = firstName + " " + lastName + "\n";
			custString += street + "\n";
			custString += city + ", " + province + "\n";
			custString += postalCode + "\n";

		 	return(custString);
		}
	}



