// CSE 110     : 2020FallA-X-CSE110-75326-76231 
// Assignment  : Assignment04
// Author      : Brandon Billmeyer & 1220167299
// Description : A mastermind game that will loop through counting guesses and correct numbers in position until correct number is selected. 


import java.util.Scanner;

public class Assignment04 {
	public static void main(String[] args) { 
		
		//Initialize scanner
		Scanner scan = new Scanner(System.in);

		//Variables
		String playAnother = "yes";
		final int MAX = 9999;
		final int MIN = 0000;
		int guess = 0;
		String stringGuess = "";

		
	//While the user wants to play another game
	while (playAnother.equals("yes")) {
		
		//Pick a new secret number
		int secret = (int)(Math.random() * ((MAX - MIN) + 1));
		
		//Format secret number to allow leading zeros. 
		String secretNum = String.format("%04d", secret);
		
		//Set guess count to 0 for every new game. 
		int guessCount = 0;
		
		//Display header
		System.out.println("----- MASTERMIND -----");
		System.out.println("Guess the 4 digit number!");

			//While the user's guess is not completely correct
			while (guess != Integer.valueOf(secretNum)){
			
			//Add one to guess count every time prompt is displayed.
			guessCount++;
			
			//declare number correct and reset number every prompt. 
			int numberCorrect = 0;
			
			//Prompt the user to make a guess 
			System.out.println("");
			System.out.print("Guess " + guessCount + ": ");
			
			//User enters a guess as a string to allow leading 0's to be captured without error. 
			stringGuess = scan.next();
			
			//store input string as integer for comparison of the while statement.
			guess = Integer.valueOf(stringGuess);

			//If statements to compare each character for guess and secret numbers.
			//Adds 1 to number correct for each match without giving away which place matched. 
			if(stringGuess.charAt(0) == secretNum.charAt(0)) {
				numberCorrect++;
				}
			if(stringGuess.charAt(1) == secretNum.charAt(1)) {
				numberCorrect++;
				}	
			if(stringGuess.charAt(2) == secretNum.charAt(2)) {
				numberCorrect++;
				}
			if(stringGuess.charAt(3) == secretNum.charAt(3)) {
				numberCorrect++;	
				}
		
			//Display number of correct digits in user's guess
			System.out.println("You matched " + numberCorrect);
			}

			//Congratulate the user and tell them the number of guesses they took
			System.out.println("");
			System.out.println("Congratulations! You guessed the right number in " + guessCount + " guesses.");
			
			//Ask the user if they want to play again 
			System.out.println("Do you want to play again?(yes/no)");
			playAnother = scan.next(); 

	}
	
	//close scanner
	scan.close();
	}

//end of assignment04
}

