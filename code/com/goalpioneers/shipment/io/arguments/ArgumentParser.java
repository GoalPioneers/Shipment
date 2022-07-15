package com.goalpioneers.shipment.io.arguments;

import com.goalpioneers.shipment.domain.DomainFacade;


/**
 * 
 */
public class ArgumentParser 
	implements ArgumentParserFacade
{
	/**
	 * 
	 * @param state
	 */
	public ArgumentParser( DomainFacade state )
	{
		this.setState( state );
		
		this.setInterpreter( 
				new ArgumentInterpreter() 
		);
	}
	
	
	// Variables
	private DomainFacade state = null;
	
	private ArgumentInterpreter interpreter = null;
	
	
	// Accessors
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
	public ArgumentInterpreter getInterpreter() 
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
	public void setInterpreter( ArgumentInterpreter interpreter )
	{
		this.interpreter = interpreter;
	}
}
