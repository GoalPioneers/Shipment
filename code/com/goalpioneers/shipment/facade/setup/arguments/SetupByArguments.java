package com.goalpioneers.shipment.facade.setup.arguments;

import com.goalpioneers.shipment.domain.Application;
import com.goalpioneers.shipment.facade.setup.SetupFacade;


public class SetupByArguments
    extends SetupFacade
{
    public SetupByArguments( String[] arguments )
    {
        super( null );
        this.setName( "Setup by Arguments" );
        this.setPriority( 1 );
    }
    
    public SetupByArguments( Application application,
                             String[] Arguments )
    {
        super( application );
        this.setName( "Setup by Arguments" );
    }
    
    // Variables
    private String[] arguments = null;
    
    
    /**
     *
     * @return
     */
    @Override
    public final boolean setup()
    {
        return this.isDone();
    }
    
    
    // Accessors
    public final String[] getArguments()
    {
        return this.arguments;
    }
    
    public final void setArguments( String[] arguments )
    {
        this.arguments = arguments;
    }
}
