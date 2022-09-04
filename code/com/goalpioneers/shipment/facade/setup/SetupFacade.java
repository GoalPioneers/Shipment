package com.goalpioneers.shipment.facade.setup;

import com.goalpioneers.shipment.domain.Application;


public abstract class SetupFacade
    implements Comparable<SetupFacade>
{
    public SetupFacade( Application application )
    {
        this.setApplication( application );
    }
    
    public abstract boolean setup();

    // Variables
    private Application application = null;
    
    private int priority = 0;
    
    
    public final int getPriority()
    {
        return priority;
    }
    
    protected final void setPriority( int priority )
    {
        this.priority = priority;
    }
    
    /**
     *
     * @return
     */
    public final Application getApplication()
    {
        return application;
    }

    /**
     *
     * @param application
     */
    public final void setApplication( Application application )
    {
        this.application = application;
    }
    
    @Override
    public int compareTo( SetupFacade o )
    {
        return 0;
    }
}
