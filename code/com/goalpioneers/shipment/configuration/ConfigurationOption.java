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
		this.setData( 
			new ArrayList<>() 
		);
	}
	
	private List<ConfigurationParameter> data = null;
	
	public List<ConfigurationParameter> getData() 
	{
		return data;
	}
	
	public void setData( List<ConfigurationParameter> data ) 
	{
		this.data = data;
	}
}
