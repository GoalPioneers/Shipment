package com.goalpioneers.shipment.io.arguments;


/**
 * 
 */
public class Argument 
{
	/**
	 * 
	 */
	public Argument()
	{
		
	}
	
	
	//
	private String line = null;
	
	private String option = null;
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public String getLine() 
	{
		return line;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getOption() 
	{
		return option;
	}
	
	/**
	 * 
	 * @param line
	 */
	public void setLine( String line ) 
	{
		this.line = line;
	}
	
	/**
	 * 
	 * @param option
	 */
	public void setOption( String option ) 
	{
		this.option = option;
	}
}
