/**
 * 
 */
package edu.vtc.cis2271.miki;

/**
 * @author Miki
 *Exception for tooManyPassengers
 */
@SuppressWarnings("serial")
public class TooManyPassengersException extends Exception
{
	
	/**
	 * No argument constructor
	 */
	public TooManyPassengersException()
	{
		super();
	}
	/**
	 * Constructor that allows a message to be includes
	 * @param message
	 */
	public TooManyPassengersException(String message)
	{
		super(message);
	}

}
