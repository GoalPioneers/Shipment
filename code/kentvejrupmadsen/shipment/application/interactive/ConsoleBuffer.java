package kentvejrupmadsen.shipment.application.interactive;

/**
 * 
 */
public class ConsoleBuffer 
        implements InteractionBuffer
{
    /**
     * 
     * @param line
     */
    @Override
    public void append( String line ) 
    {
        
    }
    
    
    /**
     * 
     * @param lines
     */
    @Override
    public void appendArray( String[] lines ) 
    {
        
    }
    
    
    /**
     * 
     * @param idx
     * @param widthLine
     */
    @Override
    public void update( int idx, String widthLine ) 
    {
        
    }
    
    
    /**
     * 
     * @param idx
     * @return
     */
    @Override
    public boolean delete( int idx ) 
    {
        return false;
    }
    
    
    /**
     * 
     * @return
     */
    @Override
    public int size()
    {
        return 0;
    }
    
    
    /**
     * 
     * @return
     */
    @Override
    public boolean refresh()
    {
        return false;
    }
}
