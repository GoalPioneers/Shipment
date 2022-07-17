package com.goalpioneers.shipment.actors.arguments;

import com.goalpioneers.shipment.domain.ActorFacade;
import com.goalpioneers.shipment.domain.DomainFacade;

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
