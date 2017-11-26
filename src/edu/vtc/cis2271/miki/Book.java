/**
 * 
 */
package edu.vtc.cis2271.miki;

/**This is a class collects books
 * @author Miki
 *@param x is the title of the book
 *@param y is the year the book was published
 */
public class Book {
	private String title;
	private int year;
	private String author;
	public Book(String title, String author, int year)
	{
		this.title = title;
		this.author = author;
		this.year = year;
	}
	public String getTitle()
	{
		return this.title;
	}
	
	public int getYear()
	{
		return this.year;
	}
	public String getAuthor()
	{
		return this.author;
	}
	public String toString()
	{
		return "Title: "+this.title + "  (this.year)";
	}


	public void displayWorks()
	{
		System.out.println(this.author + this.title);
	}
}
private class Author {
	private String author;
	public Author (String author)
	{

		this.author = author;
	}
}	