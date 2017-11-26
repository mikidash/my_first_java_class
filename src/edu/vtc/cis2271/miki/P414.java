/**
 * 
 */
package edu.vtc.cis2271.miki;

/**
 * @author Miki
 *
 */
import java.util.Scanner;
public class P414 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
			Scanner in = new Scanner(System.in);
	      System.out.println("Enter a number to print in binary: ");
	      int number = in.nextInt();

	      while (number != 0)
	      {
	         System.out.println(number % 2);
	         number = number / 2;
	      }

	     in.close(); 
	}

}
