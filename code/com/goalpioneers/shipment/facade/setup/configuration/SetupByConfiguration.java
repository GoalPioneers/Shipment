package com.goalpioneers.shipment.facade.setup.configuration;


import com.goalpioneers.shipment.domain.Application;
import com.goalpioneers.shipment.facade.setup.SetupFacade;


public class SetupByConfiguration
    extends SetupFacade
{
    public SetupByConfiguration( Application application )
    {
        super( application );
        this.setPriority( 0 );
    }
    
    @Override
    public boolean setup()
    {
        return false;
    }
}
