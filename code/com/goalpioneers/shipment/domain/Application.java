package com.goalpioneers.shipment.domain;


import com.goalpioneers.shipment.io.arguments.ArgumentParser;
import com.goalpioneers.shipment.io.arguments.ArgumentParserFacade;

import com.goalpioneers.shipment.io.commands.CommandConsole;
import com.goalpioneers.shipment.io.commands.CommandParser;
import com.goalpioneers.shipment.io.commands.CommandParserFacade;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
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
	}
	
	
	// Variables
	/**
	 * 
	 */
	private DomainFacade domainState;
	
	/**
	 * 
	 */
	private CommandConsole console;
	
	
	// Code
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
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public DomainFacade getDomainState() 
	{
		return domainState;
	}
	
	/**
	 * 
	 * @param domainState
	 */
	public void setDomainState( DomainFacade domainState ) 
	{
		this.domainState = domainState;
	}
	
	/**
	 * 
	 * @return
	 */
	public CommandConsole getConsole() 
	{
		return console;
	}
	
	
	/**
	 * 
	 * @param console
	 */
	public void setConsole( CommandConsole console ) 
	{
		this.console = console;
	}
}
