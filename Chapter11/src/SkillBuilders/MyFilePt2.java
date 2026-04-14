/*

Program: MyFilePt2.java          Last Date of this Revision: March 6, 2026
Author: Dua Fatima  
School: CHHS
Course: CSE2130
 

*/


package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class MyFilePt2 
{

	public static void main(String[] args) 
	{
		File textFile;
		Scanner input = new Scanner(System.in);
		String response;
		
		textFile = new File("C:\\Users\\68115502\\git\\CHHS-Computer-Science-Program-cs30p32026-DuaF0\\Chapter11\\src\\SkillBuilders\\pt2.txt");
		
		if(textFile.exists())
		{
			System.out.println("zzz.txt file exists.");
		}
		else
		{
			try
			{
				textFile.createNewFile();
				System.out.println("zzz.txt file has been created.");
			}
			catch (IOException e) 
			{
				System.out.println("File could not be created.");
    			System.err.println("IOException: " + e.getMessage());
    		}
		}
		
		//Delete if user chooses
		System.out.println("Would you like to (K)eep or (D)elete the file?");
		response = input.next();
		
		if(response.equalsIgnoreCase("D"))
		{
			if(textFile.delete())
			{
				System.out.println("File has been deleted.");
			}
		}
		else
		{
			System.out.println("File is kept and stays the same");
		}

	}

}


/* 
zzz.txt file exists.
Would you like to (K)eep or (D)elete the file?
K
File is kept and stays the same
 
*/