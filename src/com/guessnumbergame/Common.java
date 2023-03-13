package com.guessnumbergame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.Random;

public class Common {

	// this method will generate a random number and loop 5 time to guess that number if number is correct then it will break else continue
	public void playing() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\nAll The Best Buddy...Here we go...");
		
		Random random = new Random();
		int rn = random.nextInt(21);
		
		int flag = 0;
		for (int i = 1; i <= 5 ; i++) 
		{
			int guess;
			System.out.println("Enter "+i+"th Guess : ");
			guess = Integer.parseInt(br.readLine());
			if(guess == rn)
			{
				System.out.println("Congratulations...you win in "+ i +" Chances.");
				System.out.println("The Number Was = " + rn);
				flag = 1;
				break;
			}
			else if(rn < guess)
			{
				System.out.println("Guess Lower Number...");
			}
			else if(rn > guess)
			{
				System.out.println("Guess Greater Number...");
			}
		}
		
		if(flag == 0)
		{
			System.out.println("You Loose...Better Luck Next Time...");
			System.out.println("The Number Was = " + rn);
		}

	}
	
	public String greetUser(String name) 
	{
		String greet = null;
		
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		
		if(hour < 12)
		{
			greet = "Good Morning " + name; 
		}
		else if(hour>12 && hour < 5)
		{
			greet = "Good AfterNoon " + name;
		}
		else if(hour > 5)
		{
			greet = "Good Evening " + name;
		}
		
		return greet;
	}



}