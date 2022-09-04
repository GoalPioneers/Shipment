package com.goalpioneers.shipment.facade.setup;

import com.goalpioneers.shipment.domain.Application;


public abstract class SetupFacade
    implements Comparable<SetupFacade>
{
    public SetupFacade()
    {
        this( null );
    }
    
    public SetupFacade( Application application )
    {
        this.setApplication( application );
    }
    
    // Extend
    public abstract boolean setup();

    
    // Variables
    private Application application;
    
    private int priority = 0;
    
    
    // Accessors
    /**
     *
     * @return
     */
    public final int getPriority()
    {
        return this.priority;
    }
    
    /**
     *
     * @param priority
     */
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
        return this.application;
    }

    /**
     *
     * @param application
     */
    public final void setApplication( Application application )
    {
        this.application = application;
    }
    
    //
    /**
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo( SetupFacade o )
    {
        return 0;
    }
}
