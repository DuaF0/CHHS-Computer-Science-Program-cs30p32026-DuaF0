/*

Program: CountVowels.java         

Purpose: count and display the total number of vowels in a text file specified by the user.

Author: Dua Fatima, 
School: CHHS
Course: CSE2130
*/

package Mastery;
import java.io.*;
import java.util.Scanner;
public class CountVowels
{
  public static void main(String[] args)
  {
      // File object for the text file
      File textFile;
      // FileReader to read characters
      FileReader in;
      // BufferedReader to read lines
      BufferedReader readFile;
      // Name of file entered by user
      String fileName;
      String lineInFile, lowercaseText, letter;
      // Total vowels counter
      int vowelSum = 0;
      Scanner input = new Scanner(System.in);


      // Prompt user for file name
      System.out.print("Enter the name of the file: ");
      fileName = input.nextLine();
     
       //count vowels in file
      try
      {
           // Create file and reader objects
           textFile = new File(fileName);
           // Create file reader
           in = new FileReader(textFile);
           // Create buffered reader for line-by-line reading
           readFile = new BufferedReader(in);


           // Read each line from the file
           while ((lineInFile = readFile.readLine()) != null)
           {
               // Convert line to lowercase
               lowercaseText = lineInFile.toLowerCase();
               // Loop through each character in the line
               for (int i = 0; i < lowercaseText.length(); i++)
               {
                   // Get one letter at a time
                   letter = lowercaseText.substring(i, i + 1);
                   // Check if it's a vowel
                   if (letter.equals("a") || letter.equals("e") ||
                       letter.equals("i") || letter.equals("o") ||
                       letter.equals("u")) {


                       // increase count 1
                       vowelSum++; 
                   }
               }
           }
           //Close BufferedReader
           readFile.close();
           // Close FileReader
           in.close();


           // Output total vowels 1
           System.out.println("Total number of vowels: " + vowelSum);
      }
     
      catch (FileNotFoundException e)
      {
          // Handle missing file
          System.out.println("File not found.");
      }
     
      catch (IOException e)
      {
          // Handle read error
          System.out.println("Error reading file.");
      }
  }
}


/*
 (In File) 
  A quick brown fox jumped over a brown log.

 (Output)
 Enter the name of the file: xxx.txt
 Total number of vowels: 12
 
 */
