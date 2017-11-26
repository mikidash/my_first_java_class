/**
 * 
 */
package edu.vtc.cis2271.miki;

import java.util.Scanner;

/**
 * @author Miki
 *
 */
public class LineChanger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Type a number");
		String x = in.next();
		try
		{
			int num = Integer.parseInt(x);
			System.out.println(num);			
		}
		 catch (NumberFormatException e)
        {
        	System.out.println("try again");
        }
		finally
        {
        	in.close();
        }
     
		try
		{
			int num = Integer.parseInt(x,2);
			System.out.println(num);					
		}
		 catch (NumberFormatException e)
        {
        	System.out.println("try again");
        }
     
		finally
        {
        	in.close();
        }
		try
		{
			int num = Integer.parseInt(x, 16);
			System.out.println(num);			
		}
		finally
        {
        	in.close();
        }

	}

}
