package com.goalpioneers.shipment.io.commands;


import com.goalpioneers.shipment.domain.DomainState;


/**
 * 
 */
public class CommandConsole 
{
	/**
	 * 
	 * @param state
	 */
	public CommandConsole( DomainState state )
	{
		this.setParser(
			new CommandParser( state ) 
		);
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
	 * @return
	 */
	public boolean isToRun() 
	{
		return this.isToRun;
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
