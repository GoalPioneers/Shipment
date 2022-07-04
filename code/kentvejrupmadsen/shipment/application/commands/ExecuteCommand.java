package kentvejrupmadsen.shipment.application.commands;

import kentvejrupmadsen.shipment.application.interactive.Interaction;


/**
 * @author Kent Madsen
 */
public abstract class ExecuteCommand
		extends CommandProcess
{
	/**
	 * @author Kent Madsen
	 * @param commandName
	 * @param actor
	 */
	public ExecuteCommand( String commandName,
	                       Interaction actor )
	{
		super( actor );
		this.setName( commandName );
	}
}
