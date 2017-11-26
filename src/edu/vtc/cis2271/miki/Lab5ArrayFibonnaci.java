package edu.vtc.cis2271.miki;
import java.util.Scanner;

/**
 * 
 * @author jabari dash
 *
 */
public class Lab5ArrayFibonnaci {

	public static void main(String[] args) {
		//Creating Array 
		Scanner in = new Scanner(System.in);
		System.out.print("What Fibonacci do you want? ");
		
		int length = in.nextInt();
		
		for (int i = 1; i <= length; i++) {
			System.out.print(fib_recursive_2(i) + " ");
		}
		
		System.out.println();
		
		
		in.close();
	}
	
	/**
	 *  Same logic as recursive function, more compact syntax
	 */
	public static int fib_recursive_2(int n) {
		
		return n <= 2 ? 1 : fib_recursive_2(n-1) + fib_recursive_2(n-2);
	}
	
	public static int fib_recursive(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
			
		// f = f1 + f2
		return fib_recursive(n-1) + fib_recursive(n-2);
	}
	
	public static int fib_iterative(int n) {
		int f1 = 1;
		int f2 = 1;
		int f = 1;
				
		if (n == 1 || n == 2) {
			return 1;
		}
		
		for (int i = 2; i < n; i++) {
			f = f1 + f2;
			
			f2 = f1;
			f1 = f;
		}
		
		return f;
	}

}
