package kentvejrupmadsen.shipment.application.interactive;


/**
 * 
 */
public interface InteractionBuffer 
{
    /**
     * 
     * @param line
     */
    void append( String line );
    
    
    /**
     * 
     * @param lines
     */
    void appendArray( String[] lines );
    
    
    /**
     * 
     * @param idx
     * @param widthLine
     */
    void update( int idx, String widthLine );
    
    
    /**
     * 
     * @param idx
     * @return
     */
    boolean delete( int idx );
    
    /**
     * 
     * @return
     */
    int size();
    
    /**
     * 
     * @return
     */
    boolean refresh();
}
