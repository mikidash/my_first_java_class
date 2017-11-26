package edu.vtc.cis2271.miki;
import java.util.Scanner;
public class Lab3_part {

	public static void main(String[] args) {
		System.out.print("What is the Temp");
		Scanner in = new Scanner(System.in);
		
			String temp = in.nextString();
			String last = temp.substring(temp.length() - 1);
			if  (( last != "C") || (last != "F"))
			{
				System.out.println("This is not in C or F temperature");
			}
			else 
		    double celsius = in.nextDouble();
			double farenheit = 1.8*celsius + 32;
			System.out.println("Celsius = "+celsius);
			System.out.println("Farenheit = "+farenheit);
			
			
		in.close();	
		

	}

}
