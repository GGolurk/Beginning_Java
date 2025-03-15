// Basic number guesser in Java
// Both human and computer can guess

import java.util.*;

public class Guesser {
	// Data members
	protected boolean playing;

	// Main
	public static void main(String[] args){
		Guesser guess = new Guesser();		
	} // End main

	// Constructor
	Guesser(){
		playing = true;
		String userInput;
		while(playing == true){
			userInput = menu();
			Boolean correctInput = false;
			if(userInput.equals("0")){
				playing = false;
				correctInput = true;
			} // End if 
			if(userInput.equals("1")){
				humanGuesser();
				correctInput = true;
			} // End if 
			if(userInput.equals("2")){
				computerGuesser();
				correctInput = true;
			} // End if 
			if(correctInput == false){
				System.out.println("Sorry, I didn't get that. Please retry, or hit '0' to quit.");
			} // End if 
		} // End while
	} // End constructor

	// Class methods
	public String menu(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 0 to quit, 1 for human guesser, or 2 for computer guesser.");
		String userInput = input.nextLine();
		return userInput;
	} // End menu

	public void humanGuesser(){
		double targetDouble = Math.random();
		targetDouble *= 100;
		int targetNum = (int) targetDouble;
		Integer guesses = 0;
		System.out.println(targetNum);
		Boolean guessing = true;
		while(guessing == true){
			Scanner input = new Scanner(System.in);
			String userInput = input.nextLine();
			try{
				Integer userNum = Integer.parseInt(userInput);
				if(101 > userNum){
					if(userNum > 0){
						
					} // End if
				} // End if
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number.");
			} // End try/catch
			guessing = false;
		} // End while
	} // End human guesser

	public void computerGuesser(){
		Integer guesses = 0;
		// Had to be 1/101 so it guesses from 1-100 rather than 0-99.
		Integer lowEnd = 1;
		Integer highEnd = 101;
		Integer guess = 50;
		Boolean guessing = true;
		while(guessing == true){
			guesses += 1;
			Scanner input = new Scanner(System.in);
			System.out.print("I guess " + guess + ". Is this (H)igh, (L)ow, or (C)orrect?");
			String userInput = input.nextLine();
			Boolean correct = false;
			if(userInput.equals("l")){
				correct = true;
				highEnd = guess;
				guess = lowEnd + (highEnd - lowEnd) / 2;
			} // End if
			if(userInput.equals("h")){
				correct = true;
				lowEnd = guess;
				guess = lowEnd + (highEnd - lowEnd) / 2;
			} // End if
			if(userInput.equals("c")){
				correct = true;
				guessing = false;
				System.out.println("Correct!");
			} // End if
			if(correct == false){
				System.out.println("Sorry, I didn't catch that. Please try again.");
			} // End if
			// Making sure the user can't cheat!
			if(guesses >= 6){
				guessing = false;
				System.out.println("Your number is " + guess);
			}
		} // End while
		System.out.println("");
	} // End computer guesser
} // End class
