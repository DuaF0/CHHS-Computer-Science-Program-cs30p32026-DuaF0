/*

Program: UEmployee.java         

Purpose:  Represents a general employee with name and salary.

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

//Base class for all university employees
public class UEmployee 
{
	// stores employee's name
    private String name;
    // stores employee's salary
    private double salary;

    // Constructor
    public UEmployee(String n, double s)
    {
    	// sets the name
        name = n;
        // sets the salary
        salary = s;
    }

    // Getter method to return the name
    public String getName()
    {
        return name;
    }
    
    // Getter method to return the salary
    public double getSalary()
    {
        return salary;
    }
 
    // Returns a formatted string of employee details
    public String toString()
    {
        return "\nName: " + name + "\nSalary: $" + salary;
    }
}

