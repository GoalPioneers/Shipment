package com.goalpioneers.shipment.io.commands;


import com.goalpioneers.shipment.domain.ActorFacade;
import com.goalpioneers.shipment.domain.DomainFacade;


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
