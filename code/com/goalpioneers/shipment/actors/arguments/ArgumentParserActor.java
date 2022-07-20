/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.shipment.actors.arguments;

import com.goalpioneers.shipment.domain.templates.ActorFacade;
import com.goalpioneers.shipment.domain.templates.DomainFacade;


/**
 * 
 */
public class ArgumentParserActor 
	implements ActorFacade 
{
	/**
	 * 
	 * @param state
	 */
	public ArgumentParserActor( DomainFacade state )
	{
		this.setParser(
			new ArgumentParser( state ) 
		);
	}
	
	// Variables
	private ArgumentParser parser = null; 
	
	
	// Code
	public void insertArguments( String[] arguments )
	{
		this.getParser().insertArguments( arguments );
	}
	
	/**
	 * 
	 */
	@Override
	public void run() 
	{
		
	}
	
	/**
	 * 
	 * @return
	 */
	@Override
	public boolean isToRun() 
	{
		return false;
	}
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public ArgumentParser getParser() 
	{
		return parser;
	}
	
	/**
	 * 
	 * @param parser
	 */
	public void setParser( ArgumentParser parser ) 
	{
		this.parser = parser;
	}
}
