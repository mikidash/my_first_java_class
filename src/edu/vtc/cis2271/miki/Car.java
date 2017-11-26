package edu.vtc.cis2271.miki;
/**
 * Care a sinmple model of a car
 * @author Miki
 *
 */

public class Car 
{
	/**
	 * @param make the make
	 * @param model the model
	 */
	private String make;
	private String model;
	public Car(String CarCompany, String model)
	{
		this.make= CarCompany;
		this.model = model;
	}
	public String getMake()
	{
		return this.make;
	}
	public String getModel()
	{
		return this.model;
	}
	
	 public  int getPassengerCapacity(int numberPassengers)
	 {
		 numberPassengers = 4;
		 return numberPassengers;
	 }
	 public  int getCargoCapacity(int cargoWeight)
	 {
		 return cargoWeight = 250;
	 }
	 public  void loadPassengers(int numPassengers) throws TooManyPassengersException  // put passengers 
	 //in the car, throws exception if beyond capacity
	 {
			if (numPassengers > 4)
				throw new TooManyPassengersException (numPassengers + " is more than 4, perhaps you should consider a bigger car");
			System.out.println("Number of Passengers: " + numPassengers);
	 }
	// unloads all the passengers, returns the number of passengers that were in the car before unloading
    public int unloadPassengers() 
    {
    	return numberPassengers;
    	
    }
	public String toString()
	{
		return "Make: "+this.make + "  (this.model)";
	}
}
