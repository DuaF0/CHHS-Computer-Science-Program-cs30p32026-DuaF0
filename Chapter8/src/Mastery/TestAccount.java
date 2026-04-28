
/*
Program: TestAccount .java         

Purpose: 

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

public class TestAccount
{
	public static void main(String[] args)
	{
		PersonalAcct p1 = new PersonalAcct(80,"Dua","Fatima","12 Main St","Calgary","Alberta","T3NOG5");

		BusinessAcct b1 = new BusinessAcct(400,"May","Brown","55 Center Ave","Los Angales","Calfornia","T5B456");

		System.out.println(p1);
		System.out.println();

		System.out.println(b1);
		System.out.println();

		p1.checkBalance();
		b1.checkBalance();

		System.out.println("After charges:");
		System.out.println(p1);
		System.out.println();

		System.out.println(b1);
	}
}
