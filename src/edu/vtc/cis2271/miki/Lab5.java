package edu.vtc.cis2271.miki;
import java.util.Arrays;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		//Creating Array 
		Scanner in = new Scanner(System.in);
		System.out.println("What Fibonacci do you want?  ");
		int length = in.nextInt();
		int [] fib = new int[length];
		int [] square = new int[length];//create 2nd array of the same length
		int [] max = new int[length];//create 3rd array of the same length;
		fib[0] = 1;
		fib[1] = 1;
		
		for (int i = 2; i <
				fib.length; i++)
		  {
			
			fib[i] = fib[i-1] + fib[i-2];
			
		  }
			
			for(int element:fib)//transverse array and prints each element
			{
				System.out.println(element);
			    System.out.println(",");//transverse array and prints each element using commas
			} 
		 System.out.println(Arrays.toString(fib)); //prints array with commas    
			    
			int sum = 0;
			for(int element:fib)
			{
			   sum = sum + element;
			  
			   
		  }
			 System.out.println("Sum = " +sum);
		for(int i = 0; i < square.length; i++)
		  {
			square[i] = i*i;
		  }
		System.out.println(Arrays.toString(square)); //prints array with commas
		for (int i = 0; i < fib.length; i++)//compares two arrays and puts the largest value into a 3rd array called max
			if (fib[i] >= square[i] )
			{
				max[i] = fib[i];
			}
			else
			{
				max[i] = square[i];
			}
		System.out.println(Arrays.toString(max)); //prints array with commas
		in.close();
		
	}  

}
