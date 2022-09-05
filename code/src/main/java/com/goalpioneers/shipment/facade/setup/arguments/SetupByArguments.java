package main.java.com.goalpioneers.shipment.facade.setup.arguments;

import main.java.com.goalpioneers.shipment.domain.Application;
import main.java.com.goalpioneers.shipment.facade.setup.SetupFacade;


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
        this.setPriority( 1 );
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
    /**
     *
     * @return
     */
    public final String[] getArguments()
    {
        return this.arguments;
    }
    
    /**
     *
     * @param arguments
     */
    public final void setArguments( String[] arguments )
    {
        this.arguments = arguments;
    }
}
