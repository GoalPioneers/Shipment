package com.goalpioneers.shipment.configuration;


import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
public class ConfigurationOption 
{
	/**
	 * 
	 */
	public ConfigurationOption()
	{
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
		return name;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<ConfigurationParameter> getParameters() 
	{
		return parameters;
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
}
