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
		this.setState( domain );
	}
	
	//
	private DomainFacade state = null;
	
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
	 * @param state
	 */
	public void setState( DomainFacade state ) 
	{
		this.state = state;
	}
}
