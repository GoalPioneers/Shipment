package kentvejrupmadsen.shipment.application.processes.informative;

import kentvejrupmadsen.shipment.application.commands.InformativeCommand;
import kentvejrupmadsen.shipment.application.interactive.Interaction;


public class LicenseCommand 
        extends InformativeCommand
{
    public LicenseCommand( Interaction actor )
    {
        super("license", actor );
    }
}
