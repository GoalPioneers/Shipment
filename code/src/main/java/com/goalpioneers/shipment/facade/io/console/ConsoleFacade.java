package main.java.com.goalpioneers.shipment.facade.io.console;

import java.io.InputStream;
import java.io.PrintStream;


public class ConsoleFacade
{
	public ConsoleFacade()
	{
		this.setIn( System.in );
		this.setOut( System.out );
	}
	
	
	// Variables
	private InputStream in = null;
	private PrintStream out = null;
	
	// Codes
	
	void output(String str)
	{
	
	}
	
	// Accessors
	public InputStream getIn()
	{
		return this.in;
	}
	
	public PrintStream getOut()
	{
		return this.out;
	}
	
	public void setIn( InputStream in )
	{
		this.in = in;
	}
	
	public void setOut( PrintStream out )
	{
		this.out = out;
	}
}
