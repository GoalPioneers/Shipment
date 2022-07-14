package kentvejrupmadsen.shipment.application.processes.execute;

import kentvejrupmadsen.shipment.application.commands.ExecuteCommand;
import kentvejrupmadsen.shipment.application.interactive.Interaction;


/**
 * @author Kent Madsen
 */
public class SearchProcess
		extends ExecuteCommand
{
	/**
	 * @author Kent Madsen
	 */
	public SearchProcess( Interaction actor )
	{
		super("search", actor );
	}
	
}