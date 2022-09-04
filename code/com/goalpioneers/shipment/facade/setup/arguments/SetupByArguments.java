package com.goalpioneers.shipment.facade.setup.arguments;

import com.goalpioneers.shipment.domain.Application;
import com.goalpioneers.shipment.facade.setup.SetupFacade;


public class SetupByArguments
    extends SetupFacade
{
    public SetupByArguments( Application app )
    {
        super( app );
        this.setPriority( 1 );
    }
    
    @Override
    public boolean setup()
    {
        return false;
    }
}
