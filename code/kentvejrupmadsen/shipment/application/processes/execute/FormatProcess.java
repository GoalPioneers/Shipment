package kentvejrupmadsen.shipment.application.processes.execute;

import kentvejrupmadsen.shipment.application.commands.ExecuteCommand;
import kentvejrupmadsen.shipment.application.interactive.Interaction;


/**
 * @author Kent Madsen
 */
public class FormatProcess
		extends ExecuteCommand
{
	/**
	 * @author Kent Madsen
	 */
	public FormatProcess( Interaction actor )
	{
		super("format", actor );
	}
}
