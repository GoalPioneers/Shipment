/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.shipment.actors.commands;


import com.goalpioneers.shipment.actors.commands.templates.CommandParserFacade;
import com.goalpioneers.shipment.domain.templates.ActorFacade;
import com.goalpioneers.shipment.domain.templates.DomainFacade;


/**
 * 
 */
public class CommandConsoleActor
	implements ActorFacade
{
	/**
	 * 
	 * @param state
	 */
	public CommandConsoleActor( DomainFacade state )
	{
		this.setParser(
			new CommandParser( state ) 
		);
		
		
		this.setToRun( false );
		
		if(System.console() == null)
		{
		}
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
		return this.isToRun;
	}
	
	
	// Variables
	/**
	 * 
	 */
	private CommandParserFacade parser = null;
	
	/**
	 * 
	 */
	private boolean isToRun = true;
	
	
	//
	/**
	 * 
	 * @return
	 */
	public CommandParserFacade getParser() 
	{
		return this.parser;
	}
	
	/**
	 * 
	 * @param parser
	 */
	public void setParser( CommandParserFacade parser ) 
	{
		this.parser = parser;
	}
	
	/**
	 * 
	 * @param toRun
	 */
	public void setToRun( boolean toRun ) 
	{
		this.isToRun = toRun;
	}
}
