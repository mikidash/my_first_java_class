package edu.vtc.cis2271.miki;

public class Lab6printstars {

	public static void main(String[] args) {
		drawHouse(15, 6, 0,  15, 25);
	}
	/** Repeats a given input string
	 * @param n how many stars
	 */
	public static void drawRow(int n)
	{


		for (int i = 0; i < n; i++)
			System.out.print("*");


	}
	public static void drawRow(int n, int displayWidth, int adj)
	{

		if ( adj == -1)
		{
			for (int i = 0; i < n; i++)
				System.out.print("*");
			for (int i = 0; i <displayWidth - n; i++)
				System.out.print(" ");
		}
		else if (adj == 1)
		{
			for (int i = 0; i <displayWidth - n; i++)
				System.out.print(" ");
			for (int i = 0; i < n; i++)
				System.out.print("*");    			
		}	
		else
		{
			for (int i = 0; i < (displayWidth - n) / 2; i++)
				System.out.print(" ");
			for (int i = 0; i < n; i++)
				System.out.print("*");
			for (int i = 0; i < (displayWidth - n) / 2; i++)
				System.out.print(" ");
		}



	}

	public static void drawRow(int n,  boolean filled)
	{


		if (filled)
		{
			for (int i = 0; i < n ; i++)
				System.out.print("*");

		}
		else
		{
			for (int i = 0; i < n; i++)
				if (i == 0 )
				{
					System.out.print("*");
				}
				else if (i == n - 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}

		}
		System.out.println();
	}
	public static void drawBox(int width, int height, int displayWidth)
	{
		
		drawRow(width, displayWidth, 0);
		System.out.println();
		
	
		
		for (int i = 0; i < height - 2; i++)
		{
			for (int j = 0; j < (displayWidth - width)/2; j++)
			{
				System.out.print(" ");	
			}
				
			drawRow(width,  false);
		}
		{
		drawRow(width, displayWidth, 0);
		}
		
	} 
	public static void drawTriangle(int base, int height, int displayWidth,  boolean filled)
	{
		int addStars = ((base - 1) / (height - 1));
		int numStars = 1;
		
		if (filled)
		{
			for (int i = 0; i < height; i++)
			{
				drawRow(numStars, displayWidth, 0);
				numStars = numStars + addStars;
				System.out.println();
			}
			
		
				

		}

	}
	public static void drawHouse(int width, int height, int eaves,  int ceiling, int displayWidth)
	{
		drawTriangle(width, height, displayWidth, true);
		
		for (int i = 0; i< eaves; i++)
		{
			drawRow(eaves);			
		}
		
		drawBox(width, ceiling, displayWidth);
		}
	}






