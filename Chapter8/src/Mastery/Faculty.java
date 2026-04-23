/*

Program: Faculty.java         

Purpose: Represents a faculty member with a department, extending UEmployee.

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

//Faculty class inherits from UEmployee
public class Faculty extends UEmployee
{
	// stores the faculty member's department
    private String department;

    // Constructor to initialize name, salary, and department
    public Faculty(String n, double s, String d)
    {
    	// calls parent class constructor (UEmployee)
        super(n, s);
        // sets the department value
        department = d;
    }

    // Getter method to return the department
    public String getDepartment()
    {
        return department;
    }

    // Overrides toString method to include department information
    public String toString()
    {
        return super.toString() + "\nDepartment: " + department;
    }
}

