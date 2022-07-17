package com.goalpioneers.shipment.actors.arguments;


import java.util.ArrayList;
import java.util.List;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class Argument 
{
	/**
	 * 
	 */
	public Argument()
	{
		this(null, 
			  new ArrayList<>() );
	}
	
	public Argument( String command, List<ArgumentOption> options )
	{
		this.setCommand( command );
		
		this.setOptions(
			options
		);
	}
	
	
	// Variables
	/**
	 * The command to be executed
	 */
	private String command = null;
	
	/**
	 * the 
	 */
	private List<ArgumentOption> options = null;
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public String getCommand() 
	{
		return this.command;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<ArgumentOption> getOptions() 
	{
		return this.options;
	}
	
	/**
	 * 
	 * @param command
	 */
	protected void setCommand( String command ) 
	{
		this.command = command;
	}
	
	/**
	 * 
	 * @param options
	 */
	protected void setOptions( List<ArgumentOption> options ) 
	{
		this.options = options;
	}
}
