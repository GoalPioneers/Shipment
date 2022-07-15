package com.goalpioneers.shipment.io.arguments;

import com.goalpioneers.shipment.domain.DomainFacade;


public class ArgumentParser 
	implements ArgumentParserFacade
{
	public ArgumentParser( DomainFacade state )
	{
		this.setState( state );
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
