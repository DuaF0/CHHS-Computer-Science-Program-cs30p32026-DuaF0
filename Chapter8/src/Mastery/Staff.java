/*

Program: Staff.java         

Purpose: Represents a staff member with a job title, extending UEmployee.

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

//Staff class inherits from UEmployee
public class Staff extends UEmployee
{
	// stores the staff member's job title
    private String jobTitle;

    // Constructor to initialize name, salary, and job title
    public Staff(String n, double s, String j)
    {
    	// calls parent class constructor (UEmployee)
        super(n, s);
        // sets the job title value
        jobTitle = j;
    }

    // Getter method to return the job title
    public String getJobTitle()
    {
        return jobTitle;
    }
    
    // Overrides toString method to include job title informaton
    public String toString()
    {
        return super.toString() + "\nJob Title: " + jobTitle;
    }
}

