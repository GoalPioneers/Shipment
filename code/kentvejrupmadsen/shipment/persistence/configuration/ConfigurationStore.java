package kentvejrupmadsen.shipment.persistence.configuration;

import kentvejrupmadsen.shipment.StateController;
import kentvejrupmadsen.shipment.persistence.configuration.template.ConfigurationEntity;
import kentvejrupmadsen.shipment.persistence.configuration.template.StoreFacade;


/**
 * Configuration Store. Manages configuration for the application
 * @author Kent Madsen
 */
public class ConfigurationStore
        implements StoreFacade
{
    // Code / Constructors
    /**
     * @author Kent Madsen
     */
    public ConfigurationStore()
    {
        
    }
    
    
    // Variables
    //
    private static StoreFacade configuration = null;
    
    
    // setups the application state
    private StateController state = null;
    
    
    
    // Code
    /**
     * Configuration setup, set the necessary components up and assert the application state.
     * @author Kent Madsen
     */
    @Override
    public boolean configure()
    {
        return false;
    }
    
    
    /**
     *
     * @param idx
     * @return
     */
    @Override
    public ConfigurationEntity retrieveById( int idx )
    {
        return null;
    }
    
    
    /**
     *
     * @param name
     * @return
     */
    @Override
    public ConfigurationEntity retrieveByName( String name )
    {
        return null;
    }
    
    
    /**
     *
     * @param entity
     * @return
     */
    @Override
    public boolean add( ConfigurationEntity entity )
    {
        return false;
    }
    
    
    /**
     *
     * @param entity
     * @return
     */
    @Override
    public boolean remove( ConfigurationEntity entity )
    {
        return false;
    }
    
    
    /**
     *
     * @param A
     * @param B
     * @return
     */
    @Override
    public boolean compare( ConfigurationEntity A,
                            ConfigurationEntity B )
    {
        return false;
    }
    
    
    /**
     * 
     * @return
     */
    @Override
    public boolean optimize() 
    {
        return false;
    }
    
    
    // Accessors
    /**
     * @author Kent Madsen
     */
    @Override
    public void setStateController( StateController controller )
    {
        this.state = controller;
    }
    
    
    /**
     * @author Kent Madsen
     */
    public StateController getState()
    {
        return state;
    }
    
    
    /**
     * @author Kent Madsen
     * @return Configuration Store
     */
    public static StoreFacade getConfiguration()
    {
        if( ConfigurationStore.configuration == null )
        {
            ConfigurationStore.setConfiguration(
                    new ConfigurationStore() );
        }
        
        return configuration;
    }
    
    
    /**
     * @author Kent Madsen
     * @param configuration
     */
    protected static void setConfiguration( ConfigurationStore configuration )
    {
        ConfigurationStore.configuration = configuration;
    }
}