package edu.vtc.cis2271.miki;

import java.util.Scanner;

public class Lab4Part2Prime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int input;
		boolean isPrime = true;
		for (int i = 2; i % 2 == 0; i++) 
			
		{
			System.out.print("Enter another integer number: ");
			int number = in.nextInt();
			for (int i = 2; i % 2 == 0; i++) 
			{
				isPrime = false;
				input =+ number;
				break;
			 
			}
			
			if( number / i == 0 )
			{
				input =+ number;
				break;	
			}
			
		
			
			
						
		}
		System.out.println( input+ " is not a prime number");
		in.close();

	}

}
