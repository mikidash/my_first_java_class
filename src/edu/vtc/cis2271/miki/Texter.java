package edu.vtc.cis2271.miki;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * Texter - class to demonstrate how to set up 
 * a basic gui application.
 * 
 * This is heavily commented for learning purposes.  Do
 * not really comment code this much!
 * @author Craig A. Damon
 *
 */
@SuppressWarnings("serial")
public class Texter extends JFrame implements WindowListener
{

	/**
	 * constructor for this demonstration class
	 * @param title  the text to put in the title bar of the JFrame
	 * @throws HeadlessException
	 */
	public Texter(String title) throws HeadlessException
	{
		super(title);
		
		// tell the class to use BorderLayout
		setLayout(new BorderLayout());
		
		// create a text area, and put it in the North (top) of the layout
		_text = new JTextArea(1,80);
		add(BorderLayout.NORTH,_text);
		
		// make the center be a JPanel that will draw the mystery object
		add(BorderLayout.CENTER,new DrawMe());
		
		// now create a Box to hold some buttons
		Box buttons = new Box(BoxLayout.X_AXIS);
		buttons.add(Box.createHorizontalGlue());
		
		// once the Box is created, we have to create the buttons to put in it.
		// first the "yes" button
		JButton france = new JButton("France");

		/* this shows how to use the lambda syntax to create an ActionListener
		 * This is the preferred way to do this */
		france.addActionListener(e->_text.setText(_text.getText()+"Positive!"));

		// don't forget to add the "yes" button to the Box we created
		buttons.add(france);
		buttons.add(Box.createHorizontalStrut(15));
		
		// now the "bahamas" button
		JButton bahamas = new JButton("Bahamas");
		
		// this is the older way to create an ActionListener
		bahamas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				_text.setText("Negative today. Try sleeping more!");
			}

		});
		buttons.add(bahamas);
		buttons.add(Box.createHorizontalStrut(15));
		

	
		
		JButton japan = new JButton("Japan");
		
		/* this shows how to use the lambda syntax to create an ActionListener
		 * This is the preferred way to do this */
		japan.addActionListener(e->_text.setText(_text.getText()+"Positive!"));

		// don't forget to add the "yes" button to the Box we created
		buttons.add(japan);
		
		buttons.add(Box.createHorizontalGlue());
		// now that the buttons are created, add them to the south (bottom) of the layout
		add(BorderLayout.SOUTH,buttons);
		
		// doing this lets us look for WindowClosing events, so we can terminate properly
		// see below
		addWindowListener(this);
		
		// and VERY IMPORTANT -- pack() causes the GUI system to calculate where
		// everything goes on the screen
		pack();
	}

	/* 
	 * this class was used to demonstrate one way to
	 * implement an ActionListener -- not actually used above, but
	 * left for historical knowledge
	 */
	@SuppressWarnings("unused")
	private class YesCode implements ActionListener
	{

		/**
		 * @param e
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e)
		{
			_text.setText(_text.getText()+"Positive!");
		}

	}

	private JTextArea _text;


	/** description
	 * @param args
	 */
	public static void main(String[] args)
	{
		Texter w = new Texter("Do something");
		w.setVisible(true);
	}

	
	
	// All these windowXXXX methods allow you to write code that will get
	// called when the events happen.

	/**
	 * @param e
	 * @see java.awt.event.WindowListener#windowOpened(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}


	/**
	 * This is the best way to detect if the window is being
	 * closed
	 * @param e
	 * @see java.awt.event.WindowListener#windowClosing(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);		
	}


	/**
	 * @param e
	 * @see java.awt.event.WindowListener#windowClosed(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}


	/**
	 * @param e
	 * @see java.awt.event.WindowListener#windowIconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}


	/**
	 * @param e
	 * @see java.awt.event.WindowListener#windowDeiconified(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}


	/**
	 * @param e
	 * @see java.awt.event.WindowListener#windowActivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}


	/**
	 * @param e
	 * @see java.awt.event.WindowListener#windowDeactivated(java.awt.event.WindowEvent)
	 */
	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub

	}

}