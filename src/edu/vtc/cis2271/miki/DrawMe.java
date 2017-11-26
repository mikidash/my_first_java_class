package edu.vtc.cis2271.miki;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
/**
 * DrawMe - a class to draw a mystery object in a JPanel
 * @author Miki
 *
 */
@SuppressWarnings("serial")
public class DrawMe  extends JPanel
{
	  /**
	 * zero argument constructor for the DrawMe class
	 * does all the basic setup for the drawing within
	 * the JPanel
	 */
	public DrawMe()
	  {
		   setMinimumSize(new Dimension(500,300));
		   setPreferredSize(new Dimension(500,300));
		   setBorder(new LineBorder(Color.BLUE,10));
		   setBackground(Color.LIGHT_GRAY);
	  }
	  
	/**
	 * the local paintComponent method.  This is called each time
	 * the JPanel needs to be redrawn.  Ideally, this should use
	 * this.getHeight() and this.getWidth() to determine the size
	 * of the JPanel, and calculate the appropriate location/size of 
	 * the elements being drawn.  I've added a couple of sample calls
	 * below (although the variables are unused).
	 * 
	 * Notice that all the drawing methods are on the Graphics element
	 * that is passed into this method.
	 * 
	 */
	  @Override
	  public void paintComponent(Graphics g)
	  {
	  	  super.paintComponent(g);
	  	  g.setColor(Color.WHITE);
	  	  g.fillOval(225,30,50,50);
	  	  g.fillOval(210,80,80,80);
	  	  g.fillOval(200,160,100,100);
	  	  g.setColor(Color.BLACK);
	  	  g.fillOval(235,50,10,10);
	  	  g.fillOval(255,50,10,10);
	  	  int pHeight = this.getHeight();
	  	  int pWidth = this.getWidth();
	 }

}
