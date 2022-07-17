package com.goalpioneers.shipment.io.arguments;

public class ArgumentOption 
{
	// Variables
	private String name = null;
	private String value = null;
	
	/**
	 * 
	 * @return
	 */
	public String getName() 
	{
		return this.name;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getValue() 
	{
		return this.value;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName( String name ) 
	{
		this.name = name;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void setValue( String value )  
	{
		this.value = value;
	}
}
