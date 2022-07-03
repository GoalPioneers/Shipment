package kentvejrupmadsen.shipment.application.processes.execute;

import kentvejrupmadsen.shipment.application.commands.ExecuteCommand;
import kentvejrupmadsen.shipment.application.interactive.Interaction;


/**
 * @author Kent Madsen
 */
public class EncodeProcess
        extends ExecuteCommand
{
    /**
     * @author Kent Madsen
     */
    public EncodeProcess( Interaction actor )
    {
        super( "encode", actor );
    }
}
