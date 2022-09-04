package com.goalpioneers.shipment.facade.setup.arguments;

import com.goalpioneers.shipment.domain.Application;
import com.goalpioneers.shipment.facade.setup.SetupFacade;


public class SetupByArguments
    extends SetupFacade
{
    public SetupByArguments()
    {
        super( null );
        this.setName( "Setup by Arguments" );
        this.setPriority( 1 );
    }
    
    public SetupByArguments( Application application )
    {
        super( application );
        this.setName( "Setup by Arguments" );
    }
    
    @Override
    public boolean setup()
    {
        return true;
    }
}
