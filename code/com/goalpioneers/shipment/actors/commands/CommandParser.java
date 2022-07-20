/**
 * Author: Goal Pioneers, Kent v. Madsen
 * Contact: Kent.vejrup.madsen@goalpioneers.com
 * Company: Goal-Pioneers, 41157089
 * Links
 ** License: MIT License(https://github.com/GoalPioneers/Shipment/blob/main/LICENSE.md)
 ** Issues: https://github.com/GoalPioneers/Shipment/issues
 */
package com.goalpioneers.shipment.actors.commands;

import com.goalpioneers.shipment.actors.commands.templates.CommandParserFacade;
import com.goalpioneers.shipment.domain.templates.DomainFacade;


/**
 * @author Kent v. Madsen
 * @author Goal Pioneers
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
		this.setInterpreter( 
			new CommandInterpreter() 
		);
		
		this.setState( domain );
	}
	
	
	//
	/**
	 * 
	 */
	private DomainFacade state = null;
	
	/**
	 * 
	 */
	private CommandInterpreter interpreter = null;
	
	
	//
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
	public CommandInterpreter getInterpreter() 
	{
		return this.interpreter;
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
