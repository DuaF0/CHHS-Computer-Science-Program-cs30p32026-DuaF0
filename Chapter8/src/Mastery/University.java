/*

Program: University.java         

Purpose: Demonstrates creating and displaying Faculty and Staff objects.

Author: Dua Fatima, 
School: CHHS
Course: CSE3130
*/

package Mastery;

public class University 
{
    public static void main(String[] args) 
    {
    	 // Create Faculty and Staff objects with name, salary, and extra attributes
        Faculty f1 = new Faculty("Dua Fatima", 0, "Computer Science");
        Staff s1 = new Staff("Abdulkadir Abdalla", 90000, "Teacher");
        
        Faculty f2 = new Faculty("Usman Elmi", 0, "Fine Arts");
        Staff s2 = new Staff("I. Burgess", 50000, "Teacher");
        
        Faculty f3 = new Faculty("Eman Abid", 0, "Chemsitry");
        Staff s3 = new Staff("Rebecca Jewers", 100000, "Teacher");

        // Print details of first faculty and staff
        // calls toString() from Faculty
        System.out.println(f1);
        // adds spacing
        System.out.println();
        // calls toString() from Staff
        System.out.println(s1);
        
        System.out.println(f2);
        System.out.println();
        System.out.println(s2);
        
        System.out.println(f3);
        System.out.println();
        System.out.println(s3);
    }
}

/*

Name: Dua Fatima
Salary: $0.0
Department: Computer Science


Name: Abdulkadir Abdalla
Salary: $90000.0
Job Title: Teacher

Name: Usman Elmi
Salary: $0.0
Department: Fine Arts


Name: I. Burgess
Salary: $50000.0
Job Title: Teacher

Name: Eman Abid
Salary: $0.0
Department: Chemsitry


Name: Rebecca Jewers
Salary: $100000.0
Job Title: Teacher

*/