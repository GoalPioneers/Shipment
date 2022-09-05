package main.java.com.goalpioneers.shipment.facade.setup;

import main.java.com.goalpioneers.shipment.domain.Application;


public abstract class SetupFacade
    implements Comparable<SetupFacade>
{
    public SetupFacade()
    {
        this( null );
    }
    
    public SetupFacade( Application application)
    {
        this.setApplication( application );
    }
    
    
    // Extend
    public abstract boolean setup();

    
    // Variables
    private String name = "SetupFacade";
    
    private Application application;
    
    private int priority = 0;
    private boolean isDone = false;
    
    
    // Accessors
    public final String getName()
    {
        return this.name;
    }
    
    protected final void setName( String name )
    {
        this.name = name;
    }
    
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
    
    /**
     *
     * @return
     */
    public boolean isDone()
    {
        return this.isDone;
    }
    
    
    /**
     *
     * @param done
     */
    public void setDone( boolean done )
    {
        isDone = done;
    }
    
    //
    /**
     *
     * @param next the object to be compared.
     * @return
     */
    @Override
    public int compareTo( SetupFacade next )
    {
        return Integer.compare( this.getPriority(),
                                next.getPriority() );
    }
    
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        return super.toString();
    }
}
