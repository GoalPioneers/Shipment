/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.components.configuration.options;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class ConfigurationParameter 
{
	/**
	 * 
	 */
	public ConfigurationParameter()
	{
		
	}
	
	
	// Variables
	private String parameter = null;
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public String getParameter() 
	{
		return this.parameter;
	}
	
	/**
	 * 
	 * @param parameter
	 */
	public void setParameter( String parameter ) 
	{
		this.parameter = parameter;
	}
	
	// 
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() 
	{
		return this.parameter;
	}
}
