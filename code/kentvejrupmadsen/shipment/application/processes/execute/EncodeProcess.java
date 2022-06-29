package kentvejrupmadsen.shipment.application.processes.execute;

import kentvejrupmadsen.shipment.application.commands.ExecuteCommand;

/**
 * @author Kent Madsen
 */
public class EncodeProcess
        extends ExecuteCommand
{
    public EncodeProcess()
    {
        super( "encode" );
    }
}
