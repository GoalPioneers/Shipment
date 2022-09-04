package com.goalpioneers.shipment.facade.setup.arguments;

import com.goalpioneers.shipment.domain.Application;
import com.goalpioneers.shipment.facade.setup.SetupFacade;


public class SetupByArguments
    extends SetupFacade
{
    public SetupByArguments()
    {
        super( null );
        this.setPriority( 1 );
    }
    
    public SetupByArguments( Application application )
    {
        super( application );
    }
    
    @Override
    public boolean setup()
    {
        return false;
    }
}
