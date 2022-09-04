package com.goalpioneers.shipment.facade.setup.configuration;


import com.goalpioneers.shipment.domain.Application;
import com.goalpioneers.shipment.facade.setup.SetupFacade;


public class SetupByConfiguration
    extends SetupFacade
{
    public SetupByConfiguration()
    {
        super( null );
        this.setName( "Setup by Configuration" );
        this.setPriority( 0 );
    }
    
    public SetupByConfiguration( Application application )
    {
        super( application );
        this.setName( "Setup by Configuration" );
        this.setPriority( 0 );
    }
    
    
    /**
     *
     * @return
     */
    @Override
    public final boolean setup()
    {
        return this.isDone();
    }
}
