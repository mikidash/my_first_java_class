package edu.vtc.cis2271.miki;

public class HomePractMethods {

	public static void main(String[] args) {
		String repeatedString = repeat("ho",3);
		System.out.println(repeatedString);
		Double balance = compound(10000,5,2);
		System.out.println(balance);

	}
	/**This method takes a string and repeats it multiple times
	 * @param str which is the string
	 * @param n the number of repeated times
	 */
	public static String repeat(String str, int n)
	{
	   String result = "";
	   for (int i = 0; i < n; i++)
	   {
	      result = result + str;
	   }
	   return result;
	}
	/**Computes the balance of a bank account with a given initial balance and interest rate, 
	 * after a given number of years.Assumes interest is compounded yearly. `																																																																																																																																																																																																																							`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	 * @param  Initial_Balance which is the initial balance as a floating point number
	 * @param int nYears is the number of years the balance is compounding interest.
	 * @param int rate which is the interest rate paid on the balance each year.
	 * @returns the balance.
	 */
	public static double compound(double Initial_Balance, double rate, int nYears)
	{
	return Initial_Balance*Math.pow((1 + (rate / nYears)), nYears);
		
		
		 
	}


}
