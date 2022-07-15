package com.goalpioneers.shipment.configuration.options;


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
