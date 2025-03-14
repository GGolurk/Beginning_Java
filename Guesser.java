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
				System.out.println("Human guesser coming soon");
				correctInput = true;
			} // End if 
			if(userInput.equals("2")){
				System.out.println("Computer Guesser coming soon");
				correctInput = true;
			} // End if 
			if(correctInput == false){
				System.out.println("Sorry, I didn't get that. Please retry, or hit '0' to quit.");
			} // End if 
			playing = false;
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

	} // End human guesser

	public void computerGuesser(){

	} // End computer guesser
} // End class
