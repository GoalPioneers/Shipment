/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.components.configuration;


import java.util.ArrayList;
import java.util.List;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public class Registry 
{
	/**
	 * 
	 */
	public Registry()
	{
		if( getConfigurations() == null )
		{
			setConfigurations( 
					new ArrayList<>() 
			);
		}
	}
	
	//
	private static List<Configuration> configurations = null;
	
	//
	/**
	 * 
	 * @return
	 */
	public static List<Configuration> getConfigurations() 
	{
		return configurations;
	}
	
	/**
	 * 
	 * @param configurations
	 */
	public static void setConfigurations( List<Configuration> configurations ) 
	{
		Registry.configurations = configurations;
	}
}
