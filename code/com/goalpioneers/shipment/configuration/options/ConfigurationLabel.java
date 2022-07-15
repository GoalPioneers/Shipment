package com.goalpioneers.shipment.configuration.options;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class ConfigurationLabel 
{
	// Constructors
	/**
	 * 
	 */
	public ConfigurationLabel()
	{
		
	}
	
	
	// Variables
	private String name = null;
	
	
	// Accessors
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
	 * @param name
	 */
	public void setName( String name ) 
	{
		this.name = name;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return ( this.name == null );
	}
	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() 
	{
		return this.name;
	}
}
