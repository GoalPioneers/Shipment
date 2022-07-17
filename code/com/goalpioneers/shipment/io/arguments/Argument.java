package com.goalpioneers.shipment.io.arguments;


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
		
	}
	
	public Argument( String command, String options )
	{
		this.setCommand( command );
		this.setOptions( options );
	}
	
	
	//
	private String command = null;
	
	private String options = null;
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public String getCommand() 
	{
		return command;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getOptions() 
	{
		return options;
	}
	
	/**
	 * 
	 * @param command
	 */
	protected void setCommand(String command) 
	{
		this.command = command;
	}
	
	/**
	 * 
	 * @param option
	 */
	protected void setOptions( String option ) 
	{
		this.options = option;
	}
}
