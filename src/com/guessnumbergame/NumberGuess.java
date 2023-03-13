package com.guessnumbergame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGuess {

	public static void main(String[] args) throws IOException {
		
		// this is main method to take user input guessed number.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\t...Welcome to the Number Guess Game...\n");
		
		System.out.print("Enter Player Name : ");
		String name = br.readLine();
		
		Common obj = new Common();
		
		System.out.println(obj.greetUser(name));
		
		int response = 0;
		while(response != 1)
		{
			System.out.println("\nShall we start?");
			System.out.println("\t1.YES");
			System.out.println("\t2.NO");
			response = Integer.parseInt(br.readLine());
		}
		
		System.out.println("\nYou Will get 5 Chances to Guess the Number");
		System.out.println("If you Guess Then you will else you will Loose");
		System.out.println("If Guess is Wrong we will tell if number is small or big than your guess");
		
		
		int again = 1;
		while(again==1)
		{
			obj.playing();		
			System.out.println("\nWant to Play Again?");
			System.out.println("\t1.YES");
			System.out.println("\t2.NO");
			again = Integer.parseInt(br.readLine());

		}	
		System.exit(0);
	}

}
