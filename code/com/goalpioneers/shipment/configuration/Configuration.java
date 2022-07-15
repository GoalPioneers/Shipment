package com.goalpioneers.shipment.configuration;

import java.util.ArrayList;
import java.util.List;

import com.goalpioneers.shipment.configuration.options.ConfigurationOption;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class Configuration 
{
	/**
	 * 
	 */
	public Configuration()
	{
		this.setOptions(
				new ArrayList<>() 
		);
	}
	
	
	// Variables
	private List<ConfigurationOption> options = null;
	
	//
	/**
	 * 
	 * @return
	 */
	public List<ConfigurationOption> getOptions() 
	{
		return options;
	}
	
	
	/**
	 * 
	 * @param options
	 */
	public void setOptions( List<ConfigurationOption> options ) 
	{
		this.options = options;
	}
}
