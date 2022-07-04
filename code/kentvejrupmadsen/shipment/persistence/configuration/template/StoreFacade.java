package kentvejrupmadsen.shipment.persistence.configuration.template;


import kentvejrupmadsen.shipment.StateController;


/**
 * @author Kent Madsen
 */
public interface StoreFacade
{
    /**
     * @author Kent Madsen
     */
    void setStateController( StateController controller );
    
    
    /**
     * Setups the default structure of the application
     * @author Kent Madsen
     */
    boolean configure();
    
    
    // store features
    /**
     * 
     * @param idx
     * @return
     */
    ConfigurationEntity retrieveById( int idx );
    
    
    /**
     * 
     * @param name
     * @return
     */
    ConfigurationEntity retrieveByName( String name );
    
    
    /**
     * 
     * @param entity
     * @return
     */
    boolean add( ConfigurationEntity entity );
    
    
    /**
     * 
     * @param entity
     * @return
     */
    boolean remove( ConfigurationEntity entity );
    
    
    /**
     * Compares two configuration entities to see if there is the same
     * @param A
     * @param B
     * @return
     */
    boolean compare( ConfigurationEntity A, 
                     ConfigurationEntity B );
    
    
    /**
     * 
     * @return If it completed the task
     */
    boolean optimize();
    
}
