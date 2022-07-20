/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
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
