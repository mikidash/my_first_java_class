package edu.vtc.cis2271.miki;

import java.util.Scanner;

public class Lab4_part1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int negative = 0;
		while (true) 
			
		{
			System.out.print("Enter another integer number: ");
			int number = in.nextInt();
			if (number < 0)
			{
				negative =+ number;
				break;
			 
			}
			
		
			
			
						
		}
		System.out.println( negative+ " is a negative number");
		in.close();

	}
	
}


