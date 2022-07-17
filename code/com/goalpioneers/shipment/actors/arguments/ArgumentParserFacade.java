package com.goalpioneers.shipment.actors.arguments;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
 */
public interface ArgumentParserFacade 
{
	/**
	 * 
	 * @param arguments
	 */
	public void insertArguments( String[] arguments );
	
	/**
	 * 
	 */
	public void parse();
	
	/**
	 * 
	 */
	public void setup();
}
