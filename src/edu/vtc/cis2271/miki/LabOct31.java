
package edu.vtc.cis2271.miki;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Miki
 *
 */
public class LabOct31 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException{
		// Prompt for input
		
		Scanner console= new Scanner(System.in);
	    System.out.print("Input file: ");
	    String inputFileName = console.next();
	 
	    // Construct Scanner objects for reading
	    File inputFile = new File(inputFileName);
	    if (inputFile.exists())
	    {
	    	if (inputFile.isFile()) 
			{
				inputFile.getName();
				System.out.println(inputFile.getName() + " is a file ");
				
				
				

				int i = inputFileName.lastIndexOf('.');
				//@SuppressWarnings("unused")
				String extension = "";
				if (i > 0) 
				{
				    extension = inputFileName.substring(i+1);
				    System.out.print(i);
				}
			}
	    	else
	    	{
	    		inputFile.isDirectory();
	    		inputFile.getName();
			    System.out.println(inputFile.getName() + " is a directory ");
	    		
	    	}
	    }
	    else
	    {
	    	System.out.println("File "  + inputFile + " does not exist");
	    }

	console.close();

}
}
