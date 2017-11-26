
package edu.vtc.cis2271.miki;

/**
 This program computes the time required to double an investment
 */
public class Chap4pg143 {

	
	public static void main(String[] args) 
	{
		final double RATE = 5;
		final double INITIAL_BALANCE = 10000;
		final double TARGET = 2 * INITIAL_BALANCE;
		
		double balance = INITIAL_BALANCE;
		int year = 0;
		
		
		//Count the years required for the investment to double
		
		while (balance  <= TARGET)
				{
			      year++;
			      double interest = balance * RATE / 100;
			      balance = balance + interest;
			      System.out.printf("%4d %10.2f\n",  year, balance);
				}
			
			
	}

}
