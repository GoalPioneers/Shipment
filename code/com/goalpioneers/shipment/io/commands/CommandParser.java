package com.goalpioneers.shipment.io.commands;

import com.goalpioneers.shipment.domain.DomainFacade;


/**
 * 
 */
public class CommandParser 
	implements CommandParserFacade
{
	/**
	 * 
	 * @param domain
	 */
	public CommandParser( DomainFacade domain )
	{
		this.setInterpreter( new CommandInterpreter() );
		this.setState( domain );
	}
	
	//
	private DomainFacade state = null;
	
	private CommandInterpreter interpreter = null;
	
	//
	/**
	 * 
	 * @return
	 */
	public DomainFacade getState() 
	{
		return state;
	}
	
	/**
	 * 
	 * @return
	 */
	public CommandInterpreter getInterpreter() 
	{
		return interpreter;
	}
	
	/**
	 * 
	 * @param state
	 */
	public void setState( DomainFacade state ) 
	{
		this.state = state;
	}
	
	/**
	 * 
	 * @param interpreter
	 */
	public void setInterpreter( CommandInterpreter interpreter ) 
	{
		this.interpreter = interpreter;
	}
}
