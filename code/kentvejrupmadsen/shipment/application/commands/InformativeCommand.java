package kentvejrupmadsen.shipment.application.commands;

import kentvejrupmadsen.shipment.application.interactive.Interaction;


/**
 * @author Kent Madsen
 */
public abstract class InformativeCommand
		extends CommandProcess
{
	/**
	 * @author Kent Madsen
	 * @param commandName
	 * @param actor
	 */
	public InformativeCommand( String commandName,
	                           Interaction actor  )
	{
		super( actor );
		this.setName( commandName );
	}
	
}
