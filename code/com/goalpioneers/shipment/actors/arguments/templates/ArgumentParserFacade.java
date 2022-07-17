/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.shipment.actors.arguments.templates;


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
