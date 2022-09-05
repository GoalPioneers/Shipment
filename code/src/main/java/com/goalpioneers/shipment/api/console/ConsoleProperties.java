package main.java.com.goalpioneers.shipment.api.console;

import java.io.InputStream;
import java.io.PrintStream;

public class ConsoleProperties
{
	public ConsoleProperties()
	{
		this.setIn( System.in );
		this.setOut( System.out );
	}
	
	// Variables
	private InputStream in = null;
	private PrintStream out = null;
	
	
	// Accessors
	public InputStream getIn()
	{
		return this.in;
	}
	
	public PrintStream getOut()
	{
		return this.out;
	}
	
	protected void setIn( InputStream in )
	{
		this.in = in;
	}
	
	protected void setOut( PrintStream out )
	{
		this.out = out;
	}
}
