/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.shipment.configuration.options;


import java.util.ArrayList;
import java.util.List;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class ConfigurationOption 
{
	/**
	 * 
	 */
	public ConfigurationOption()
	{
		this.setName(
			new ConfigurationLabel() 
		);
		
		this.setParameters( 
			new ArrayList<>() 
		);
	}
	
	
	// Variables
	private ConfigurationLabel name = null;
	
	private List<ConfigurationParameter> parameters = null;
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public ConfigurationLabel getName() 
	{
		return this.name;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<ConfigurationParameter> getParameters() 
	{
		return this.parameters;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName( ConfigurationLabel name ) 
	{
		this.name = name;
	}
	
	/**
	 * 
	 * @param parameters
	 */
	public void setParameters( List<ConfigurationParameter> parameters ) 
	{
		this.parameters = parameters;
	}
	
	
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() 
	{
		return super.toString();
	}
}
