package com.goalpioneers.shipment.domain;


import com.goalpioneers.shipment.io.arguments.ArgumentParser;
import com.goalpioneers.shipment.io.arguments.ArgumentParserFacade;

import com.goalpioneers.shipment.io.commands.CommandParser;
import com.goalpioneers.shipment.io.commands.CommandParserFacade;


/**
 * 
 */
public class Application 
{
	/**
	 * 
	 */
	public Application()
	{
		this.setDomainState(
				new DomainState() 
		);
		
		this.setCommandFacade( 
				new CommandParser( 
						this.getDomainState() 
				)
		);
		
		this.setArgumentFacade(
				new ArgumentParser( 
						this.getDomainState() 
				)
		);
	}
	
	
	//
	/**
	 * 
	 */
	public void initialise()
	{
		
	}
	
	/**
	 * 
	 */
	public void execute()
	{
		
	}
	
	/**
	 * 
	 */
	public void gc()
	{
		
	}
	
	
	// Variables
	private DomainFacade domainState;
	
	private ArgumentParserFacade argumentFacade = null;
	
	private CommandParserFacade commandFacade = null;
	
	
	// Accessors
	public DomainFacade getDomainState() 
	{
		return domainState;
	}
	
	public ArgumentParserFacade getArgumentFacade() 
	{
		return argumentFacade;
	}
	
	public CommandParserFacade getCommandFacade() 
	{
		return commandFacade;
	}
	
	public void setDomainState( DomainFacade domainState ) 
	{
		this.domainState = domainState;
	}
	
	public void setArgumentFacade( ArgumentParserFacade argumentFacade ) 
	{
		this.argumentFacade = argumentFacade;
	}
	
	public void setCommandFacade( CommandParserFacade commandFacade ) 
	{
		this.commandFacade = commandFacade;
	}
}
