package edu.vtc.cis2271.miki;

public class CarCompany 
{


private String name;

public CarCompany(String name)
{
	this.name = name;
	
}
public String getName()
{
	return this.name;
}
public String toString()
{
	return "Name: "+this.name;
}
}