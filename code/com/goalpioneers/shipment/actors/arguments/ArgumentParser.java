package com.goalpioneers.shipment.actors.arguments;

import java.util.ArrayList;
import java.util.List;

import com.goalpioneers.shipment.domain.DomainFacade;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
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
		
		this.setArguments( 
			new ArrayList<>() 
		);
		
		this.setInterpreter( 
			new ArgumentInterpreter() 
		);
	}
	
	
	// Variables
	/**
	 * 
	 */
	private DomainFacade state = null;
	
	/**
	 * 
	 */
	private ArgumentInterpreter interpreter = null;
	
	/**
	 * 
	 */
	private List<Argument> arguments = null;
	
	
	// Code
	/**
	 * 
	 * @param arguments
	 */
	@Override
	public void insertArguments( String[] arguments ) 
	{
		
	}
	
	/**
	 * 
	 */
	@Override
	public void parse() 
	{
		
	}
	
	/**
	 * 
	 */
	@Override
	public void setup() 
	{
		
	}
	
	
	// Accessors
	/**
	 * 
	 * @return
	 */
	public DomainFacade getState() 
	{
		return this.state;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArgumentInterpreter getInterpreter() 
	{
		return this.interpreter;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Argument> getArguments() 
	{
		return this.arguments;
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
	
	/**
	 * 
	 * @param arguments
	 */
	public void setArguments( List<Argument> arguments ) 
	{
		this.arguments = arguments;
	}
}
