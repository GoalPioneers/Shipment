package com.goalpioneers.shipment.io.commands;

import com.goalpioneers.shipment.domain.DomainFacade;


public class CommandParser 
	implements CommandParserFacade
{
	public CommandParser( DomainFacade domain )
	{
		this.setState( domain );
	}
	
	private DomainFacade state = null;
	
	public DomainFacade getState() 
	{
		return state;
	}
	
	public void setState( DomainFacade state ) 
	{
		this.state = state;
	}
}
