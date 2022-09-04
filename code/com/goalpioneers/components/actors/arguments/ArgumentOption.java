/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.components.actors.arguments;

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
