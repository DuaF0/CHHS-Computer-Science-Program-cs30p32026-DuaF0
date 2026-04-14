
/*

Program: WordGuess.java         

Purpose: let the user play a word-guessing game by guessing letters until they reveal the secret word stored in a file.


Author: Dua Fatima, 
School: CHHS
Course: CSE2130

*/
package Mastery;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class WordGuess
{
	// special character to quit the game
	final static String FLAG = "!";
	public static void main(String[] args)
	{
		// Create a File object for the word list
		File file = new File("w.txt");


		// Declare file reader and buffered reader
		FileReader fr;
		BufferedReader br;


		// Random number generator for selecting a word 
		Random random = new Random();


		int numWords = 0, wordToGuess;
        // the word to guess
		String secretWord = "";
        // dashed version of the word and updated after guesses
		String wordSoFar = "", updatedWord = "";
		String letterGuess;
                     // count of user guesses
		int numGuesses = 0;


		//select seceret word from file
		try
		{
			// Initialize FileReader and BufferedReader
			fr = new FileReader(file);
			br = new BufferedReader(fr);


			// Count number of words in file
			String line;
			while ((line = br.readLine()) != null)
			{
				numWords++;
			}


			br.close();
			fr.close();


			// Pick random word index
			wordToGuess = random.nextInt(numWords);


			// Re-open file to get the selected word
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			for (int i = 0; i <= wordToGuess; i++)
			{
				secretWord = br.readLine();
			}
			br.close();
			fr.close();
		}
		
		catch (FileNotFoundException e)
		{
            // handle missing file
			System.out.println("File cannot be found.");
			return;
		}
		
		catch (IOException e)
		{
            // handle reading errors
			System.out.println("Error trying to read file.");
			return;
		}


		//begin game
		System.out.println("       \n         WordGuess game.\n");


		// Create dashed version of the word
		for (int i = 0; i < secretWord.length(); i++)
		{
                           
			// replace letters with dashes
			wordSoFar += "_";
		}


		System.out.println("Word: " + wordSoFar);


		// Scanner for user input
		Scanner input = new Scanner(System.in);


		//game loop
		do
		{
			System.out.print("Guess a letter (or ! to quit): ");
			letterGuess = input.nextLine();


			// Increase guess count
			numGuesses++;
			updatedWord = "";


			// Check each letter in secret word
			for (int i = 0; i < secretWord.length(); i++)
			{
				if (secretWord.substring(i, i + 1).equals(letterGuess))
				{
					// Correct guess to reveal letter
					updatedWord += letterGuess;
				}
				
				else
				{
					// Keep previous character
					updatedWord += wordSoFar.substring(i, i + 1);
				}
			}


			// Update displayed word
			wordSoFar = updatedWord;
			System.out.println("Word: " + wordSoFar);
		}
		
		while (!letterGuess.equals(FLAG) && !wordSoFar.equals(secretWord));


		//End Game
		if (wordSoFar.equals(secretWord))
		{
			System.out.println("You guessed the word!");
		}
		
		else
		{
			System.out.println("Game ended.");
		}
		System.out.println("The word was: " + secretWord);
		System.out.println("Number of guesses: " + numGuesses);
	}
}

/*
WordGuess game.

Word: __________
Guess a letter (or ! to quit): C
Word: __________
Guess a letter (or ! to quit): W
Word: W_________
Guess a letter (or ! to quit): a
Word: Wa________
Guess a letter (or ! to quit): !
Word: Wa________
Game ended.
The word was: Watermelon
Number of guesses: 4

*/
