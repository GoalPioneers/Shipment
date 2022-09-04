package com.goalpioneers.shipment.facade.setup.cache;


import com.goalpioneers.shipment.domain.Application;
import com.goalpioneers.shipment.facade.setup.SetupFacade;


public class SetupByCache
    extends SetupFacade
{
    public SetupByCache( Application application )
    {
        super( application );
        this.setPriority( 2 );
    }
    
    @Override
    public boolean setup()
    {
        return false;
    }
}
